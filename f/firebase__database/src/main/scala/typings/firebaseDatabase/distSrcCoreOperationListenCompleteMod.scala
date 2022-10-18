package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreOperationListenCompleteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/ListenComplete", "ListenComplete")
  @js.native
  open class ListenComplete protected ()
    extends StObject
       with Operation {
    def this(source: OperationSource, path: Path) = this()
    
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
