package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait IdTokenMfaResponse
  extends StObject
     with IdTokenResponse {
  
  var mfaInfo: js.UndefOr[js.Array[MfaEnrollment]] = js.undefined
  
  var mfaPendingCredential: js.UndefOr[String] = js.undefined
}
object IdTokenMfaResponse {
  
  inline def apply(localId: String): IdTokenMfaResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenMfaResponse]
  }
  
  extension [Self <: IdTokenMfaResponse](x: Self) {
    
    inline def setMfaInfo(value: js.Array[MfaEnrollment]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
    
    inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
    
    inline def setMfaInfoVarargs(value: MfaEnrollment*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
    
    inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
    
    inline def setMfaPendingCredentialUndefined: Self = StObject.set(x, "mfaPendingCredential", js.undefined)
  }
}
