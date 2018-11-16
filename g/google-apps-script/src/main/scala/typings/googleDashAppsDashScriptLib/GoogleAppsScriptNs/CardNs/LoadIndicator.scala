package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadIndicator extends js.Object

@JSGlobal("GoogleAppsScript.Card.LoadIndicator")
@js.native
object LoadIndicator extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.LoadIndicator
  
  @js.native
  sealed trait SPINNER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.LoadIndicator
  
  val NONE: NONE with java.lang.String = js.native
  val SPINNER: SPINNER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.LoadIndicator with java.lang.String
  ] = js.native
}

