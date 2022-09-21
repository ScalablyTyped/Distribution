package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest extends StObject {
  
  /**
    * Required. The entitlements to transfer to Google.
    */
  var entitlements: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Entitlement]] = js.undefined
  
  /**
    * Optional. You can specify an optional unique request ID, and if you need to retry your request, the server will know to ignore the request if it's complete. For example, you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if it received the original operation with the same request ID. If it did, it will ignore the second request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest](x: Self) {
    
    inline def setEntitlements(value: js.Array[SchemaGoogleCloudChannelV1Entitlement]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: SchemaGoogleCloudChannelV1Entitlement*): Self = StObject.set(x, "entitlements", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
