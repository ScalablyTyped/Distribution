package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`return`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`throw`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.call
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMessageMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRpcCall[TProcedure /* <: RpcProcedure[js.Any, js.Any] */](procedure: TProcedure, index: Double, payload: RpcProcedurePayload[TProcedure]): RpcCall[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcCall")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcCall[TProcedure]]
  
  inline def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload): RpcMessage[TType, TProcedure, TPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessage")(procedure.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
  inline def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload, source: String): RpcMessage[TType, TProcedure, TPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessage")(procedure.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
  
  inline def createRpcReturn[TProcedure /* <: RpcProcedure[js.Any, js.Any] */](procedure: TProcedure, index: Double, payload: RpcProcedureResult[TProcedure]): RpcReturn[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcReturn")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcReturn[TProcedure]]
  
  inline def createRpcThrow[TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TError](procedure: TProcedure, index: Double, payload: RpcRemoteError): RpcThrow[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcThrow")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcThrow[TProcedure]]
  
  inline def getRpcMessageKey(message: RpcMessage[String, RpcProcedure[js.Any, js.Any], js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRpcMessageKey")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isRpcCallMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcCallMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean]
  
  inline def isRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean]
  
  inline def isRpcReturnMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcReturnMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean]
  
  inline def isRpcThrowMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcThrowMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean]
  
  type RpcCall[TProcedure /* <: RpcProcedure[js.Any, js.Any] */] = RpcMessage[call, TProcedure, RpcProcedurePayload[TProcedure]]
  
  trait RpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload] extends StObject {
    
    var id: Double
    
    var payload: TPayload
    
    var procedure: TProcedure
    
    var rpc: `true`
    
    var source: js.UndefOr[String] = js.undefined
    
    var `type`: TType
  }
  object RpcMessage {
    
    inline def apply[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](id: Double, payload: TPayload, procedure: TProcedure, `type`: TType): RpcMessage[TType, TProcedure, TPayload] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], rpc = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
    }
    
    extension [Self <: RpcMessage[?, ?, ?], TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](x: Self & (RpcMessage[TType, TProcedure, TPayload])) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: TPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProcedure(value: TProcedure): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setRpc(value: `true`): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RpcRemoteError extends StObject {
    
    var message: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object RpcRemoteError {
    
    inline def apply(message: String): RpcRemoteError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcRemoteError]
    }
    
    extension [Self <: RpcRemoteError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type RpcReturn[TProcedure /* <: RpcProcedure[js.Any, js.Any] */] = RpcMessage[`return`, TProcedure, RpcProcedureResult[TProcedure]]
  
  type RpcThrow[TProcedure /* <: RpcProcedure[js.Any, js.Any] */] = RpcMessage[`throw`, TProcedure, RpcRemoteError]
}
