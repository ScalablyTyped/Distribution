package typings.firebaseFirestore.liteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.gapi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstPartyCredentialsSettings
  extends StObject
     with CredentialsSettings {
  
  var authTokenFactory: AuthTokenFactory | Null
  
  var client: Any
  
  var iamToken: String | Null
  
  var sessionIndex: String
  
  var `type`: gapi
}
object FirstPartyCredentialsSettings {
  
  inline def apply(client: Any, sessionIndex: String): FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
    __obj.updateDynamic("type")("gapi")
    __obj.asInstanceOf[FirstPartyCredentialsSettings]
  }
  
  extension [Self <: FirstPartyCredentialsSettings](x: Self) {
    
    inline def setAuthTokenFactory(value: () => String): Self = StObject.set(x, "authTokenFactory", js.Any.fromFunction0(value))
    
    inline def setAuthTokenFactoryNull: Self = StObject.set(x, "authTokenFactory", null)
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setIamToken(value: String): Self = StObject.set(x, "iamToken", value.asInstanceOf[js.Any])
    
    inline def setIamTokenNull: Self = StObject.set(x, "iamToken", null)
    
    inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: gapi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
