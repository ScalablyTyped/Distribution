package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationType extends js.Object

@JSGlobal("GoogleAppsScript.Card.NotificationType")
@js.native
object NotificationType extends js.Object {
  @js.native
  sealed trait ERROR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.NotificationType
  
  @js.native
  sealed trait INFO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.NotificationType
  
  @js.native
  sealed trait WARNING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.NotificationType
  
  val ERROR: ERROR with java.lang.String = js.native
  val INFO: INFO with java.lang.String = js.native
  val WARNING: WARNING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.NotificationType with java.lang.String
  ] = js.native
}

