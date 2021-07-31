package typings.firebaseTokenGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenOptions extends StObject {
  
  var admin: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var expires: js.UndefOr[Double] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var notBefore: js.UndefOr[Double] = js.undefined
  
  var simulate: js.UndefOr[Boolean] = js.undefined
}
object TokenOptions {
  
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  
  @scala.inline
  implicit class TokenOptionsMutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    @scala.inline
    def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    @scala.inline
    def setSimulate(value: Boolean): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
  }
}
