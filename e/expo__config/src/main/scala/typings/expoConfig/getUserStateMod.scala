package typings.expoConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUserStateMod {
  
  @JSImport("@expo/config/build/getUserState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExpoHomeDirectory(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoHomeDirectory")().asInstanceOf[String]
  
  inline def getUserState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserState")().asInstanceOf[Any]
  
  inline def getUserStatePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserStatePath")().asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfig.expoConfigStrings.`Access-Token-Authentication`
    - typings.expoConfig.expoConfigStrings.`Username-Password-Authentication`
    - typings.expoConfig.expoConfigStrings.facebook
    - typings.expoConfig.expoConfigStrings.`google-oauth2`
    - typings.expoConfig.expoConfigStrings.github
  */
  trait ConnectionType extends StObject
  object ConnectionType {
    
    inline def `Access-Token-Authentication`: typings.expoConfig.expoConfigStrings.`Access-Token-Authentication` = "Access-Token-Authentication".asInstanceOf[typings.expoConfig.expoConfigStrings.`Access-Token-Authentication`]
    
    inline def `Username-Password-Authentication`: typings.expoConfig.expoConfigStrings.`Username-Password-Authentication` = "Username-Password-Authentication".asInstanceOf[typings.expoConfig.expoConfigStrings.`Username-Password-Authentication`]
    
    inline def facebook: typings.expoConfig.expoConfigStrings.facebook = "facebook".asInstanceOf[typings.expoConfig.expoConfigStrings.facebook]
    
    inline def github: typings.expoConfig.expoConfigStrings.github = "github".asInstanceOf[typings.expoConfig.expoConfigStrings.github]
    
    inline def `google-oauth2`: typings.expoConfig.expoConfigStrings.`google-oauth2` = "google-oauth2".asInstanceOf[typings.expoConfig.expoConfigStrings.`google-oauth2`]
  }
  
  trait UserData extends StObject {
    
    var appleId: js.UndefOr[String] = js.undefined
    
    var currentConnection: js.UndefOr[ConnectionType] = js.undefined
    
    var sessionSecret: js.UndefOr[String] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object UserData {
    
    inline def apply(): UserData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserData]
    }
    
    extension [Self <: UserData](x: Self) {
      
      inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
      
      inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
      
      inline def setCurrentConnection(value: ConnectionType): Self = StObject.set(x, "currentConnection", value.asInstanceOf[js.Any])
      
      inline def setCurrentConnectionUndefined: Self = StObject.set(x, "currentConnection", js.undefined)
      
      inline def setSessionSecret(value: String): Self = StObject.set(x, "sessionSecret", value.asInstanceOf[js.Any])
      
      inline def setSessionSecretUndefined: Self = StObject.set(x, "sessionSecret", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait UserSettingsData extends StObject {
    
    var PATH: js.UndefOr[String] = js.undefined
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var appleId: js.UndefOr[String] = js.undefined
    
    var auth: js.UndefOr[UserData | Null] = js.undefined
    
    var developmentCodeSigningId: js.UndefOr[String] = js.undefined
    
    var ignoreBundledBinaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var openDevToolsAtStartup: js.UndefOr[Boolean] = js.undefined
    
    var sendTo: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object UserSettingsData {
    
    inline def apply(): UserSettingsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSettingsData]
    }
    
    extension [Self <: UserSettingsData](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
      
      inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
      
      inline def setAuth(value: UserData): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDevelopmentCodeSigningId(value: String): Self = StObject.set(x, "developmentCodeSigningId", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentCodeSigningIdUndefined: Self = StObject.set(x, "developmentCodeSigningId", js.undefined)
      
      inline def setIgnoreBundledBinaries(value: js.Array[String]): Self = StObject.set(x, "ignoreBundledBinaries", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBundledBinariesUndefined: Self = StObject.set(x, "ignoreBundledBinaries", js.undefined)
      
      inline def setIgnoreBundledBinariesVarargs(value: String*): Self = StObject.set(x, "ignoreBundledBinaries", js.Array(value*))
      
      inline def setOpenDevToolsAtStartup(value: Boolean): Self = StObject.set(x, "openDevToolsAtStartup", value.asInstanceOf[js.Any])
      
      inline def setOpenDevToolsAtStartupUndefined: Self = StObject.set(x, "openDevToolsAtStartup", js.undefined)
      
      inline def setPATH(value: String): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      inline def setPATHUndefined: Self = StObject.set(x, "PATH", js.undefined)
      
      inline def setSendTo(value: String): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
      
      inline def setSendToUndefined: Self = StObject.set(x, "sendTo", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
