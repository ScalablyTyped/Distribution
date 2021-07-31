package typings.gitlab.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.servicesMod.UserGPGKeys
import typings.gitlab.servicesMod.UserImpersonationTokens
import typings.gitlab.servicesMod.UserKeys
import typings.gitlab.servicesMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCustomAttributes extends StObject {
  
  var UserCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes]
  
  var UserEmails: Instantiable0[typings.gitlab.servicesMod.UserEmails]
  
  var UserGPGKeys: Instantiable0[typings.gitlab.servicesMod.UserGPGKeys]
  
  var UserImpersonationTokens: Instantiable0[typings.gitlab.servicesMod.UserImpersonationTokens]
  
  var UserKeys: Instantiable0[typings.gitlab.servicesMod.UserKeys]
  
  var Users: Instantiable0[typings.gitlab.servicesMod.Users]
}
object UserCustomAttributes {
  
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes],
    UserEmails: Instantiable0[typings.gitlab.servicesMod.UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): UserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCustomAttributes]
  }
  
  @scala.inline
  implicit class UserCustomAttributesMutableBuilder[Self <: UserCustomAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserCustomAttributes(
      value: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes]
    ): Self = StObject.set(x, "UserCustomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmails(value: Instantiable0[typings.gitlab.servicesMod.UserEmails]): Self = StObject.set(x, "UserEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGPGKeys(value: Instantiable0[UserGPGKeys]): Self = StObject.set(x, "UserGPGKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserImpersonationTokens(value: Instantiable0[UserImpersonationTokens]): Self = StObject.set(x, "UserImpersonationTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeys(value: Instantiable0[UserKeys]): Self = StObject.set(x, "UserKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: Instantiable0[Users]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
  }
}
