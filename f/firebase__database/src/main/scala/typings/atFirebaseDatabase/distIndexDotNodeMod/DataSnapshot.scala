package typings.atFirebaseDatabase.distIndexDotNodeMod

import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "DataSnapshot")
@js.native
class DataSnapshot protected ()
  extends typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(node_ : Node, ref_ : typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference, index_ : Index) = this()
}

