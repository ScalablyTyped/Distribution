package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethod extends StObject {
  
  /**
    * Indicates the type of authentication. Valid values are:
    *
    * - `PhoneAuth`
    * - `STAN`
    * - `ISCheck`
    * - `OFAC`
    * - `AccessCode`
    * - `AgeVerify`
    * - `SSOAuth`
    */
  var authenticationType: js.UndefOr[String] = js.undefined
  
  /**
    * The last provider that authenticated the user.
    */
  var lastProvider: js.UndefOr[String] = js.undefined
  
  /**
    *  The data and time the user last used the authentication method.
    */
  var lastTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The number of times the authentication method was used.
    */
  var totalCount: js.UndefOr[String] = js.undefined
}
object AuthenticationMethod {
  
  inline def apply(): AuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setLastProvider(value: String): Self = StObject.set(x, "lastProvider", value.asInstanceOf[js.Any])
    
    inline def setLastProviderUndefined: Self = StObject.set(x, "lastProvider", js.undefined)
    
    inline def setLastTimestamp(value: String): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
