package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var authenticationType: js.UndefOr[String] = js.native
  
  /**
    * The last provider that authenticated the user.
    */
  var lastProvider: js.UndefOr[String] = js.native
  
  /**
    *  The data and time the user last used the authentication method.
    */
  var lastTimestamp: js.UndefOr[String] = js.native
  
  /**
    * The number of times the authentication method was used.
    */
  var totalCount: js.UndefOr[String] = js.native
}
object AuthenticationMethod {
  
  @scala.inline
  def apply(): AuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethod]
  }
  
  @scala.inline
  implicit class AuthenticationMethodMutableBuilder[Self <: AuthenticationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setLastProvider(value: String): Self = StObject.set(x, "lastProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastProviderUndefined: Self = StObject.set(x, "lastProvider", js.undefined)
    
    @scala.inline
    def setLastTimestamp(value: String): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
