package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcMessagePortMod {
  
  type RpcErrorListener = js.Function1[/* error */ typings.std.Error, scala.Unit]
  
  type RpcMessageDispatch = js.Function1[/* message */ js.Any, js.Promise[scala.Unit]]
  
  type RpcMessageListener = typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessageDispatch
}
