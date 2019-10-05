package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InterpolationType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
@js.native
object InterpolationType extends js.Object {
  @js.native
  sealed trait MAX extends InterpolationType
  
  @js.native
  sealed trait MIN extends InterpolationType
  
  @js.native
  sealed trait NUMBER extends InterpolationType
  
  @js.native
  sealed trait PERCENT extends InterpolationType
  
  @js.native
  sealed trait PERCENTILE extends InterpolationType
  
  /* 4 */ val MAX: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.MAX with Double = js.native
  /* 3 */ val MIN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.MIN with Double = js.native
  /* 0 */ val NUMBER: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.NUMBER with Double = js.native
  /* 1 */ val PERCENT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENT with Double = js.native
  /* 2 */ val PERCENTILE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENTILE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InterpolationType with Double] = js.native
}

