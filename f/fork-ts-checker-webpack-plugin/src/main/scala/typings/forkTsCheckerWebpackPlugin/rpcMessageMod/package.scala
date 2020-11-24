package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcMessageMod {
  
  type RpcCall[TProcedure /* <: typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.call, 
    TProcedure, 
    typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload[TProcedure]
  ]
  
  type RpcReturn[TProcedure /* <: typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`return`, 
    TProcedure, 
    typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult[TProcedure]
  ]
  
  type RpcThrow[TProcedure /* <: typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`throw`, 
    TProcedure, 
    typings.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcRemoteError
  ]
}
