package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreOperationOperationMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait OperationType extends StObject
  @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationType")
  @js.native
  object OperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationType & Double] = js.native
    
    @js.native
    sealed trait ACK_USER_WRITE
      extends StObject
         with OperationType
    /* 2 */ val ACK_USER_WRITE: typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType.ACK_USER_WRITE & Double = js.native
    
    @js.native
    sealed trait LISTEN_COMPLETE
      extends StObject
         with OperationType
    /* 3 */ val LISTEN_COMPLETE: typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType.LISTEN_COMPLETE & Double = js.native
    
    @js.native
    sealed trait MERGE
      extends StObject
         with OperationType
    /* 1 */ val MERGE: typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType.MERGE & Double = js.native
    
    @js.native
    sealed trait OVERWRITE
      extends StObject
         with OperationType
    /* 0 */ val OVERWRITE: typings.firebaseDatabase.distSrcCoreOperationOperationMod.OperationType.OVERWRITE & Double = js.native
  }
  
  inline def newOperationSourceServer(): OperationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("newOperationSourceServer")().asInstanceOf[OperationSource]
  
  inline def newOperationSourceServerTaggedQuery(queryId: String): OperationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("newOperationSourceServerTaggedQuery")(queryId.asInstanceOf[js.Any]).asInstanceOf[OperationSource]
  
  inline def newOperationSourceUser(): OperationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("newOperationSourceUser")().asInstanceOf[OperationSource]
  
  trait Operation extends StObject {
    
    def operationForChild(childName: String): Operation | Null
    
    var path: Path
    
    var source: OperationSource
    
    var `type`: OperationType
  }
  object Operation {
    
    inline def apply(
      operationForChild: String => Operation | Null,
      path: Path,
      source: OperationSource,
      `type`: OperationType
    ): Operation = {
      val __obj = js.Dynamic.literal(operationForChild = js.Any.fromFunction1(operationForChild), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      inline def setOperationForChild(value: String => Operation | Null): Self = StObject.set(x, "operationForChild", js.Any.fromFunction1(value))
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSource(value: OperationSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: OperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationSource extends StObject {
    
    var fromServer: Boolean
    
    var fromUser: Boolean
    
    var queryId: String | Null
    
    var tagged: Boolean
  }
  object OperationSource {
    
    inline def apply(fromServer: Boolean, fromUser: Boolean, tagged: Boolean): OperationSource = {
      val __obj = js.Dynamic.literal(fromServer = fromServer.asInstanceOf[js.Any], fromUser = fromUser.asInstanceOf[js.Any], tagged = tagged.asInstanceOf[js.Any], queryId = null)
      __obj.asInstanceOf[OperationSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationSource] (val x: Self) extends AnyVal {
      
      inline def setFromServer(value: Boolean): Self = StObject.set(x, "fromServer", value.asInstanceOf[js.Any])
      
      inline def setFromUser(value: Boolean): Self = StObject.set(x, "fromUser", value.asInstanceOf[js.Any])
      
      inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
      
      inline def setQueryIdNull: Self = StObject.set(x, "queryId", null)
      
      inline def setTagged(value: Boolean): Self = StObject.set(x, "tagged", value.asInstanceOf[js.Any])
    }
  }
}
