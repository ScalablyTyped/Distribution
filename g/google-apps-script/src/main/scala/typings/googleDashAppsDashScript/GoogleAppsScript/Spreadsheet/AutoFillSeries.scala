package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.ALTERNATE_SERIES
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.DEFAULT_SERIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillSeries extends js.Object

/**
  * An enumeration of the types of series used to calculate auto-filled values. The manner in which
  * these series affect calculated values differs depending on the type and amount of source data.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
@js.native
object AutoFillSeries extends js.Object {
  @js.native
  sealed trait ALTERNATE_SERIES extends AutoFillSeries
  
  @js.native
  sealed trait DEFAULT_SERIES extends AutoFillSeries
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFillSeries with Double] = js.native
  /* 1 */ @js.native
  object ALTERNATE_SERIES extends TopLevel[ALTERNATE_SERIES with Double]
  
  /* 0 */ @js.native
  object DEFAULT_SERIES extends TopLevel[DEFAULT_SERIES with Double]
  
}

