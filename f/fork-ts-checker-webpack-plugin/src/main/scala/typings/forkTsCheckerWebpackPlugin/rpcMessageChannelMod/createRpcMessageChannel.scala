package typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", "createRpcMessageChannel")
@js.native
object createRpcMessageChannel extends js.Object {
  
  def apply(servicePort: RpcMessagePort, clientPort: RpcMessagePort): RpcMessageChannel = js.native
  def apply(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.UndefOr[scala.Nothing],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
  def apply(servicePort: RpcMessagePort, clientPort: RpcMessagePort, linkPorts: js.Function0[js.Promise[Unit]]): RpcMessageChannel = js.native
  def apply(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.Function0[js.Promise[Unit]],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
}
