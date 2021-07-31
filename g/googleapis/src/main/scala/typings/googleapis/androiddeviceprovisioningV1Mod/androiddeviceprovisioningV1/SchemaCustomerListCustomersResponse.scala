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
  
  @scala.inline
  def apply(): SchemaCustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListCustomersResponse]
  }
  
  @scala.inline
  implicit class SchemaCustomerListCustomersResponseMutableBuilder[Self <: SchemaCustomerListCustomersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomers(value: js.Array[SchemaCompany]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    @scala.inline
    def setCustomersVarargs(value: SchemaCompany*): Self = StObject.set(x, "customers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
