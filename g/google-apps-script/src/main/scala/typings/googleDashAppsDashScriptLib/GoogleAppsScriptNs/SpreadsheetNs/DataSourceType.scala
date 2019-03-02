package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
@js.native
object DataSourceType extends js.Object {
  @js.native
  sealed trait BIGQUERY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceType
  
  @js.native
  sealed trait DATA_SOURCE_TYPE_UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceType
  
  val BIGQUERY: BIGQUERY with java.lang.String = js.native
  val DATA_SOURCE_TYPE_UNSUPPORTED: DATA_SOURCE_TYPE_UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataSourceType with java.lang.String
  ] = js.native
}

