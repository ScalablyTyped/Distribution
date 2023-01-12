package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`rest-hook`
import typings.fhir.fhirStrings.email
import typings.fhir.fhirStrings.message
import typings.fhir.fhirStrings.sms
import typings.fhir.fhirStrings.websocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionChannel
  extends StObject
     with BackboneElement {
  
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  var _header: js.UndefOr[Element] = js.undefined
  
  var _payload: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The uri that describes the actual end-point to send messages to.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Additional headers / information to send as part of the notification.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
    */
  var payload: String
  
  /**
    * The type of channel to send notifications on.
    */
  var `type`: `rest-hook` | websocket | email | sms | message
}
object SubscriptionChannel {
  
  inline def apply(payload: String, `type`: `rest-hook` | websocket | email | sms | message): SubscriptionChannel = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionChannel] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: `rest-hook` | websocket | email | sms | message): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_header(value: Element): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    inline def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    inline def set_payload(value: Element): Self = StObject.set(x, "_payload", value.asInstanceOf[js.Any])
    
    inline def set_payloadUndefined: Self = StObject.set(x, "_payload", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
