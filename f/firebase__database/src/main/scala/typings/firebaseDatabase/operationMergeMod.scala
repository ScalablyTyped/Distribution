package typings.firebaseDatabase

import typings.firebaseDatabase.operationOperationMod.Operation
import typings.firebaseDatabase.operationOperationMod.OperationSource
import typings.firebaseDatabase.operationOperationMod.OperationType
import typings.firebaseDatabase.snapNodeMod.Node
import typings.firebaseDatabase.utilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.utilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMergeMod {
  
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
