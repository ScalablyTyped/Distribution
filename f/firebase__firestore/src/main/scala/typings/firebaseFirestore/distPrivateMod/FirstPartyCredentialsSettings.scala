package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.firstParty_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstPartyCredentialsSettings
  extends StObject
     with CredentialsSettings {
  
  var authTokenFactory: AuthTokenFactory | Null
  
  var iamToken: String | Null
  
  var sessionIndex: String
  
  var `type`: firstParty_
}
object FirstPartyCredentialsSettings {
  
  inline def apply(sessionIndex: String): FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
    __obj.updateDynamic("type")("firstParty")
    __obj.asInstanceOf[FirstPartyCredentialsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstPartyCredentialsSettings] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenFactory(value: () => String): Self = StObject.set(x, "authTokenFactory", js.Any.fromFunction0(value))
    
    inline def setAuthTokenFactoryNull: Self = StObject.set(x, "authTokenFactory", null)
    
    inline def setIamToken(value: String): Self = StObject.set(x, "iamToken", value.asInstanceOf[js.Any])
    
    inline def setIamTokenNull: Self = StObject.set(x, "iamToken", null)
    
    inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: firstParty_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
