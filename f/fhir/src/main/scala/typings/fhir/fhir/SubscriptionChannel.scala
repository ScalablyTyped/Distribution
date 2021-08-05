package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The channel on which to report matches to the criteria
  */
trait SubscriptionChannel
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'payload'.
    */
  var _payload: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Where the channel points to
    */
  var endpoint: js.UndefOr[uri] = js.undefined
  
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Mimetype to send, or omit for no payload
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * rest-hook | websocket | email | sms | message
    */
  var `type`: code
}
object SubscriptionChannel {
  
  inline def apply(`type`: code): SubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannel]
  }
  
  extension [Self <: SubscriptionChannel](x: Self) {
    
    inline def setEndpoint(value: uri): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    inline def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    inline def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value :_*))
    
    inline def set_payload(value: Element): Self = StObject.set(x, "_payload", value.asInstanceOf[js.Any])
    
    inline def set_payloadUndefined: Self = StObject.set(x, "_payload", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
