package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregatedReporterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/AggregatedReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  inline def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createAggregatedReporter")(reporter.asInstanceOf[js.Any]).asInstanceOf[TReporter]
}
