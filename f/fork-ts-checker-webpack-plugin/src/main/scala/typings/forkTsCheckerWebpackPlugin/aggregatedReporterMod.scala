package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/AggregatedReporter", JSImport.Namespace)
@js.native
object aggregatedReporterMod extends js.Object {
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = js.native
}
