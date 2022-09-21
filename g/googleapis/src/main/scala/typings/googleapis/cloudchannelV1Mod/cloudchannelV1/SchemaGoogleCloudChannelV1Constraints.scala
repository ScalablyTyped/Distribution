package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Constraints extends StObject {
  
  /**
    * Represents constraints required to purchase the Offer for a customer.
    */
  var customerConstraints: js.UndefOr[SchemaGoogleCloudChannelV1CustomerConstraints] = js.undefined
}
object SchemaGoogleCloudChannelV1Constraints {
  
  inline def apply(): SchemaGoogleCloudChannelV1Constraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Constraints]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Constraints](x: Self) {
    
    inline def setCustomerConstraints(value: SchemaGoogleCloudChannelV1CustomerConstraints): Self = StObject.set(x, "customerConstraints", value.asInstanceOf[js.Any])
    
    inline def setCustomerConstraintsUndefined: Self = StObject.set(x, "customerConstraints", js.undefined)
  }
}
