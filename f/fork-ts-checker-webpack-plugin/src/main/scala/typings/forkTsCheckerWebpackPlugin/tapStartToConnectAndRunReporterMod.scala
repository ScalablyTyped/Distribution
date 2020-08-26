package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapStartToConnectAndRunReporter", JSImport.Namespace)
@js.native
object tapStartToConnectAndRunReporterMod extends js.Object {
  def tapStartToConnectAndRunReporter(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    reporter: ReporterRpcClient,
    configuration: ForkTsCheckerWebpackPluginConfiguration,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}

