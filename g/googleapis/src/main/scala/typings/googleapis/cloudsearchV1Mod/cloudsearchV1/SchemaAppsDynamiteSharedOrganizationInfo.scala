package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOrganizationInfo extends StObject {
  
  var consumerInfo: js.UndefOr[SchemaAppsDynamiteSharedOrganizationInfoConsumerInfo] = js.undefined
  
  var customerInfo: js.UndefOr[SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo] = js.undefined
}
object SchemaAppsDynamiteSharedOrganizationInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedOrganizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOrganizationInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOrganizationInfo](x: Self) {
    
    inline def setConsumerInfo(value: SchemaAppsDynamiteSharedOrganizationInfoConsumerInfo): Self = StObject.set(x, "consumerInfo", value.asInstanceOf[js.Any])
    
    inline def setConsumerInfoUndefined: Self = StObject.set(x, "consumerInfo", js.undefined)
    
    inline def setCustomerInfo(value: SchemaAppsDynamiteSharedOrganizationInfoCustomerInfo): Self = StObject.set(x, "customerInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomerInfoUndefined: Self = StObject.set(x, "customerInfo", js.undefined)
  }
}
