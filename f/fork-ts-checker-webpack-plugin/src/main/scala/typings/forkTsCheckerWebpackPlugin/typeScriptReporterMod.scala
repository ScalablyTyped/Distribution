package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptReporterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeScriptReporter(configuration: TypeScriptReporterConfiguration): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptReporter")(configuration.asInstanceOf[js.Any]).asInstanceOf[Reporter]
}
