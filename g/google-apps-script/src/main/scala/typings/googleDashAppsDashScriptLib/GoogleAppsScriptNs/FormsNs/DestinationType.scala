package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DestinationType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.DestinationType")
@js.native
object DestinationType extends js.Object {
  @js.native
  sealed trait SPREADSHEET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.DestinationType
  
  /* 0 */ val SPREADSHEET: SPREADSHEET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.DestinationType with scala.Double
  ] = js.native
}

