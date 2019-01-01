package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenAs extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.OpenAs")
@js.native
object OpenAs extends js.Object {
  @js.native
  sealed trait FULL_SIZE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OpenAs
  
  @js.native
  sealed trait OVERLAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OpenAs
  
  val FULL_SIZE: FULL_SIZE with java.lang.String = js.native
  val OVERLAY: OVERLAY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.OpenAs with java.lang.String
  ] = js.native
}

