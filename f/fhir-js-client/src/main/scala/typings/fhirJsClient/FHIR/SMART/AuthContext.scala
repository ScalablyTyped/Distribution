package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authorization Context which needs to be passed to create a SMART client directly
  */
trait AuthContext extends StObject {
  
  /**
    * Password if the type of authorization in 'basic'
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Access token to be set if the type of authorization is 'bearer'
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * Type of Authorization 'none' | 'basic' | 'bearer'
    */
  var `type`: String
  
  /**
    * Username if the type of authorization in 'basic'
    */
  var username: js.UndefOr[String] = js.undefined
}
object AuthContext {
  
  @scala.inline
  def apply(`type`: String): AuthContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContext]
  }
  
  @scala.inline
  implicit class AuthContextMutableBuilder[Self <: AuthContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
