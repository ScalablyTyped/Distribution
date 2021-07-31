package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcClientMod.RpcClient
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcCall
import typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage
import typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcRemoteError
import typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcReturn
import typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcThrow
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import typings.forkTsCheckerWebpackPlugin.rpcServiceMod.RpcService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRpcCall[TProcedure /* <: RpcProcedure[js.Any, js.Any] */](procedure: TProcedure, index: Double, payload: RpcProcedurePayload[TProcedure]): RpcCall[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcCall")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcCall[TProcedure]]
  
  @scala.inline
  def createRpcClient(port: RpcMessagePort): RpcClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcClient")(port.asInstanceOf[js.Any]).asInstanceOf[RpcClient]
  
  @scala.inline
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload): RpcMessage[TType, TProcedure, TPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessage")(procedure.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
  @scala.inline
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload, source: String): RpcMessage[TType, TProcedure, TPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessage")(procedure.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
  
  @scala.inline
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  @scala.inline
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort, linkPorts: js.Function0[js.Promise[Unit]]): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  @scala.inline
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.Function0[js.Promise[Unit]],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any], unlinkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  @scala.inline
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: Unit,
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any], unlinkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  
  @scala.inline
  def createRpcReturn[TProcedure /* <: RpcProcedure[js.Any, js.Any] */](procedure: TProcedure, index: Double, payload: RpcProcedureResult[TProcedure]): RpcReturn[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcReturn")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcReturn[TProcedure]]
  
  @scala.inline
  def createRpcService(port: RpcMessagePort): RpcService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcService")(port.asInstanceOf[js.Any]).asInstanceOf[RpcService]
  
  @scala.inline
  def createRpcThrow[TProcedure /* <: RpcProcedure[js.Any, js.Any] */, TError](procedure: TProcedure, index: Double, payload: RpcRemoteError): RpcThrow[TProcedure] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcThrow")(procedure.asInstanceOf[js.Any], index.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RpcThrow[TProcedure]]
  
  @scala.inline
  def getRpcMessageKey(message: RpcMessage[String, RpcProcedure[js.Any, js.Any], js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRpcMessageKey")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isRpcCallMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcCallMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean]
  
  @scala.inline
  def isRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean]
  
  @scala.inline
  def isRpcReturnMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcReturnMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean]
  
  @scala.inline
  def isRpcThrowMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[js.Any, js.Any] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcThrowMessage")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean]
}
