package typings.firebaseDatabase

import typings.firebaseDatabase.operationOperationMod.Operation
import typings.firebaseDatabase.operationOperationMod.OperationSource
import typings.firebaseDatabase.operationOperationMod.OperationType
import typings.firebaseDatabase.utilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.utilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationAckUserWriteMod {
  
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
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
