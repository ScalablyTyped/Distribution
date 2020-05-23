package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceType extends js.Object

/**
  * An enumeration of data source types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
@js.native
object DataSourceType extends js.Object {
  @js.native
  sealed trait BIGQUERY extends DataSourceType
  
  @js.native
  sealed trait DATA_SOURCE_TYPE_UNSUPPORTED extends DataSourceType
  
}

