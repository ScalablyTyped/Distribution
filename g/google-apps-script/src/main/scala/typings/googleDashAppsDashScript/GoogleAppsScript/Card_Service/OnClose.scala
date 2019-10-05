package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnClose extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.OnClose")
@js.native
object OnClose extends js.Object {
  @js.native
  sealed trait NOTHING extends OnClose
  
  @js.native
  sealed trait RELOAD_ADD_ON extends OnClose
  
  /* 0 */ val NOTHING: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OnClose.NOTHING with Double = js.native
  /* 1 */ val RELOAD_ADD_ON: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OnClose.RELOAD_ADD_ON with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnClose with Double] = js.native
}

