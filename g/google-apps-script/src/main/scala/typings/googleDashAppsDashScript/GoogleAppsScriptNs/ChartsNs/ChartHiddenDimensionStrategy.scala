package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartHiddenDimensionStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
@js.native
object ChartHiddenDimensionStrategy extends js.Object {
  @js.native
  sealed trait IGNORE_BOTH extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_COLUMNS extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_ROWS extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait SHOW_BOTH extends ChartHiddenDimensionStrategy
  
  /* 0 */ val IGNORE_BOTH: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy.IGNORE_BOTH with Double = js.native
  /* 2 */ val IGNORE_COLUMNS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy.IGNORE_COLUMNS with Double = js.native
  /* 1 */ val IGNORE_ROWS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy.IGNORE_ROWS with Double = js.native
  /* 3 */ val SHOW_BOTH: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy.SHOW_BOTH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChartHiddenDimensionStrategy with Double] = js.native
}

