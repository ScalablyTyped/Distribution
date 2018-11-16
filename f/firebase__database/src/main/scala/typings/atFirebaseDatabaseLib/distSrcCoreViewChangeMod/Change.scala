package typings
package atFirebaseDatabaseLib.distSrcCoreViewChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Change", "Change")
@js.native
class Change protected () extends js.Object {
  def this(`type`: java.lang.String, snapshotNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node) = this()
  def this(`type`: java.lang.String, snapshotNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, childName: java.lang.String) = this()
  def this(`type`: java.lang.String, snapshotNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, childName: java.lang.String, oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node) = this()
  def this(`type`: java.lang.String, snapshotNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, childName: java.lang.String, oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, prevName: java.lang.String) = this()
  var childName: java.lang.String = js.native
  var oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  var prevName: java.lang.String = js.native
  var snapshotNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  var `type`: java.lang.String = js.native
}

@JSImport("@firebase/database/dist/src/core/view/Change", "Change")
@js.native
object Change extends js.Object {
  /** Event type for a child added */
  var CHILD_ADDED: java.lang.String = js.native
  /** Event type for a child changed */
  var CHILD_CHANGED: java.lang.String = js.native
  /** Event type for a child moved */
  var CHILD_MOVED: java.lang.String = js.native
  /** Event type for a child removed */
  var CHILD_REMOVED: java.lang.String = js.native
  /** Event type for a value change */
  var VALUE: java.lang.String = js.native
  /**
       * @param {string} childKey
       * @param {!Node} snapshot
       * @return {!Change}
       */
  def childAddedChange(childKey: java.lang.String, snapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change = js.native
  /**
       * @param {string} childKey
       * @param {!Node} newSnapshot
       * @param {!Node} oldSnapshot
       * @return {!Change}
       */
  def childChangedChange(
    childKey: java.lang.String,
    newSnapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    oldSnapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change = js.native
  /**
       * @param {string} childKey
       * @param {!Node} snapshot
       * @return {!Change}
       */
  def childMovedChange(childKey: java.lang.String, snapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change = js.native
  /**
       * @param {string} childKey
       * @param {!Node} snapshot
       * @return {!Change}
       */
  def childRemovedChange(childKey: java.lang.String, snapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change = js.native
  /**
       * @param {!Node} snapshot
       * @return {!Change}
       */
  def valueChange(snapshot: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change = js.native
}

