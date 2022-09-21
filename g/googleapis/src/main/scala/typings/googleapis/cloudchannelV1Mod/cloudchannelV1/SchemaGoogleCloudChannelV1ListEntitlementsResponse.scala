package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListEntitlementsResponse extends StObject {
  
  /**
    * The reseller customer's entitlements.
    */
  var entitlements: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Entitlement]] = js.undefined
  
  /**
    * A token to list the next page of results. Pass to ListEntitlementsRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListEntitlementsResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListEntitlementsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListEntitlementsResponse](x: Self) {
    
    inline def setEntitlements(value: js.Array[SchemaGoogleCloudChannelV1Entitlement]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: SchemaGoogleCloudChannelV1Entitlement*): Self = StObject.set(x, "entitlements", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
