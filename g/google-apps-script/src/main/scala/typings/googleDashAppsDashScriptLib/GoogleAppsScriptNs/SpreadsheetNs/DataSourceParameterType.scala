package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceParameterType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
@js.native
object DataSourceParameterType extends js.Object {
  @js.native
  sealed trait CELL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType
  
  @js.native
  sealed trait DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType
  
  /* 1 */ val CELL: CELL with scala.Double = js.native
  /* 0 */ val DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType with scala.Double
  ] = js.native
}

