package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest extends StObject {
  
  /**
    * CloudIdentity-specific customer information.
    */
  var cloudIdentityInfo: js.UndefOr[SchemaGoogleCloudChannelV1CloudIdentityInfo] = js.undefined
  
  /**
    * Admin user information.
    */
  var user: js.UndefOr[SchemaGoogleCloudChannelV1AdminUser] = js.undefined
  
  /**
    * Validate the request and preview the review, but do not post it.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest](x: Self) {
    
    inline def setCloudIdentityInfo(value: SchemaGoogleCloudChannelV1CloudIdentityInfo): Self = StObject.set(x, "cloudIdentityInfo", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityInfoUndefined: Self = StObject.set(x, "cloudIdentityInfo", js.undefined)
    
    inline def setUser(value: SchemaGoogleCloudChannelV1AdminUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
