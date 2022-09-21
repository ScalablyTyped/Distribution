package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListPurchasableSkusResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of SKUs requested.
    */
  var purchasableSkus: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1PurchasableSku]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListPurchasableSkusResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListPurchasableSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListPurchasableSkusResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPurchasableSkus(value: js.Array[SchemaGoogleCloudChannelV1PurchasableSku]): Self = StObject.set(x, "purchasableSkus", value.asInstanceOf[js.Any])
    
    inline def setPurchasableSkusUndefined: Self = StObject.set(x, "purchasableSkus", js.undefined)
    
    inline def setPurchasableSkusVarargs(value: SchemaGoogleCloudChannelV1PurchasableSku*): Self = StObject.set(x, "purchasableSkus", js.Array(value*))
  }
}
