package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message to list vendors of the partner.
  */
@js.native
trait SchemaListVendorsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  
  /**
    * List of vendors of the reseller partner. Fields `name`, `companyId` and
    * `companyName` are populated to the Company object.
    */
  var vendors: js.UndefOr[js.Array[SchemaCompany]] = js.native
}
object SchemaListVendorsResponse {
  
  @scala.inline
  def apply(): SchemaListVendorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVendorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListVendorsResponseMutableBuilder[Self <: SchemaListVendorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    @scala.inline
    def setVendors(value: js.Array[SchemaCompany]): Self = StObject.set(x, "vendors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorsUndefined: Self = StObject.set(x, "vendors", js.undefined)
    
    @scala.inline
    def setVendorsVarargs(value: SchemaCompany*): Self = StObject.set(x, "vendors", js.Array(value :_*))
  }
}
