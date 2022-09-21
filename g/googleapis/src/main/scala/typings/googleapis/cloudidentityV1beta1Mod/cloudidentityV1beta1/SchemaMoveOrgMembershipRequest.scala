package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveOrgMembershipRequest extends StObject {
  
  /**
    * Required. Immutable. Customer on whose membership change is made. All authorization will happen on the role assignments of this customer. Format: customers/{$customerId\} where `$customerId` is the `id` from the [Admin SDK `Customer` resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/customers). You may also use `customers/my_customer` to specify your own organization.
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. OrgUnit where the membership will be moved to. Format: orgUnits/{$orgUnitId\} where `$orgUnitId` is the `orgUnitId` from the [Admin SDK `OrgUnit` resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/orgunits).
    */
  var destinationOrgUnit: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveOrgMembershipRequest {
  
  inline def apply(): SchemaMoveOrgMembershipRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveOrgMembershipRequest]
  }
  
  extension [Self <: SchemaMoveOrgMembershipRequest](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDestinationOrgUnit(value: String): Self = StObject.set(x, "destinationOrgUnit", value.asInstanceOf[js.Any])
    
    inline def setDestinationOrgUnitNull: Self = StObject.set(x, "destinationOrgUnit", null)
    
    inline def setDestinationOrgUnitUndefined: Self = StObject.set(x, "destinationOrgUnit", js.undefined)
  }
}
