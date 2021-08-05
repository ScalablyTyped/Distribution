package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message to list vendors of the partner.
  */
trait SchemaListVendorsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
  
  /**
    * List of vendors of the reseller partner. Fields `name`, `companyId` and
    * `companyName` are populated to the Company object.
    */
  var vendors: js.UndefOr[js.Array[SchemaCompany]] = js.undefined
}
object SchemaListVendorsResponse {
  
  inline def apply(): SchemaListVendorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVendorsResponse]
  }
  
  extension [Self <: SchemaListVendorsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    inline def setVendors(value: js.Array[SchemaCompany]): Self = StObject.set(x, "vendors", value.asInstanceOf[js.Any])
    
    inline def setVendorsUndefined: Self = StObject.set(x, "vendors", js.undefined)
    
    inline def setVendorsVarargs(value: SchemaCompany*): Self = StObject.set(x, "vendors", js.Array(value :_*))
  }
}
