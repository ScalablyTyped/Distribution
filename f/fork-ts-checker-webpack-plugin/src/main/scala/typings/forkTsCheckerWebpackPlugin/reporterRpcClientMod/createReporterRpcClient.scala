package typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod

import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcClient", "createReporterRpcClient")
@js.native
object createReporterRpcClient extends js.Object {
  def apply[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = js.native
}

