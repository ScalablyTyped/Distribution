package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextButtonStyle extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.TextButtonStyle")
@js.native
object TextButtonStyle extends js.Object {
  @js.native
  sealed trait FILLED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle
  
  @js.native
  sealed trait TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle
  
  /* 1 */ val FILLED: FILLED with scala.Double = js.native
  /* 0 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle with scala.Double
  ] = js.native
}

