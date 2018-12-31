package typings
package atFirebaseDatabaseLib.distSrcApiDataSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/DataSnapshot", "DataSnapshot")
@js.native
class DataSnapshot protected () extends js.Object {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(`node_`: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, `ref_`: atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference, `index_`: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index) = this()
  val `index_`: js.Any = js.native
  val key: java.lang.String = js.native
  val `node_`: js.Any = js.native
  val ref: atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  val `ref_`: js.Any = js.native
  /**
    * Returns a DataSnapshot of the specified child node's contents.
    *
    * @param {!string} childPathString Path to a child.
    * @return {!DataSnapshot} DataSnapshot for child node.
    */
  def child(childPathString: java.lang.String): DataSnapshot = js.native
  /**
    * Returns whether the snapshot contains a non-null value.
    *
    * @return {boolean} Whether the snapshot contains a non-null value, or is empty.
    */
  def exists(): scala.Boolean = js.native
  /**
    * Returns the snapshot contents as JSON, including priorities of node.  Suitable for exporting
    * the entire node contents.
    * @return {*} JSON representation of the DataSnapshot contents, or null if empty.
    */
  def exportVal(): js.Any = js.native
  /**
    * Iterates through child nodes and calls the specified action for each one.
    *
    * @param {function(!DataSnapshot)} action Callback function to be called
    * for each child.
    * @return {boolean} True if forEach was canceled by action returning true for
    * one of the child nodes.
    */
  def forEach(action: js.Function1[/* d */ this.type, scala.Boolean | scala.Unit]): scala.Boolean = js.native
  /**
    * Returns the priority of the object, or null if no priority was set.
    *
    * @return {string|number|null} The priority.
    */
  def getPriority(): java.lang.String | scala.Double | scala.Null = js.native
  /**
    * @return {Reference} The Firebase reference for the location this snapshot's data came from.
    */
  def getRef(): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  /**
    * Returns whether the snapshot contains a child at the specified path.
    *
    * @param {!string} childPathString Path to a child.
    * @return {boolean} Whether the child exists.
    */
  def hasChild(childPathString: java.lang.String): scala.Boolean = js.native
  /**
    * Returns whether this DataSnapshot has children.
    * @return {boolean} True if the DataSnapshot contains 1 or more child nodes.
    */
  def hasChildren(): scala.Boolean = js.native
  /**
    * Returns the number of children for this DataSnapshot.
    * @return {number} The number of children that this DataSnapshot contains.
    */
  def numChildren(): scala.Double = js.native
  def toJSON(): js.Any = js.native
  /**
    * Retrieves the snapshot contents as JSON.  Returns null if the snapshot is
    * empty.
    *
    * @return {*} JSON representation of the DataSnapshot contents, or null if empty.
    */
  def `val`(): js.Any = js.native
}

