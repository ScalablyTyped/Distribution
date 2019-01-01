package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadIndicator extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.LoadIndicator")
@js.native
object LoadIndicator extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.LoadIndicator
  
  @js.native
  sealed trait SPINNER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.LoadIndicator
  
  val NONE: NONE with java.lang.String = js.native
  val SPINNER: SPINNER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.LoadIndicator with java.lang.String
  ] = js.native
}

