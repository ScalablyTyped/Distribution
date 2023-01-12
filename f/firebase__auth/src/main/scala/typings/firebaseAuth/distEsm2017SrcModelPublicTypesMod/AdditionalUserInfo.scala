package typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalUserInfo extends StObject {
  
  /**
    * Whether the user is new (created via sign-up) or existing (authenticated using sign-in).
    */
  val isNewUser: Boolean
  
  /**
    * Map containing IDP-specific user data.
    */
  val profile: (Record[String, Any]) | Null
  
  /**
    * Identifier for the provider used to authenticate this user.
    */
  val providerId: String | Null
  
  /**
    * The username if the provider is GitHub or Twitter.
    */
  val username: js.UndefOr[String | Null] = js.undefined
}
object AdditionalUserInfo {
  
  inline def apply(isNewUser: Boolean): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser.asInstanceOf[js.Any], profile = null, providerId = null)
    __obj.asInstanceOf[AdditionalUserInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalUserInfo] (val x: Self) extends AnyVal {
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Record[String, Any]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileNull: Self = StObject.set(x, "profile", null)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
