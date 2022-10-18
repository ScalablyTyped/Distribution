package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSnapshotHolderMod {
  
  @JSImport("@firebase/database/dist/src/core/SnapshotHolder", "SnapshotHolder")
  @js.native
  open class SnapshotHolder () extends StObject {
    
    def getNode(path: Path): Node = js.native
    
    /* private */ var rootNode_ : Any = js.native
    
    def updateSnapshot(path: Path, newSnapshotNode: Node): Unit = js.native
  }
}
