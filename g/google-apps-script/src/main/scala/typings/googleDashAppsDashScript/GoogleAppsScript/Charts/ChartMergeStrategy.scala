package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_COLUMNS
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_ROWS
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChartMergeStrategy with Double] = js.native
  /* 0 */ @js.native
  object MERGE_COLUMNS extends TopLevel[MERGE_COLUMNS with Double]
  
  /* 1 */ @js.native
  object MERGE_ROWS extends TopLevel[MERGE_ROWS with Double]
  
}

