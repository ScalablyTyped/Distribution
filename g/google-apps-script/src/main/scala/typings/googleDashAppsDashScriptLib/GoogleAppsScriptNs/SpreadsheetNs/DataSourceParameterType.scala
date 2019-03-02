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
  
  val CELL: CELL with java.lang.String = js.native
  val DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType with java.lang.String
  ] = js.native
}

