package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo extends StObject {
  
  var customerId: js.UndefOr[SchemaCustomerId] = js.undefined
}
object SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo](x: Self) {
    
    inline def setCustomerId(value: SchemaCustomerId): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
