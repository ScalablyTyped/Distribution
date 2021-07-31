package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An authorization action that will send the user to the AuthorizationUrl when clicked.
  *
  *     CardService.newAuthorizationAction()
  *       .setAuthorizationUrl("http://google.com/");
  */
trait AuthorizationAction extends StObject {
  
  def setAuthorizationUrl(authorizationUrl: String): AuthorizationAction
}
object AuthorizationAction {
  
  @scala.inline
  def apply(setAuthorizationUrl: String => AuthorizationAction): AuthorizationAction = {
    val __obj = js.Dynamic.literal(setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl))
    __obj.asInstanceOf[AuthorizationAction]
  }
  
  @scala.inline
  implicit class AuthorizationActionMutableBuilder[Self <: AuthorizationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAuthorizationUrl(value: String => AuthorizationAction): Self = StObject.set(x, "setAuthorizationUrl", js.Any.fromFunction1(value))
  }
}
