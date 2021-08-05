package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptReporterRpcClientMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptReporterRpcClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeScriptReporterRpcClient(configuration: TypeScriptReporterConfiguration): ReporterRpcClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptReporterRpcClient")(configuration.asInstanceOf[js.Any]).asInstanceOf[ReporterRpcClient]
}
