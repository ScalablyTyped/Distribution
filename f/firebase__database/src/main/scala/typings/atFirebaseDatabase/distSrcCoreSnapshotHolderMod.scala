package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/SnapshotHolder", JSImport.Namespace)
@js.native
object distSrcCoreSnapshotHolderMod extends js.Object {
  @js.native
  class SnapshotHolder () extends js.Object {
    var rootNode_ : js.Any = js.native
    def getNode(path: Path): Node = js.native
    def updateSnapshot(path: Path, newSnapshotNode: Node): Unit = js.native
  }
  
}

