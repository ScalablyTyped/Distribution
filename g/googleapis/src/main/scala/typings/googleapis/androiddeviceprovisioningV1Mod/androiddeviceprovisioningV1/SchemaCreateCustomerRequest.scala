package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateCustomerRequest extends StObject {
  
  /**
    * Required. The company data to populate the new customer. Must contain a value for `companyName` and at least one `owner_email` that's associated with a Google Account. The values for `companyId` and `name` must be empty.
    */
  var customer: js.UndefOr[SchemaCompany] = js.undefined
}
object SchemaCreateCustomerRequest {
  
  inline def apply(): SchemaCreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCustomerRequest]
  }
  
  extension [Self <: SchemaCreateCustomerRequest](x: Self) {
    
    inline def setCustomer(value: SchemaCompany): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
