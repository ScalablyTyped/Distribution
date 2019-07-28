package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DestinationType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.DestinationType")
@js.native
object DestinationType extends js.Object {
  @js.native
  sealed trait SPREADSHEET extends DestinationType
  
  /* 0 */ val SPREADSHEET: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.DestinationType.SPREADSHEET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DestinationType with Double] = js.native
}

