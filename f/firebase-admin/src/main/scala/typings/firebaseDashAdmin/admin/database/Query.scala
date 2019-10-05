package typings.firebaseDashAdmin.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Query` sorts and filters the data at a Database location so only a subset
  * of the child data is included. This can be used to order a collection of
  * data by some attribute (for example, height of dinosaurs) as well as to
  * restrict a large list of items (for example, chat messages) down to a number
  * suitable for synchronizing to the client. Queries are created by chaining
  * together one or more of the filter methods defined here.
  *
  * Just as with a `Reference`, you can receive data from a `Query` by using the
  * `on()` method. You will only receive events and `DataSnapshot`s for the
  * subset of the data that matches your query.
  *
  * See
  * {@link
  *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
  *  Sorting and filtering data} for more information.
  */
@js.native
trait Query extends js.Object {
  var ref: Reference = js.native
  def endAt(): Query = js.native
  def endAt(value: String): Query = js.native
  def endAt(value: String, key: String): Query = js.native
  def endAt(value: Boolean): Query = js.native
  def endAt(value: Boolean, key: String): Query = js.native
  /**
    * Creates a `Query` with the specified ending point.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows you to choose arbitrary
    * starting and ending points for your queries.
    *
    * The ending point is inclusive, so children with exactly the specified value
    * will be included in the query. The optional key argument can be used to
    * further limit the range of the query. If it is specified, then children that
    * have exactly the specified value must also have a key name less than or equal
    * to the specified key.
    *
    * You can read more about `endAt()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find all dinosaurs whose names come before Pterodactyl lexicographically.
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByKey().endAt("pterodactyl").on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param value The value to end at. The argument
    *   type depends on which `orderBy*()` function was used in this query.
    *   Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param key The child key to end at, among the children with the
    *   previously specified priority. This argument is only allowed if ordering by
    *   priority.
    * @return A new `Query` object.
    */
  def endAt(value: Double): Query = js.native
  def endAt(value: Double, key: String): Query = js.native
  def endAt(value: Null, key: String): Query = js.native
  def equalTo(): Query = js.native
  def equalTo(value: String): Query = js.native
  def equalTo(value: String, key: String): Query = js.native
  def equalTo(value: Boolean): Query = js.native
  def equalTo(value: Boolean, key: String): Query = js.native
  /**
    * Creates a `Query` that includes children that match the specified value.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows us to choose arbitrary
    * starting and ending points for our queries.
    *
    * The optional key argument can be used to further limit the range of the
    * query. If it is specified, then children that have exactly the specified
    * value must also have exactly the specified key as their key name. This can be
    * used to filter result sets with many matches for the same value.
    *
    * You can read more about `equalTo()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * // Find all dinosaurs whose height is exactly 25 meters.
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByChild("height").equalTo(25).on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    *
    * @param value The value to match for. The
    *   argument type depends on which `orderBy*()` function was used in this
    *   query. Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param key The child key to start at, among the children with the
    *   previously specified priority. This argument is only allowed if ordering by
    *   priority.
    * @return A new `Query` object.
    */
  def equalTo(value: Double): Query = js.native
  def equalTo(value: Double, key: String): Query = js.native
  def equalTo(value: Null, key: String): Query = js.native
  def isEqual(): Boolean = js.native
  /**
    * Returns whether or not the current and provided queries represent the same
    * location, have the same query parameters, and are from the same instance of
    * `admin.app.App`.
    *
    * Two `Reference` objects are equivalent if they represent the same location
    * and are from the same instance of `admin.app.App`.
    *
    * Two `Query` objects are equivalent if they represent the same location, have
    * the same query parameters, and are from the same instance of `admin.app.App`.
    * Equivalent queries share the same sort order, limits, and starting and
    * ending points.
    *
    * @example
    * ```javascript
    * var rootRef = admin.database().ref();
    * var usersRef = rootRef.child("users");
    *
    * usersRef.isEqual(rootRef);  // false
    * usersRef.isEqual(rootRef.child("users"));  // true
    * usersRef.parent.isEqual(rootRef);  // true
    * ```
    *
    * @example
    *  ```javascript
    * var rootRef = admin.database().ref();
    * var usersRef = rootRef.child("users");
    * var usersQuery = usersRef.limitToLast(10);
    *
    * usersQuery.isEqual(usersRef);  // false
    * usersQuery.isEqual(usersRef.limitToLast(10));  // true
    * usersQuery.isEqual(rootRef.limitToLast(10));  // false
    * usersQuery.isEqual(usersRef.orderByKey().limitToLast(10));  // false
    * ```
    *
    * @param other The query to compare against.
    * @return Whether or not the current and provided queries are
    *   equivalent.
    */
  def isEqual(other: Query): Boolean = js.native
  /**
    * Generates a new `Query` limited to the first specific number of children.
    *
    * The `limitToFirst()` method is used to set a maximum number of children to be
    * synced for a given callback. If we set a limit of 100, we will initially only
    * receive up to 100 `child_added` events. If we have fewer than 100 messages
    * stored in our Database, a `child_added` event will fire for each message.
    * However, if we have over 100 messages, we will only receive a `child_added`
    * event for the first 100 ordered messages. As items change, we will receive
    * `child_removed` events for each item that drops out of the active list so
    * that the total number stays at 100.
    *
    * You can read more about `limitToFirst()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find the two shortest dinosaurs.
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByChild("height").limitToFirst(2).on("child_added", function(snapshot) {
    *   // This will be called exactly two times (unless there are less than two
    *   // dinosaurs in the Database).
    *
    *   // It will also get fired again if one of the first two dinosaurs is
    *   // removed from the data set, as a new dinosaur will now be the second
    *   // shortest.
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param limit The maximum number of nodes to include in this query.
    * @return A `Query` object.
    */
  def limitToFirst(limit: Double): Query = js.native
  /**
    * Generates a new `Query` object limited to the last specific number of
    * children.
    *
    * The `limitToLast()` method is used to set a maximum number of children to be
    * synced for a given callback. If we set a limit of 100, we will initially only
    * receive up to 100 `child_added` events. If we have fewer than 100 messages
    * stored in our Database, a `child_added` event will fire for each message.
    * However, if we have over 100 messages, we will only receive a `child_added`
    * event for the last 100 ordered messages. As items change, we will receive
    * `child_removed` events for each item that drops out of the active list so
    * that the total number stays at 100.
    *
    * You can read more about `limitToLast()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find the two heaviest dinosaurs.
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByChild("weight").limitToLast(2).on("child_added", function(snapshot) {
    *   // This callback will be triggered exactly two times, unless there are
    *   // fewer than two dinosaurs stored in the Database. It will also get fired
    *   // for every new, heavier dinosaur that gets added to the data set.
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param limit The maximum number of nodes to include in this query.
    * @return A `Query` object.
    */
  def limitToLast(limit: Double): Query = js.native
  /**
    * Detaches a callback previously attached with `on()`.
    *
    * Detach a callback previously attached with `on()`. Note that if `on()` was
    * called multiple times with the same eventType and callback, the callback
    * will be called multiple times for each event, and `off()` must be called
    * multiple times to remove the callback. Calling `off()` on a parent listener
    * will not automatically remove listeners registered on child nodes, `off()`
    * must also be called on any child listeners to remove the callback.
    *
    * If a callback is not specified, all callbacks for the specified eventType
    * will be removed. Similarly, if no eventType or callback is specified, all
    * callbacks for the `Reference` will be removed.
    *
    * @example
    * ```javascript
    * var onValueChange = function(dataSnapshot) {  ... };
    * ref.on('value', onValueChange);
    * ref.child('meta-data').on('child_added', onChildAdded);
    * // Sometime later...
    * ref.off('value', onValueChange);
    *
    * // You must also call off() for any child listeners on ref
    * // to cancel those callbacks
    * ref.child('meta-data').off('child_added', onValueAdded);
    * ```
    *
    * @example
    * ```javascript
    * // Or you can save a line of code by using an inline function
    * // and on()'s return value.
    * var onValueChange = ref.on('value', function(dataSnapshot) { ... });
    * // Sometime later...
    * ref.off('value', onValueChange);
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved."
    * @param callback The callback function that was passed to `on()`.
    * @param context The context that was passed to `on()`.
    */
  def off(): Unit = js.native
  def off(eventType: EventType): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    context: js.Object
  ): Unit = js.native
  /**
    * Listens for data changes at a particular location.
    *
    * This is the primary way to read data from a Database. Your callback
    * will be triggered for the initial data and again whenever the data changes.
    * Use `off( )` to stop receiving updates. See
    * {@link https://firebase.google.com/docs/database/web/retrieve-data
    *   Retrieve Data on the Web}
    * for more details.
    *
    * <h4>value event</h4>
    *
    * This event will trigger once with the initial data stored at this location,
    * and then trigger again each time the data changes. The `DataSnapshot` passed
    * to the callback will be for the location at which `on()` was called. It
    * won't trigger until the entire contents has been synchronized. If the
    * location has no data, it will be triggered with an empty `DataSnapshot`
    * (`val()` will return `null`).
    *
    * <h4>child_added event</h4>
    *
    * This event will be triggered once for each initial child at this location,
    * and it will be triggered again every time a new child is added. The
    * `DataSnapshot` passed into the callback will reflect the data for the
    * relevant child. For ordering purposes, it is passed a second argument which
    * is a string containing the key of the previous sibling child by sort order
    * (or `null` if it is the first child).
    *
    * <h4>child_removed event</h4>
    *
    * This event will be triggered once every time a child is removed. The
    * `DataSnapshot` passed into the callback will be the old data for the child
    * that was removed. A child will get removed when either:
    *
    * - a client explicitly calls `remove()` on that child or one of its ancestors
    * - a client calls `set(null)` on that child or one of its ancestors
    * - that child has all of its children removed
    * - there is a query in effect which now filters out the child (because it's
    *   sort order changed or the max limit was hit)
    *
    * <h4>child_changed event</h4>
    *
    * This event will be triggered when the data stored in a child (or any of its
    * descendants) changes. Note that a single `child_changed` event may represent
    * multiple changes to the child. The `DataSnapshot` passed to the callback will
    * contain the new child contents. For ordering purposes, the callback is also
    * passed a second argument which is a string containing the key of the previous
    * sibling child by sort order (or `null` if it is the first child).
    *
    * <h4>child_moved event</h4>
    *
    * This event will be triggered when a child's sort order changes such that its
    * position relative to its siblings changes. The `DataSnapshot` passed to the
    * callback will be for the data of the child that has moved. It is also passed
    * a second argument which is a string containing the key of the previous
    * sibling child by sort order (or `null` if it is the first child).
    *
    * @example
    * ```javascript
    * // Handle a new value.
    * ref.on('value', function(dataSnapshot) {
    *   ...
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Handle a new child.
    * ref.on('child_added', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Handle child removal.
    * ref.on('child_removed', function(oldChildSnapshot) {
    *   ...
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Handle child data changes.
    * ref.on('child_changed', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Handle child ordering changes.
    * ref.on('child_moved', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved."
    * @param callback A callback that fires when the specified event occurs. The callback is
    *   passed a DataSnapshot. For ordering purposes, "child_added",
    *   "child_changed", and "child_moved" will also be passed a string containing
    *   the key of the previous child, by sort order (or `null` if it is the
    *   first child).
    * @param cancelCallbackOrContext An optional
    *   callback that will be notified if your event subscription is ever canceled
    *   because your client does not have permission to read this data (or it had
    *   permission but has now lost it). This callback will be passed an `Error`
    *   object indicating why the failure occurred.
    * @param context If provided, this object will be used as `this`
    *   when calling your callback(s).
    * @return The provided
    *   callback function is returned unmodified. This is just for convenience if
    *   you want to pass an inline function to `on()`,  but store the callback
    *   function for later passing to `off()`.
    */
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _]
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _],
    cancelCallbackOrContext: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _],
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _],
    cancelCallbackOrContext: Null,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], _] = js.native
  /**
    * Listens for exactly one event of the specified event type, and then stops
    * listening.
    *
    * This is equivalent to calling `on()`, and then calling `off()` inside the
    * callback function. See `on()` for details on the event types.
    *
    * @example
    * ```javascript
    * // Basic usage of .once() to read the data located at ref.
    * ref.once('value')
    *   .then(function(dataSnapshot) {
    *     // handle read data.
    *   });
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved."
    * @param successCallback A callback that fires when the specified event occurs. The callback is
    *   passed a `DataSnapshot`. For ordering purposes, "child_added",
    *   "child_changed", and "child_moved" will also be passed a string containing
    *   the key of the previous child by sort order (or `null` if it is the
    *   first child).
    * @param failureCallbackOrContext An optional
    *   callback that will be notified if your client does not have permission to
    *   read the data. This callback will be passed an `Error` object indicating
    *   why the failure occurred.
    * @param context If provided, this object will be used as `this`
    *   when calling your callback(s).
    * @return {!Promise<admin.database.DataSnapshot>}
    */
  def once(eventType: EventType): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String], _]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String], _],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String], _],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String], _],
    failureCallbackOrContext: Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  /**
    * Generates a new `Query` object ordered by the specified child key.
    *
    * Queries can only order by one key at a time. Calling `orderByChild()`
    * multiple times on the same query is an error.
    *
    * Firebase queries allow you to order your data by any child key on the fly.
    * However, if you know in advance what your indexes will be, you can define
    * them via the .indexOn rule in your Security Rules for better performance. See
    * the {@link https://firebase.google.com/docs/database/security/indexing-data
    * .indexOn} rule for more information.
    *
    * You can read more about `orderByChild()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByChild("height").on("child_added", function(snapshot) {
    *   console.log(snapshot.key + " was " + snapshot.val().height + " m tall");
    * });
    * ```
    *
    * @param path
    * @return A new `Query` object.
    */
  def orderByChild(path: String): Query = js.native
  /**
    * Generates a new `Query` object ordered by key.
    *
    * Sorts the results of a query by their (ascending) key values.
    *
    * You can read more about `orderByKey()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByKey().on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @return A new `Query` object.
    */
  def orderByKey(): Query = js.native
  /**
    * Generates a new `Query` object ordered by priority.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data} for alternatives to priority.
    *
    * @return A new `Query` object.
    */
  def orderByPriority(): Query = js.native
  /**
    * Generates a new `Query` object ordered by value.
    *
    * If the children of a query are all scalar values (string, number, or
    * boolean), you can order the results by their (ascending) values.
    *
    * You can read more about `orderByValue()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var scoresRef = admin.database().ref("scores");
    * scoresRef.orderByValue().limitToLast(3).on("value", function(snapshot) {
    *   snapshot.forEach(function(data) {
    *     console.log("The " + data.key + " score is " + data.val());
    *   });
    * });
    * ```
    *
    * @return A new `Query` object.
    */
  def orderByValue(): Query = js.native
  def startAt(): Query = js.native
  def startAt(value: String): Query = js.native
  def startAt(value: String, key: String): Query = js.native
  def startAt(value: Boolean): Query = js.native
  def startAt(value: Boolean, key: String): Query = js.native
  /**
    * Creates a `Query` with the specified starting point.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows you to choose arbitrary
    * starting and ending points for your queries.
    *
    * The starting point is inclusive, so children with exactly the specified value
    * will be included in the query. The optional key argument can be used to
    * further limit the range of the query. If it is specified, then children that
    * have exactly the specified value must also have a key name greater than or
    * equal to the specified key.
    *
    * You can read more about `startAt()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find all dinosaurs that are at least three meters tall.
    * var ref = admin.database().ref("dinosaurs");
    * ref.orderByChild("height").startAt(3).on("child_added", function(snapshot) {
    *   console.log(snapshot.key)
    * });
    * ```
    *
    * @param value The value to start at. The argument
    *   type depends on which `orderBy*()` function was used in this query.
    *   Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param  key The child key to start at. This argument is allowed if
    *   ordering by child, value, or priority.
    * @return A new `Query` object.
    */
  def startAt(value: Double): Query = js.native
  def startAt(value: Double, key: String): Query = js.native
  def startAt(value: Null, key: String): Query = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

