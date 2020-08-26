package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptReporterRpcClient", JSImport.Namespace)
@js.native
object typeScriptReporterRpcClientMod extends js.Object {
  def createTypeScriptReporterRpcClient(configuration: TypeScriptReporterConfiguration): ReporterRpcClient = js.native
}

