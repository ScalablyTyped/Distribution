package typings
package atFirebaseDatabaseLib.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "DataSnapshot")
@js.native
class DataSnapshot protected ()
  extends atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(`node_`: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, `ref_`: atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference, `index_`: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index) = this()
}

