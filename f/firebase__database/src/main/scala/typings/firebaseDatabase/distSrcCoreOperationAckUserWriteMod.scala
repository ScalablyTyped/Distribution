package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreOperationAckUserWriteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/AckUserWrite", "AckUserWrite")
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
    /** @inheritDoc */
    @JSName("source")
    var source_AckUserWrite: typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
