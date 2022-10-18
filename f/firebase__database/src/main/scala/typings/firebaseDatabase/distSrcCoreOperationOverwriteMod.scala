package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreOperationOverwriteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Overwrite", "Overwrite")
  @js.native
  open class Overwrite protected ()
    extends StObject
       with Operation {
    def this(source: OperationSource, path: Path, snap: Node) = this()
    
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /* CompleteClass */
    var path: Path = js.native
    
    var snap: Node = js.native
    
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
