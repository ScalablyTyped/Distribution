package typings.firebaseDatabase

import typings.firebaseDatabase.operationOperationMod.Operation
import typings.firebaseDatabase.operationOperationMod.OperationSource
import typings.firebaseDatabase.operationOperationMod.OperationType
import typings.firebaseDatabase.snapNodeMod.Node
import typings.firebaseDatabase.utilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOverwriteMod {
  
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
