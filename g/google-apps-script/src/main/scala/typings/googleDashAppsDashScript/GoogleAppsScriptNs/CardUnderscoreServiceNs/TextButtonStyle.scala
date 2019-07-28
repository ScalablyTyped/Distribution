package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextButtonStyle extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.TextButtonStyle")
@js.native
object TextButtonStyle extends js.Object {
  @js.native
  sealed trait FILLED extends TextButtonStyle
  
  @js.native
  sealed trait TEXT extends TextButtonStyle
  
  /* 1 */ val FILLED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle.FILLED with Double = js.native
  /* 0 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextButtonStyle with Double] = js.native
}

