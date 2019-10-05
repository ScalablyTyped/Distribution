package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
@js.native
object DataSourceType extends js.Object {
  @js.native
  sealed trait BIGQUERY extends DataSourceType
  
  @js.native
  sealed trait DATA_SOURCE_TYPE_UNSUPPORTED extends DataSourceType
  
  /* 1 */ val BIGQUERY: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataSourceType.BIGQUERY with Double = js.native
  /* 0 */ val DATA_SOURCE_TYPE_UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataSourceType.DATA_SOURCE_TYPE_UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceType with Double] = js.native
}

