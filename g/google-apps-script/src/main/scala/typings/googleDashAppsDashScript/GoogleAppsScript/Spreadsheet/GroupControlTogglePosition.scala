package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupControlTogglePosition extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
@js.native
object GroupControlTogglePosition extends js.Object {
  @js.native
  sealed trait AFTER extends GroupControlTogglePosition
  
  @js.native
  sealed trait BEFORE extends GroupControlTogglePosition
  
  /* 1 */ val AFTER: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.AFTER with Double = js.native
  /* 0 */ val BEFORE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.BEFORE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupControlTogglePosition with Double] = js.native
}

