package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceParameterType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
@js.native
object DataSourceParameterType extends js.Object {
  @js.native
  sealed trait CELL extends DataSourceParameterType
  
  @js.native
  sealed trait DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED extends DataSourceParameterType
  
  /* 1 */ val CELL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType.CELL with Double = js.native
  /* 0 */ val DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataSourceParameterType.DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceParameterType with Double] = js.native
}

