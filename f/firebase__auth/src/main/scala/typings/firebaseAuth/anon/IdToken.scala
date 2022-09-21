package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdToken extends StObject {
  
  var idToken: js.UndefOr[String] = js.undefined
  
  var pendingCredential: js.UndefOr[String] = js.undefined
}
object IdToken {
  
  inline def apply(): IdToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdToken]
  }
  
  extension [Self <: IdToken](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setPendingCredential(value: String): Self = StObject.set(x, "pendingCredential", value.asInstanceOf[js.Any])
    
    inline def setPendingCredentialUndefined: Self = StObject.set(x, "pendingCredential", js.undefined)
  }
}
