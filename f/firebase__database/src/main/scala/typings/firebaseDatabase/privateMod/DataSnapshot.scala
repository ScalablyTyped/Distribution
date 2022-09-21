package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/private", "DataSnapshot")
@js.native
open class DataSnapshot protected () extends StObject {
  /**
    * @param _node - A SnapshotNode to wrap.
    * @param ref - The location this snapshot came from.
    * @param _index - The iteration order for this snapshot
    * @hideconstructor
    */
  def this(
    _node: Node2,
    /**
    * The location of this DataSnapshot.
    */
  ref: DatabaseReference,
    _index: Index
  ) = this()
  
  val _index: Index = js.native
  
  val _node: Node2 = js.native
  
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
    * @param path - A relative path to the location of child data.
    */
  def child(path: String): DataSnapshot = js.native
  
  /**
    * Returns true if this `DataSnapshot` contains any data. It is slightly more
    * efficient than using `snapshot.val() !== null`.
    */
  def exists(): Boolean = js.native
  
  /**
    * Exports the entire contents of the DataSnapshot as a JavaScript object.
    *
    * The `exportVal()` method is similar to `val()`, except priority information
    * is included (if available), making it suitable for backing up your data.
    *
    * @returns The DataSnapshot's contents as a JavaScript value (Object,
    *   Array, string, number, boolean, or `null`).
    */
  def exportVal(): Any = js.native
  
  /**
    * Enumerates the top-level children in the `DataSnapshot`.
    *
    * Because of the way JavaScript objects work, the ordering of data in the
    * JavaScript object returned by `val()` is not guaranteed to match the
    * ordering on the server nor the ordering of `onChildAdded()` events. That is
    * where `forEach()` comes in handy. It guarantees the children of a
    * `DataSnapshot` will be iterated in their query order.
    *
    * If no explicit `orderBy*()` method is used, results are returned
    * ordered by key (unless priorities are used, in which case, results are
    * returned by priority).
    *
    * @param action - A function that will be called for each child DataSnapshot.
    * The callback can return true to cancel further enumeration.
    * @returns true if enumeration was canceled due to your callback returning
    * true.
    */
  def forEach(action: js.Function1[/* child */ this.type, Boolean | Unit]): Boolean = js.native
  
  /**
    * Returns true if the specified child path has (non-null) data.
    *
    * @param path - A relative path to the location of a potential child.
    * @returns `true` if data exists at the specified child path; else
    *  `false`.
    */
  def hasChild(path: String): Boolean = js.native
  
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
    * @returns true if this snapshot has any children; else false.
    */
  def hasChildren(): Boolean = js.native
  
  /**
    * The key (last part of the path) of the location of this `DataSnapshot`.
    *
    * The last token in a Database location is considered its key. For example,
    * "ada" is the key for the /users/ada/ node. Accessing the key on any
    * `DataSnapshot` will return the key for the location that generated it.
    * However, accessing the key on the root URL of a Database will return
    * `null`.
    */
  def key: String | Null = js.native
  
  /**
    * Gets the priority value of the data in this `DataSnapshot`.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data |Sorting and filtering data}
    * ).
    */
  def priority: String | Double | Null = js.native
  
  /**
    * The location of this DataSnapshot.
    */
  val ref: DatabaseReference = js.native
  
  /** Returns the number of child properties of this `DataSnapshot`. */
  def size: Double = js.native
  
  /**
    * Returns a JSON-serializable representation of this object.
    */
  def toJSON(): js.Object | Null = js.native
  
  /**
    * Extracts a JavaScript value from a `DataSnapshot`.
    *
    * Depending on the data in a `DataSnapshot`, the `val()` method may return a
    * scalar type (string, number, or boolean), an array, or an object. It may
    * also return null, indicating that the `DataSnapshot` is empty (contains no
    * data).
    *
    * @returns The DataSnapshot's contents as a JavaScript value (Object,
    *   Array, string, number, boolean, or `null`).
    */
  def `val`(): Any = js.native
}
