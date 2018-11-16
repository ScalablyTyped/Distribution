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
  
  val SPREADSHEET: SPREADSHEET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.DestinationType with java.lang.String
  ] = js.native
}

