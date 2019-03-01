package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationAction extends js.Object {
  def setAuthorizationUrl(authorizationUrl: java.lang.String): AuthorizationAction
}

object AuthorizationAction {
  @scala.inline
  def apply(setAuthorizationUrl: js.Function1[java.lang.String, AuthorizationAction]): AuthorizationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationUrl")(setAuthorizationUrl)
    __obj.asInstanceOf[AuthorizationAction]
  }
}

