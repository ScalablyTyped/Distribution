package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreOperationMergeMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Merge", "Merge")
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
