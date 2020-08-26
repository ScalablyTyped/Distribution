package typings.forkTsCheckerWebpackPlugin.reporterRpcServiceMod

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcService", "registerReporterRpcService")
@js.native
object registerReporterRpcService extends js.Object {
  def apply[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = js.native
}

