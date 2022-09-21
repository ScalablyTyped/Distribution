package typings.fhir.r3Mod

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
  
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _payload: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * For rest-hook, and websocket, the end-point must be an http: or https: URL; for email, a mailto: url, for sms, a tel: url, and for message the endpoint can be in any form of url the server understands (usually, http: or mllp:). The URI is allowed to be relative; in which case, it is relative to the server end-point (since their may be more than one, clients should avoid using relative URIs).
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Exactly what these mean depend on the channel type. They can convey additional information to the recipient and/or meet security requirements; for example, support of multiple headers in the outgoing notifications for rest-hook type subscriptions.
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sending the payload has obvious security implications. The server is responsible for ensuring that the content is appropriately secured.
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * The type of channel to send notifications on.
    */
  var `type`: `rest-hook` | websocket | email | sms | message
}
object SubscriptionChannel {
  
  inline def apply(`type`: `rest-hook` | websocket | email | sms | message): SubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannel]
  }
  
  extension [Self <: SubscriptionChannel](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: `rest-hook` | websocket | email | sms | message): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    inline def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    inline def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value*))
    
    inline def set_payload(value: Element): Self = StObject.set(x, "_payload", value.asInstanceOf[js.Any])
    
    inline def set_payloadUndefined: Self = StObject.set(x, "_payload", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
