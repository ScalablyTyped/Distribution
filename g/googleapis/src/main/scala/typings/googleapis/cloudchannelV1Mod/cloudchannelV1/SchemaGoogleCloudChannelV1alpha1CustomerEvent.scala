package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1CustomerEvent extends StObject {
  
  /**
    * Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of event which happened on the customer.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1CustomerEvent {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1CustomerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1CustomerEvent]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1CustomerEvent](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
