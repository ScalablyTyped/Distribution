package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationAction extends js.Object {
  def setAuthorizationUrl(authorizationUrl: String): AuthorizationAction
}

object AuthorizationAction {
  @scala.inline
  def apply(setAuthorizationUrl: String => AuthorizationAction): AuthorizationAction = {
    val __obj = js.Dynamic.literal(setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl))
  
    __obj.asInstanceOf[AuthorizationAction]
  }
}

