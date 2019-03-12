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
    printJson: () => java.lang.String,
    setAuthorizationUrl: java.lang.String => AuthorizationException,
    setCustomUiCallback: java.lang.String => AuthorizationException,
    setResourceDisplayName: java.lang.String => AuthorizationException,
    throwException: () => scala.Unit
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl), setCustomUiCallback = js.Any.fromFunction1(setCustomUiCallback), setResourceDisplayName = js.Any.fromFunction1(setResourceDisplayName), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[AuthorizationException]
  }
}

