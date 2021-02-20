package typings.firebaseDatabase

import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource")
  @js.native
  class OperationSource protected () extends StObject {
    def this(fromUser: Boolean, fromServer: Boolean, queryId: String, tagged: Boolean) = this()
    def this(fromUser: Boolean, fromServer: Boolean, queryId: Null, tagged: Boolean) = this()
    
    var fromServer: Boolean = js.native
    
    var fromUser: Boolean = js.native
    
    var queryId: String | Null = js.native
    
    var tagged: Boolean = js.native
  }
  /* static members */
  object OperationSource {
    
    @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @const
      * @type {!OperationSource}
      */
    @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource.Server")
    @js.native
    def Server: OperationSource = js.native
    @scala.inline
    def Server_=(x: OperationSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    /**
      * @const
      * @type {!OperationSource}
      */
    @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource.User")
    @js.native
    def User: OperationSource = js.native
    @scala.inline
    def User_=(x: OperationSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("User")(x.asInstanceOf[js.Any])
    
    /**
      * @param {string} queryId
      * @return {!OperationSource}
      */
    @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource.forServerTaggedQuery")
    @js.native
    def forServerTaggedQuery(queryId: String): OperationSource = js.native
  }
  
  @js.native
  sealed trait OperationType extends StObject
  @JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationType")
  @js.native
  object OperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationType with Double] = js.native
    
    @js.native
    sealed trait ACK_USER_WRITE extends OperationType
    /* 2 */ val ACK_USER_WRITE: typings.firebaseDatabase.operationMod.OperationType.ACK_USER_WRITE with Double = js.native
    
    @js.native
    sealed trait LISTEN_COMPLETE extends OperationType
    /* 3 */ val LISTEN_COMPLETE: typings.firebaseDatabase.operationMod.OperationType.LISTEN_COMPLETE with Double = js.native
    
    @js.native
    sealed trait MERGE extends OperationType
    /* 1 */ val MERGE: typings.firebaseDatabase.operationMod.OperationType.MERGE with Double = js.native
    
    @js.native
    sealed trait OVERWRITE extends OperationType
    /* 0 */ val OVERWRITE: typings.firebaseDatabase.operationMod.OperationType.OVERWRITE with Double = js.native
  }
  
  @js.native
  trait Operation extends StObject {
    
    /**
      * @param {string} childName
      * @return {?Operation}
      */
    def operationForChild(childName: String): Operation | Null = js.native
    
    /**
      * @type {!Path}
      */
    var path: Path = js.native
    
    /**
      * @type {!OperationSource}
      */
    var source: OperationSource = js.native
    
    /**
      * @type {!OperationType}
      */
    var `type`: OperationType = js.native
  }
  object Operation {
    
    @scala.inline
    def apply(
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
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperationForChild(value: String => Operation | Null): Self = StObject.set(x, "operationForChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: OperationSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: OperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
