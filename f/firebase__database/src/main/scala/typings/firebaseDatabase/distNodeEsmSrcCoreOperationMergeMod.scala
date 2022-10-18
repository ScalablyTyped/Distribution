package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreOperationMergeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/operation/Merge", "Merge")
  @js.native
  open class Merge protected ()
    extends StObject
       with Operation {
    def this(
      /** @inheritDoc */ source: OperationSource,
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ children: ImmutableTree[Node]
    ) = this()
    
    /** @inheritDoc */ var children: ImmutableTree[Node] = js.native
    
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /* CompleteClass */
    var path: Path = js.native
    
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
