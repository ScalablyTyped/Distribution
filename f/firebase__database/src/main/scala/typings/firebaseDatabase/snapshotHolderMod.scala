package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/SnapshotHolder", JSImport.Namespace)
@js.native
object snapshotHolderMod extends js.Object {
  
  @js.native
  class SnapshotHolder () extends js.Object {
    
    def getNode(path: Path): Node = js.native
    
    var rootNode_ : js.Any = js.native
    
    def updateSnapshot(path: Path, newSnapshotNode: Node): Unit = js.native
  }
}
