package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.call
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.reject
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait RpcCallMessage
    extends StObject
       with RpcMessage {
    
    var args: js.Array[Any]
    
    var id: String
    
    var `type`: call
  }
  object RpcCallMessage {
    
    inline def apply(args: js.Array[Any], id: String): RpcCallMessage = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("call")
      __obj.asInstanceOf[RpcCallMessage]
    }
    
    extension [Self <: RpcCallMessage](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.typesMod.RpcCallMessage
    - typings.forkTsCheckerWebpackPlugin.typesMod.RpcResolveMessage
    - typings.forkTsCheckerWebpackPlugin.typesMod.RpcRejectMessage
  */
  trait RpcMessage extends StObject
  object RpcMessage {
    
    inline def RpcCallMessage(args: js.Array[Any], id: String): typings.forkTsCheckerWebpackPlugin.typesMod.RpcCallMessage = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("call")
      __obj.asInstanceOf[typings.forkTsCheckerWebpackPlugin.typesMod.RpcCallMessage]
    }
    
    inline def RpcRejectMessage(error: Any, id: String): typings.forkTsCheckerWebpackPlugin.typesMod.RpcRejectMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reject")
      __obj.asInstanceOf[typings.forkTsCheckerWebpackPlugin.typesMod.RpcRejectMessage]
    }
    
    inline def RpcResolveMessage(id: String, value: Any): typings.forkTsCheckerWebpackPlugin.typesMod.RpcResolveMessage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resolve")
      __obj.asInstanceOf[typings.forkTsCheckerWebpackPlugin.typesMod.RpcResolveMessage]
    }
  }
  
  @js.native
  trait RpcMethod extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait RpcRejectMessage
    extends StObject
       with RpcMessage {
    
    var error: Any
    
    var id: String
    
    var `type`: reject
  }
  object RpcRejectMessage {
    
    inline def apply(error: Any, id: String): RpcRejectMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reject")
      __obj.asInstanceOf[RpcRejectMessage]
    }
    
    extension [Self <: RpcRejectMessage](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: reject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RpcRemoteMethod[T /* <: RpcMethod */] = js.Function1[/* repeated */ Any, Any | js.Promise[Any]]
  
  trait RpcResolveMessage
    extends StObject
       with RpcMessage {
    
    var id: String
    
    var `type`: resolve
    
    var value: Any
  }
  object RpcResolveMessage {
    
    inline def apply(id: String, value: Any): RpcResolveMessage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resolve")
      __obj.asInstanceOf[RpcResolveMessage]
    }
    
    extension [Self <: RpcResolveMessage](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: resolve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
