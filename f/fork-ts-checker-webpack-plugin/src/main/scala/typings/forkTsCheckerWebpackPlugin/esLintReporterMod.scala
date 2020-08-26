package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/reporter/EsLintReporter", JSImport.Namespace)
@js.native
object esLintReporterMod extends js.Object {
  def createEsLintReporter(configuration: EsLintReporterConfiguration): Reporter = js.native
}

