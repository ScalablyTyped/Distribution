package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnClose extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.OnClose")
@js.native
object OnClose extends js.Object {
  @js.native
  sealed trait NOTHING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OnClose
  
  @js.native
  sealed trait RELOAD_ADD_ON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OnClose
  
  /* 0 */ val NOTHING: NOTHING with scala.Double = js.native
  /* 1 */ val RELOAD_ADD_ON: RELOAD_ADD_ON with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OnClose with scala.Double
  ] = js.native
}

