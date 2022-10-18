package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeMfaResponse extends StObject {
  
  var idToken: String
  
  var refreshToken: String
}
object FinalizeMfaResponse {
  
  inline def apply(idToken: String, refreshToken: String): FinalizeMfaResponse = {
    val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeMfaResponse]
  }
  
  extension [Self <: FinalizeMfaResponse](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
  }
}
