package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreOperationAckUserWriteMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/operation/AckUserWrite", "AckUserWrite")
  @js.native
  open class AckUserWrite protected ()
    extends StObject
       with Operation {
    /**
      * @param affectedTree - A tree containing true for each affected path. Affected paths can't overlap.
      */
    def this(
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /** @inheritDoc */ revert: Boolean
    ) = this()
    
    /** @inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /* CompleteClass */
    var path: Path = js.native
    
    /** @inheritDoc */ var revert: Boolean = js.native
    
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
