package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest extends StObject {
  
  /**
    * Required. Domain to fetch for Cloud Identity account customer.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
