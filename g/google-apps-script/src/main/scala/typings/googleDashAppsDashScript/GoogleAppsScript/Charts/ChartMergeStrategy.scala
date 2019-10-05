package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMergeStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
@js.native
object ChartMergeStrategy extends js.Object {
  @js.native
  sealed trait MERGE_COLUMNS extends ChartMergeStrategy
  
  @js.native
  sealed trait MERGE_ROWS extends ChartMergeStrategy
  
  /* 0 */ val MERGE_COLUMNS: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_COLUMNS with Double = js.native
  /* 1 */ val MERGE_ROWS: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_ROWS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChartMergeStrategy with Double] = js.native
}

