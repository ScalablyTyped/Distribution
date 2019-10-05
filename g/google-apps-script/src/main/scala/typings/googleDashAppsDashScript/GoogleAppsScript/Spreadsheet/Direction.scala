package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait DOWN extends Direction
  
  @js.native
  sealed trait NEXT extends Direction
  
  @js.native
  sealed trait PREVIOUS extends Direction
  
  @js.native
  sealed trait UP extends Direction
  
  /* 1 */ val DOWN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.DOWN with Double = js.native
  /* 3 */ val NEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.NEXT with Double = js.native
  /* 2 */ val PREVIOUS: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.PREVIOUS with Double = js.native
  /* 0 */ val UP: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.UP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
}

