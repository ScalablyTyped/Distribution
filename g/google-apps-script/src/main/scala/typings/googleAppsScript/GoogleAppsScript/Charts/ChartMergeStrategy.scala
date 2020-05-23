package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMergeStrategy extends js.Object

/**
  * An enumeration of how multiple ranges in the source are expressed in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
@js.native
object ChartMergeStrategy extends js.Object {
  @js.native
  sealed trait MERGE_COLUMNS extends ChartMergeStrategy
  
  @js.native
  sealed trait MERGE_ROWS extends ChartMergeStrategy
  
}

