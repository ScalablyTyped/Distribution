package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing my customers.
  */
trait SchemaCustomerListCustomersResponse extends StObject {
  
  /**
    * The customer accounts the calling user is a member of.
    */
  var customers: js.UndefOr[js.Array[SchemaCompany]] = js.undefined
  
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCustomerListCustomersResponse {
  
  inline def apply(): SchemaCustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListCustomersResponse]
  }
  
  extension [Self <: SchemaCustomerListCustomersResponse](x: Self) {
    
    inline def setCustomers(value: js.Array[SchemaCompany]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: SchemaCompany*): Self = StObject.set(x, "customers", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
