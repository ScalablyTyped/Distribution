package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListSkusResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of SKUs requested.
    */
  var skus: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Sku]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListSkusResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListSkusResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListSkusResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSkus(value: js.Array[SchemaGoogleCloudChannelV1Sku]): Self = StObject.set(x, "skus", value.asInstanceOf[js.Any])
    
    inline def setSkusUndefined: Self = StObject.set(x, "skus", js.undefined)
    
    inline def setSkusVarargs(value: SchemaGoogleCloudChannelV1Sku*): Self = StObject.set(x, "skus", js.Array(value*))
  }
}
