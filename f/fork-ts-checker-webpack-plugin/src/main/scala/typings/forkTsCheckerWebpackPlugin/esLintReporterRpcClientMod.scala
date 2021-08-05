package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterRpcClientMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/reporter/EsLintReporterRpcClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEsLintReporterRpcClient(configuration: EsLintReporterConfiguration): ReporterRpcClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createEsLintReporterRpcClient")(configuration.asInstanceOf[js.Any]).asInstanceOf[ReporterRpcClient]
}
