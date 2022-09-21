package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1TransferEntitlementsResponse extends StObject {
  
  /**
    * The transferred entitlements.
    */
  var entitlements: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Entitlement]] = js.undefined
}
object SchemaGoogleCloudChannelV1TransferEntitlementsResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1TransferEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1TransferEntitlementsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1TransferEntitlementsResponse](x: Self) {
    
    inline def setEntitlements(value: js.Array[SchemaGoogleCloudChannelV1Entitlement]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: SchemaGoogleCloudChannelV1Entitlement*): Self = StObject.set(x, "entitlements", js.Array(value*))
  }
}
