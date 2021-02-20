package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that can be returned to trigger an authorization card to be shown to the user.
  *
  *     CardService.newAuthorizationException()
  *       .setAuthorizationUrl("http://auth.com/")
  *       .setResourceDisplayName("Example Resource")
  *       .throwException();
  */
@js.native
trait AuthorizationException extends StObject {
  
  def printJson(): String = js.native
  
  def setAuthorizationUrl(authUrl: String): AuthorizationException = js.native
  
  def setCustomUiCallback(callback: String): AuthorizationException = js.native
  
  def setResourceDisplayName(name: String): AuthorizationException = js.native
  
  def throwException(): Unit = js.native
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
  
  @scala.inline
  implicit class AuthorizationExceptionMutableBuilder[Self <: AuthorizationException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAuthorizationUrl(value: String => AuthorizationException): Self = StObject.set(x, "setAuthorizationUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomUiCallback(value: String => AuthorizationException): Self = StObject.set(x, "setCustomUiCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResourceDisplayName(value: String => AuthorizationException): Self = StObject.set(x, "setResourceDisplayName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrowException(value: () => Unit): Self = StObject.set(x, "throwException", js.Any.fromFunction0(value))
  }
}
