package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceType with Double] = js.native
  /* 1 */ @js.native
  object BIGQUERY extends TopLevel[BIGQUERY with Double]
  
  /* 0 */ @js.native
  object DATA_SOURCE_TYPE_UNSUPPORTED extends TopLevel[DATA_SOURCE_TYPE_UNSUPPORTED with Double]
  
}

