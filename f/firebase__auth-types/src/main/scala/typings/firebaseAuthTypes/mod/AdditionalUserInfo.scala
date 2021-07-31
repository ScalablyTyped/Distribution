package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalUserInfo extends StObject {
  
  var isNewUser: Boolean
  
  var profile: js.Object | Null
  
  var providerId: String
  
  var username: js.UndefOr[String | Null] = js.undefined
}
object AdditionalUserInfo {
  
  @scala.inline
  def apply(isNewUser: Boolean, providerId: String): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], profile = null)
    __obj.asInstanceOf[AdditionalUserInfo]
  }
  
  @scala.inline
  implicit class AdditionalUserInfoMutableBuilder[Self <: AdditionalUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNull: Self = StObject.set(x, "profile", null)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameNull: Self = StObject.set(x, "username", null)
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
