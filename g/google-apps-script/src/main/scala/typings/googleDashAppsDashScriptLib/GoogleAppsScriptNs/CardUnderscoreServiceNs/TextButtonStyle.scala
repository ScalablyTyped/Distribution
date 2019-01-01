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
  
  val FILLED: FILLED with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.TextButtonStyle with java.lang.String
  ] = js.native
}

