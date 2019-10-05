package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreViewChangeMod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Change", JSImport.Namespace)
@js.native
object distSrcCoreViewChangeMod extends js.Object {
  @js.native
  class Change protected () extends js.Object {
    def this(`type`: String, snapshotNode: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node, prevName: String) = this()
    var childName: js.UndefOr[String] = js.native
    var oldSnap: js.UndefOr[Node] = js.native
    var prevName: js.UndefOr[String | Null] = js.native
    var snapshotNode: Node = js.native
    var `type`: String = js.native
  }
  
  /* static members */
  @js.native
  object Change extends js.Object {
    /** Event type for a child added */
    var CHILD_ADDED: String = js.native
    /** Event type for a child changed */
    var CHILD_CHANGED: String = js.native
    /** Event type for a child moved */
    var CHILD_MOVED: String = js.native
    /** Event type for a child removed */
    var CHILD_REMOVED: String = js.native
    /** Event type for a value change */
    var VALUE: String = js.native
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    def childAddedChange(childKey: String, snapshot: Node): Change = js.native
    /**
      * @param {string} childKey
      * @param {!Node} newSnapshot
      * @param {!Node} oldSnapshot
      * @return {!Change}
      */
    def childChangedChange(childKey: String, newSnapshot: Node, oldSnapshot: Node): Change = js.native
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    def childMovedChange(childKey: String, snapshot: Node): Change = js.native
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    def childRemovedChange(childKey: String, snapshot: Node): Change = js.native
    /**
      * @param {!Node} snapshot
      * @return {!Change}
      */
    def valueChange(snapshot: Node): Change = js.native
  }
  
}

