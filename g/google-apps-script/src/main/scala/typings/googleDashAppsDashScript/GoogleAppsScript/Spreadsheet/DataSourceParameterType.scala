package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.CELL
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceParameterType extends js.Object

/**
  * An enumeration of data source parameter types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
@js.native
object DataSourceParameterType extends js.Object {
  @js.native
  sealed trait CELL extends DataSourceParameterType
  
  @js.native
  sealed trait DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED extends DataSourceParameterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceParameterType with Double] = js.native
  /* 1 */ @js.native
  object CELL extends TopLevel[CELL with Double]
  
  /* 0 */ @js.native
  object DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED extends TopLevel[DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED with Double]
  
}

