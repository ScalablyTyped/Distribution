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
  
  val IGNORE_BOTH: IGNORE_BOTH with java.lang.String = js.native
  val IGNORE_COLUMNS: IGNORE_COLUMNS with java.lang.String = js.native
  val IGNORE_ROWS: IGNORE_ROWS with java.lang.String = js.native
  val SHOW_BOTH: SHOW_BOTH with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy with java.lang.String
  ] = js.native
}

