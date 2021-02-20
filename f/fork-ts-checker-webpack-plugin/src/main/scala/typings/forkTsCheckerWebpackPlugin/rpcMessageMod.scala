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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMessageMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcCall")
  @js.native
  def createRpcCall[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedurePayload[TProcedure]): RpcCall[TProcedure] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcMessage")
  @js.native
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload): RpcMessage[TType, TProcedure, TPayload] = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcMessage")
  @js.native
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload, source: String): RpcMessage[TType, TProcedure, TPayload] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcReturn")
  @js.native
  def createRpcReturn[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedureResult[TProcedure]): RpcReturn[TProcedure] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcThrow")
  @js.native
  def createRpcThrow[TProcedure /* <: RpcProcedure[_, _] */, TError](procedure: TProcedure, index: Double, payload: RpcRemoteError): RpcThrow[TProcedure] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "getRpcMessageKey")
  @js.native
  def getRpcMessageKey(message: RpcMessage[String, RpcProcedure[_, _], _]): String = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "isRpcCallMessage")
  @js.native
  def isRpcCallMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "isRpcMessage")
  @js.native
  def isRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "isRpcReturnMessage")
  @js.native
  def isRpcReturnMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "isRpcThrowMessage")
  @js.native
  def isRpcThrowMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean = js.native
  
  type RpcCall[TProcedure /* <: RpcProcedure[_, _] */] = RpcMessage[call, TProcedure, RpcProcedurePayload[TProcedure]]
  
  @js.native
  trait RpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload] extends StObject {
    
    var id: Double = js.native
    
    var payload: TPayload = js.native
    
    var procedure: TProcedure = js.native
    
    var rpc: `true` = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var `type`: TType = js.native
  }
  object RpcMessage {
    
    @scala.inline
    def apply[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](id: Double, payload: TPayload, procedure: TProcedure, rpc: `true`, `type`: TType): RpcMessage[TType, TProcedure, TPayload] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
    }
    
    @scala.inline
    implicit class RpcMessageMutableBuilder[Self <: RpcMessage[_, _, _], TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload] (val x: Self with (RpcMessage[TType, TProcedure, TPayload])) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: TPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcedure(value: TProcedure): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpc(value: `true`): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RpcRemoteError extends StObject {
    
    var message: String = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object RpcRemoteError {
    
    @scala.inline
    def apply(message: String): RpcRemoteError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcRemoteError]
    }
    
    @scala.inline
    implicit class RpcRemoteErrorMutableBuilder[Self <: RpcRemoteError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type RpcReturn[TProcedure /* <: RpcProcedure[_, _] */] = RpcMessage[`return`, TProcedure, RpcProcedureResult[TProcedure]]
  
  type RpcThrow[TProcedure /* <: RpcProcedure[_, _] */] = RpcMessage[`throw`, TProcedure, RpcRemoteError]
}
