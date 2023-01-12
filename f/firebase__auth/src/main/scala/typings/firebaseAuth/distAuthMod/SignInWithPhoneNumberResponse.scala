package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.firebaseAuth.distAuthMod.PhoneOrOauthTokenResponse because Already inherited */ trait SignInWithPhoneNumberResponse
  extends StObject
     with IdTokenResponse {
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var temporaryProof: js.UndefOr[String] = js.undefined
}
object SignInWithPhoneNumberResponse {
  
  inline def apply(localId: String): SignInWithPhoneNumberResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInWithPhoneNumberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignInWithPhoneNumberResponse] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
  }
}
