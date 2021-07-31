package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartMergeStrategy extends StObject
/**
  * An enumeration of how multiple ranges in the source are expressed in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
@js.native
object ChartMergeStrategy extends StObject {
  
  @js.native
  sealed trait MERGE_COLUMNS
    extends StObject
       with ChartMergeStrategy
  
  @js.native
  sealed trait MERGE_ROWS
    extends StObject
       with ChartMergeStrategy
}
