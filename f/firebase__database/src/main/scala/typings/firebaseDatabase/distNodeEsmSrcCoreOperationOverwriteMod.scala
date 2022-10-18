package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreOperationOverwriteMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/operation/Overwrite", "Overwrite")
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
