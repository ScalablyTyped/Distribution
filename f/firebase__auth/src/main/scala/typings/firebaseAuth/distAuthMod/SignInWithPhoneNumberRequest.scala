package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait SignInWithPhoneNumberRequest extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var sessionInfo: js.UndefOr[String] = js.undefined
  
  var temporaryProof: js.UndefOr[String] = js.undefined
  
  var tenantId: js.UndefOr[String] = js.undefined
}
object SignInWithPhoneNumberRequest {
  
  inline def apply(): SignInWithPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInWithPhoneNumberRequest]
  }
  
  extension [Self <: SignInWithPhoneNumberRequest](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
