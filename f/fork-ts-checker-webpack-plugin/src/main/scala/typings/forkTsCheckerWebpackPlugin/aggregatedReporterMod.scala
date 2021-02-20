package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregatedReporterMod {
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/AggregatedReporter", "createAggregatedReporter")
  @js.native
  def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = js.native
}
