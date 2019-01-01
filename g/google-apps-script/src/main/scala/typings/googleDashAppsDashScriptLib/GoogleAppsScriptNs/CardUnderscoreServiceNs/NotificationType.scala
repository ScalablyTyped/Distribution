package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.NotificationType")
@js.native
object NotificationType extends js.Object {
  @js.native
  sealed trait ERROR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.NotificationType
  
  @js.native
  sealed trait INFO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.NotificationType
  
  @js.native
  sealed trait WARNING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.NotificationType
  
  val ERROR: ERROR with java.lang.String = js.native
  val INFO: INFO with java.lang.String = js.native
  val WARNING: WARNING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.NotificationType with java.lang.String
  ] = js.native
}

