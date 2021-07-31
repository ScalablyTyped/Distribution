package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to create a customer.
  */
trait SchemaCreateCustomerRequest extends StObject {
  
  /**
    * Required. The company data to populate the new customer. Must contain a
    * value for `companyName` and at least one `owner_email` that&#39;s
    * associated with a Google Account. The values for `companyId` and `name`
    * must be empty.
    */
  var customer: js.UndefOr[SchemaCompany] = js.undefined
}
object SchemaCreateCustomerRequest {
  
  @scala.inline
  def apply(): SchemaCreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCustomerRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateCustomerRequestMutableBuilder[Self <: SchemaCreateCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: SchemaCompany): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
