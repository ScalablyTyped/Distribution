package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnClose extends js.Object

@JSGlobal("GoogleAppsScript.Card.OnClose")
@js.native
object OnClose extends js.Object {
  @js.native
  sealed trait NOTHING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OnClose
  
  @js.native
  sealed trait RELOAD_ADD_ON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OnClose
  
  val NOTHING: NOTHING with java.lang.String = js.native
  val RELOAD_ADD_ON: RELOAD_ADD_ON with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OnClose with java.lang.String
  ] = js.native
}

