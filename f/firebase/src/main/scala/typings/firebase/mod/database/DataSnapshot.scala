package typings.firebase.mod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DataSnapshot` contains data from a Database location.
  *
  * Any time you read data from the Database, you receive the data as a
  * `DataSnapshot`. A `DataSnapshot` is passed to the event callbacks you attach
  * with `on()` or `once()`. You can extract the contents of the snapshot as a
  * JavaScript object by calling the `val()` method. Alternatively, you can
  * traverse into the snapshot by calling `child()` to return child snapshots
  * (which you could then call `val()` on).
  *
  * A `DataSnapshot` is an efficiently generated, immutable copy of the data at
  * a Database location. It cannot be modified and will never change (to modify
  * data, you always call the `set()` method on a `Reference` directly).
  *
  */
trait DataSnapshot extends js.Object {
  /**
    * The key (last part of the path) of the location of this `DataSnapshot`.
    *
    * The last token in a Database location is considered its key. For example,
    * "ada" is the key for the /users/ada/ node. Accessing the key on any
    * `DataSnapshot` will return the key for the location that generated it.
    * However, accessing the key on the root URL of a Database will return `null`.
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var key = snapshot.key; // "ada"
    *     var childKey = snapshot.child("name/last").key; // "last"
    *   });
    * ```
    *
    * @example
    * ```javascript
    * var rootRef = firebase.database().ref();
    * rootRef.once("value")
    *   .then(function(snapshot) {
    *     var key = snapshot.key; // null
    *     var childKey = snapshot.child("users/ada").key; // "ada"
    *   });
    * ```
    */
  var key: String | Null
  /**
    * The `Reference` for the location that generated this `DataSnapshot`.
    */
  var ref: Reference
  /**
    * Gets another `DataSnapshot` for the location at the specified relative path.
    *
    * Passing a relative path to the `child()` method of a DataSnapshot returns
    * another `DataSnapshot` for the location at the specified relative path. The
    * relative path can either be a simple child name (for example, "ada") or a
    * deeper, slash-separated path (for example, "ada/name/first"). If the child
    * location has no data, an empty `DataSnapshot` (that is, a `DataSnapshot`
    * whose value is `null`) is returned.
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * // Test for the existence of certain keys within a DataSnapshot
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var name = snapshot.child("name").val(); // {first:"Ada",last:"Lovelace"}
    *     var firstName = snapshot.child("name/first").val(); // "Ada"
    *     var lastName = snapshot.child("name").child("last").val(); // "Lovelace"
    *     var age = snapshot.child("age").val(); // null
    *   });
    * ```
    *
    * @param path A relative path to the location of child data.
    */
  def child(path: String): DataSnapshot
  /**
    * Returns true if this `DataSnapshot` contains any data. It is slightly more
    * efficient than using `snapshot.val() !== null`.
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * // Test for the existence of certain keys within a DataSnapshot
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var a = snapshot.exists();  // true
    *     var b = snapshot.child("name").exists(); // true
    *     var c = snapshot.child("name/first").exists(); // true
    *     var d = snapshot.child("name/middle").exists(); // false
    *   });
    * ```
    */
  def exists(): Boolean
  /**
    * Exports the entire contents of the DataSnapshot as a JavaScript object.
    *
    * The `exportVal()` method is similar to `val()`, except priority information
    * is included (if available), making it suitable for backing up your data.
    *
    * @return The DataSnapshot's contents as a JavaScript value (Object,
    *   Array, string, number, boolean, or `null`).
    */
  def exportVal(): js.Any
  /**
    * Enumerates the top-level children in the `DataSnapshot`.
    *
    * Because of the way JavaScript objects work, the ordering of data in the
    * JavaScript object returned by `val()` is not guaranteed to match the ordering
    * on the server nor the ordering of `child_added` events. That is where
    * `forEach()` comes in handy. It guarantees the children of a `DataSnapshot`
    * will be iterated in their query order.
    *
    * If no explicit `orderBy*()` method is used, results are returned
    * ordered by key (unless priorities are used, in which case, results are
    * returned by priority).
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "users": {
    *     "ada": {
    *       "first": "Ada",
    *       "last": "Lovelace"
    *     },
    *     "alan": {
    *       "first": "Alan",
    *       "last": "Turing"
    *     }
    *   }
    * }
    *
    * // Loop through users in order with the forEach() method. The callback
    * // provided to forEach() will be called synchronously with a DataSnapshot
    * // for each child:
    * var query = firebase.database().ref("users").orderByKey();
    * query.once("value")
    *   .then(function(snapshot) {
    *     snapshot.forEach(function(childSnapshot) {
    *       // key will be "ada" the first time and "alan" the second time
    *       var key = childSnapshot.key;
    *       // childData will be the actual contents of the child
    *       var childData = childSnapshot.val();
    *   });
    * });
    * ```
    *
    * @example
    * ```javascript
    * // You can cancel the enumeration at any point by having your callback
    * // function return true. For example, the following code sample will only
    * // fire the callback function one time:
    * var query = firebase.database().ref("users").orderByKey();
    * query.once("value")
    *   .then(function(snapshot) {
    *     snapshot.forEach(function(childSnapshot) {
    *       var key = childSnapshot.key; // "ada"
    *
    *       // Cancel enumeration
    *       return true;
    *   });
    * });
    * ```
    *
    * @param action A function
    *   that will be called for each child DataSnapshot. The callback can return
    *   true to cancel further enumeration.
    * @return true if enumeration was canceled due to your callback
    *   returning true.
    */
  def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean
  /**
    * Gets the priority value of the data in this `DataSnapshot`.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
    *  Sorting and filtering data}).
    */
  def getPriority(): String | Double | Null
  /**
    * Returns true if the specified child path has (non-null) data.
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * // Determine which child keys in DataSnapshot have data.
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var hasName = snapshot.hasChild("name"); // true
    *     var hasAge = snapshot.hasChild("age"); // false
    *   });
    * ```
    *
    * @param path A relative path to the location of a potential child.
    * @return `true` if data exists at the specified child path; else
    *  `false`.
    */
  def hasChild(path: String): Boolean
  /**
    * Returns whether or not the `DataSnapshot` has any non-`null` child
    * properties.
    *
    * You can use `hasChildren()` to determine if a `DataSnapshot` has any
    * children. If it does, you can enumerate them using `forEach()`. If it
    * doesn't, then either this snapshot contains a primitive value (which can be
    * retrieved with `val()`) or it is empty (in which case, `val()` will return
    * `null`).
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var a = snapshot.hasChildren(); // true
    *     var b = snapshot.child("name").hasChildren(); // true
    *     var c = snapshot.child("name/first").hasChildren(); // false
    *   });
    * ```
    *
    * @return true if this snapshot has any children; else false.
    */
  def hasChildren(): Boolean
  /**
    * Returns the number of child properties of this `DataSnapshot`.
    *
    * @example
    * ```javascript
    * // Assume we have the following data in the Database:
    * {
    *   "name": {
    *     "first": "Ada",
    *     "last": "Lovelace"
    *   }
    * }
    *
    * var ref = firebase.database().ref("users/ada");
    * ref.once("value")
    *   .then(function(snapshot) {
    *     var a = snapshot.numChildren(); // 1 ("name")
    *     var b = snapshot.child("name").numChildren(); // 2 ("first", "last")
    *     var c = snapshot.child("name/first").numChildren(); // 0
    *   });
    * ```
    */
  def numChildren(): Double
  /**
    * Returns a JSON-serializable representation of this object.
    */
  def toJSON(): js.Object | Null
  /**
    * Extracts a JavaScript value from a `DataSnapshot`.
    *
    * Depending on the data in a `DataSnapshot`, the `val()` method may return a
    * scalar type (string, number, or boolean), an array, or an object. It may also
    * return null, indicating that the `DataSnapshot` is empty (contains no data).
    *
    * @example
    * ```javascript
    * // Write and then read back a string from the Database.
    * ref.set("hello")
    *   .then(function() {
    *     return ref.once("value");
    *   })
    *   .then(function(snapshot) {
    *     var data = snapshot.val(); // data === "hello"
    *   });
    * ```
    *
    * @example
    * ```javascript
    * // Write and then read back a JavaScript object from the Database.
    * ref.set({ name: "Ada", age: 36 })
    *   .then(function() {
    *    return ref.once("value");
    *   })
    *   .then(function(snapshot) {
    *     var data = snapshot.val();
    *     // data is { "name": "Ada", "age": 36 }
    *     // data.name === "Ada"
    *     // data.age === 36
    *   });
    * ```
    *
    * @return The DataSnapshot's contents as a JavaScript value (Object,
    *   Array, string, number, boolean, or `null`).
    */
  def `val`(): js.Any
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: String => DataSnapshot,
    exists: () => Boolean,
    exportVal: () => js.Any,
    forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
    getPriority: () => String | Double | Null,
    hasChild: String => Boolean,
    hasChildren: () => Boolean,
    numChildren: () => Double,
    ref: Reference,
    toJSON: () => js.Object | Null,
    `val`: () => js.Any,
    key: String = null
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[DataSnapshot]
  }
}

