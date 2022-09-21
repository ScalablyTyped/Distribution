package typings.firebase.anon

import typings.firebase.firebaseMod.firebase.EmulatorMockTokenOptions
import typings.firebase.firebaseStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sub :string} & std.Partial<firebase.firebase/compat.firebase.FirebaseIdToken> */
trait substringPartialFirebaseI
  extends StObject
     with EmulatorMockTokenOptions {
  
  var aud: js.UndefOr[String] = js.undefined
  
  var auth_time: js.UndefOr[Double] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var firebase: js.UndefOr[Identities] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var iss: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var picture: js.UndefOr[String] = js.undefined
  
  var provider_id: js.UndefOr[anonymous] = js.undefined
  
  var sub: String & js.UndefOr[String]
  
  var user_id: js.UndefOr[String] = js.undefined
}
object substringPartialFirebaseI {
  
  inline def apply(sub: String & js.UndefOr[String]): substringPartialFirebaseI = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[substringPartialFirebaseI]
  }
  
  extension [Self <: substringPartialFirebaseI](x: Self) {
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    inline def setAuth_timeUndefined: Self = StObject.set(x, "auth_time", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setFirebase(value: Identities): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
    
    inline def setFirebaseUndefined: Self = StObject.set(x, "firebase", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setProvider_id(value: anonymous): Self = StObject.set(x, "provider_id", value.asInstanceOf[js.Any])
    
    inline def setProvider_idUndefined: Self = StObject.set(x, "provider_id", js.undefined)
    
    inline def setSub(value: String & js.UndefOr[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
