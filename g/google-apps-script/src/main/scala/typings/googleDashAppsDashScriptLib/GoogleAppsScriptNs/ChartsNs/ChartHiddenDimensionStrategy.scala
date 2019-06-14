package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartHiddenDimensionStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
@js.native
object ChartHiddenDimensionStrategy extends js.Object {
  @js.native
  sealed trait IGNORE_BOTH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_COLUMNS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_ROWS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait SHOW_BOTH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
  
  /* 0 */ val IGNORE_BOTH: IGNORE_BOTH with scala.Double = js.native
  /* 2 */ val IGNORE_COLUMNS: IGNORE_COLUMNS with scala.Double = js.native
  /* 1 */ val IGNORE_ROWS: IGNORE_ROWS with scala.Double = js.native
  /* 3 */ val SHOW_BOTH: SHOW_BOTH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy with scala.Double
  ] = js.native
}

