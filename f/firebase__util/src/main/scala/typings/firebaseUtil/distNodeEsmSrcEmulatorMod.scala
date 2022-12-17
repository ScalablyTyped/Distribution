package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseUtil.anon.Signinprovider
import typings.firebaseUtil.firebaseUtilStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcEmulatorMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/emulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockUserToken(token: EmulatorMockTokenOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockUserToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createMockUserToken(token: EmulatorMockTokenOptions, projectId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockUserToken")(token.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.anon.useridstringPartialFireba
    - typings.firebaseUtil.anon.substringPartialFirebaseI
  */
  trait EmulatorMockTokenOptions extends StObject
  object EmulatorMockTokenOptions {
    
    inline def substringPartialFirebaseI(sub: String): typings.firebaseUtil.anon.substringPartialFirebaseI = {
      val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseUtil.anon.substringPartialFirebaseI]
    }
    
    inline def useridstringPartialFireba(user_id: String): typings.firebaseUtil.anon.useridstringPartialFireba = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseUtil.anon.useridstringPartialFireba]
    }
  }
  
  trait FirebaseIdToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var aud: String
    
    var auth_time: Double
    
    var email: js.UndefOr[String] = js.undefined
    
    var email_verified: js.UndefOr[Boolean] = js.undefined
    
    var exp: Double
    
    var firebase: Signinprovider
    
    var iat: Double
    
    var iss: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var picture: js.UndefOr[String] = js.undefined
    
    var provider_id: js.UndefOr[anonymous] = js.undefined
    
    var sub: String
    
    var uid: js.UndefOr[scala.Nothing] = js.undefined
    
    var user_id: String
  }
  object FirebaseIdToken {
    
    inline def apply(
      aud: String,
      auth_time: Double,
      exp: Double,
      firebase: Signinprovider,
      iat: Double,
      iss: String,
      sub: String,
      user_id: String
    ): FirebaseIdToken = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseIdToken]
    }
    
    extension [Self <: FirebaseIdToken](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFirebase(value: Signinprovider): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setProvider_id(value: anonymous): Self = StObject.set(x, "provider_id", value.asInstanceOf[js.Any])
      
      inline def setProvider_idUndefined: Self = StObject.set(x, "provider_id", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.firebaseUtilStrings.custom
    - typings.firebaseUtil.firebaseUtilStrings.email
    - typings.firebaseUtil.firebaseUtilStrings.password
    - typings.firebaseUtil.firebaseUtilStrings.phone
    - typings.firebaseUtil.firebaseUtilStrings.anonymous
    - typings.firebaseUtil.firebaseUtilStrings.googleDotcom
    - typings.firebaseUtil.firebaseUtilStrings.facebookDotcom
    - typings.firebaseUtil.firebaseUtilStrings.githubDotcom
    - typings.firebaseUtil.firebaseUtilStrings.twitterDotcom
    - typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom
    - typings.firebaseUtil.firebaseUtilStrings.appleDotcom
  */
  trait FirebaseSignInProvider extends StObject
  object FirebaseSignInProvider {
    
    inline def anonymous: typings.firebaseUtil.firebaseUtilStrings.anonymous = "anonymous".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.anonymous]
    
    inline def appleDotcom: typings.firebaseUtil.firebaseUtilStrings.appleDotcom = "apple.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.appleDotcom]
    
    inline def custom: typings.firebaseUtil.firebaseUtilStrings.custom = "custom".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.custom]
    
    inline def email: typings.firebaseUtil.firebaseUtilStrings.email = "email".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.email]
    
    inline def facebookDotcom: typings.firebaseUtil.firebaseUtilStrings.facebookDotcom = "facebook.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.facebookDotcom]
    
    inline def githubDotcom: typings.firebaseUtil.firebaseUtilStrings.githubDotcom = "github.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.githubDotcom]
    
    inline def googleDotcom: typings.firebaseUtil.firebaseUtilStrings.googleDotcom = "google.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.googleDotcom]
    
    inline def microsoftDotcom: typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom = "microsoft.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom]
    
    inline def password: typings.firebaseUtil.firebaseUtilStrings.password = "password".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.password]
    
    inline def phone: typings.firebaseUtil.firebaseUtilStrings.phone = "phone".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.phone]
    
    inline def twitterDotcom: typings.firebaseUtil.firebaseUtilStrings.twitterDotcom = "twitter.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.twitterDotcom]
  }
}
