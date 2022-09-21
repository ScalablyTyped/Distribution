package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListCustomersResponse extends StObject {
  
  /**
    * The customers belonging to a reseller or distributor.
    */
  var customers: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Customer]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass to ListCustomersRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListCustomersResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListCustomersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListCustomersResponse](x: Self) {
    
    inline def setCustomers(value: js.Array[SchemaGoogleCloudChannelV1Customer]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: SchemaGoogleCloudChannelV1Customer*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
