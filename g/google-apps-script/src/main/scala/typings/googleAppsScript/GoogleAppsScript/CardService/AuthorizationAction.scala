package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An authorization action that will send the user to the AuthorizationUrl when clicked.
  *
  *     CardService.newAuthorizationAction()
  *       .setAuthorizationUrl("http://google.com/");
  */
@js.native
trait AuthorizationAction extends js.Object {
  
  def setAuthorizationUrl(authorizationUrl: String): AuthorizationAction = js.native
}
object AuthorizationAction {
  
  @scala.inline
  def apply(setAuthorizationUrl: String => AuthorizationAction): AuthorizationAction = {
    val __obj = js.Dynamic.literal(setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl))
    __obj.asInstanceOf[AuthorizationAction]
  }
  
  @scala.inline
  implicit class AuthorizationActionOps[Self <: AuthorizationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetAuthorizationUrl(value: String => AuthorizationAction): Self = this.set("setAuthorizationUrl", js.Any.fromFunction1(value))
  }
}
