package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationException extends js.Object {
  def printJson(): java.lang.String
  def setAuthorizationUrl(authUrl: java.lang.String): AuthorizationException
  def setCustomUiCallback(callback: java.lang.String): AuthorizationException
  def setResourceDisplayName(name: java.lang.String): AuthorizationException
  def throwException(): scala.Unit
}

object AuthorizationException {
  @scala.inline
  def apply(
    printJson: js.Function0[java.lang.String],
    setAuthorizationUrl: js.Function1[java.lang.String, AuthorizationException],
    setCustomUiCallback: js.Function1[java.lang.String, AuthorizationException],
    setResourceDisplayName: js.Function1[java.lang.String, AuthorizationException],
    throwException: js.Function0[scala.Unit]
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal(printJson = printJson, setAuthorizationUrl = setAuthorizationUrl, setCustomUiCallback = setCustomUiCallback, setResourceDisplayName = setResourceDisplayName, throwException = throwException)
  
    __obj.asInstanceOf[AuthorizationException]
  }
}

