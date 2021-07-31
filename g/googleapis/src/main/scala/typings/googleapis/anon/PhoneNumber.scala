package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var federatedId: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var providerId: js.UndefOr[String] = js.undefined
  
  var rawId: js.UndefOr[String] = js.undefined
  
  var screenName: js.UndefOr[String] = js.undefined
}
object PhoneNumber {
  
  @scala.inline
  def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @scala.inline
  implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    @scala.inline
    def setRawId(value: String): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawIdUndefined: Self = StObject.set(x, "rawId", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
  }
}
