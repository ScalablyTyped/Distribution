package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
import typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference
import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/DataSnapshot", JSImport.Namespace)
@js.native
object distSrcApiDataSnapshotMod extends js.Object {
  @js.native
  class DataSnapshot protected () extends js.Object {
    /**
      * @param {!Node} node_ A SnapshotNode to wrap.
      * @param {!Reference} ref_ The ref of the location this snapshot came from.
      * @param {!Index} index_ The iteration order for this snapshot
      */
    def this(node_ : Node, ref_ : Reference, index_ : Index) = this()
    val index_ : js.Any = js.native
    val key: String = js.native
    val node_ : js.Any = js.native
    val ref: Reference = js.native
    val ref_ : js.Any = js.native
    /**
      * Returns a DataSnapshot of the specified child node's contents.
      *
      * @param {!string} childPathString Path to a child.
      * @return {!DataSnapshot} DataSnapshot for child node.
      */
    def child(childPathString: String): DataSnapshot = js.native
    /**
      * Returns whether the snapshot contains a non-null value.
      *
      * @return {boolean} Whether the snapshot contains a non-null value, or is empty.
      */
    def exists(): Boolean = js.native
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
    def forEach(action: js.Function1[/* d */ this.type, Boolean | Unit]): Boolean = js.native
    /**
      * Returns the priority of the object, or null if no priority was set.
      *
      * @return {string|number|null} The priority.
      */
    def getPriority(): String | Double | Null = js.native
    /**
      * @return {Reference} The Firebase reference for the location this snapshot's data came from.
      */
    def getRef(): Reference = js.native
    /**
      * Returns whether the snapshot contains a child at the specified path.
      *
      * @param {!string} childPathString Path to a child.
      * @return {boolean} Whether the child exists.
      */
    def hasChild(childPathString: String): Boolean = js.native
    /**
      * Returns whether this DataSnapshot has children.
      * @return {boolean} True if the DataSnapshot contains 1 or more child nodes.
      */
    def hasChildren(): Boolean = js.native
    /**
      * Returns the number of children for this DataSnapshot.
      * @return {number} The number of children that this DataSnapshot contains.
      */
    def numChildren(): Double = js.native
    def toJSON(): js.Any = js.native
    /**
      * Retrieves the snapshot contents as JSON.  Returns null if the snapshot is
      * empty.
      *
      * @return {*} JSON representation of the DataSnapshot contents, or null if empty.
      */
    def `val`(): js.Any = js.native
  }
  
}

