package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListTransferableSkusResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass to ListTransferableSkusRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about existing SKUs for a customer that needs a transfer.
    */
  var transferableSkus: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1TransferableSku]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListTransferableSkusResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListTransferableSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListTransferableSkusResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListTransferableSkusResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferableSkus(value: js.Array[SchemaGoogleCloudChannelV1TransferableSku]): Self = StObject.set(x, "transferableSkus", value.asInstanceOf[js.Any])
    
    inline def setTransferableSkusUndefined: Self = StObject.set(x, "transferableSkus", js.undefined)
    
    inline def setTransferableSkusVarargs(value: SchemaGoogleCloudChannelV1TransferableSku*): Self = StObject.set(x, "transferableSkus", js.Array(value*))
  }
}
