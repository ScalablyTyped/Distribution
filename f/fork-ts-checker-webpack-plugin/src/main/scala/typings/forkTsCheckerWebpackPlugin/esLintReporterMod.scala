package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/reporter/EsLintReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createEsLintReporter(configuration: EsLintReporterConfiguration): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createEsLintReporter")(configuration.asInstanceOf[js.Any]).asInstanceOf[Reporter]
}
