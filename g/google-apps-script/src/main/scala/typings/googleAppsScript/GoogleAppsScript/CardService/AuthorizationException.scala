package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that can be returned to trigger an authorization card to be shown to the user.
  *
  *     CardService.newAuthorizationException()
  *       .setAuthorizationUrl("http://auth.com/")
  *       .setResourceDisplayName("Example Resource")
  *       .throwException();
  */
trait AuthorizationException extends js.Object {
  def printJson(): String
  def setAuthorizationUrl(authUrl: String): AuthorizationException
  def setCustomUiCallback(callback: String): AuthorizationException
  def setResourceDisplayName(name: String): AuthorizationException
  def throwException(): Unit
}

object AuthorizationException {
  @scala.inline
  def apply(
    printJson: () => String,
    setAuthorizationUrl: String => AuthorizationException,
    setCustomUiCallback: String => AuthorizationException,
    setResourceDisplayName: String => AuthorizationException,
    throwException: () => Unit
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl), setCustomUiCallback = js.Any.fromFunction1(setCustomUiCallback), setResourceDisplayName = js.Any.fromFunction1(setResourceDisplayName), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[AuthorizationException]
  }
}

