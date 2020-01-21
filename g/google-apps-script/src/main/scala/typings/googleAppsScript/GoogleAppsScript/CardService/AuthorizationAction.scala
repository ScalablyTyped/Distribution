package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An authorization action that will send the user to the AuthorizationUrl when clicked.
  *
  *     CardService.newAuthorizationAction()
  *       .setAuthorizationUrl("http://google.com/");
  */
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

