package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The channel on which to report matches to the criteria
  */
@js.native
trait SubscriptionChannel extends BackboneElement {
  
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'payload'.
    */
  var _payload: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Where the channel points to
    */
  var endpoint: js.UndefOr[uri] = js.native
  
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Mimetype to send, or omit for no payload
    */
  var payload: js.UndefOr[String] = js.native
  
  /**
    * rest-hook | websocket | email | sms | message
    */
  var `type`: code = js.native
}
object SubscriptionChannel {
  
  @scala.inline
  def apply(`type`: code): SubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannel]
  }
  
  @scala.inline
  implicit class SubscriptionChannelMutableBuilder[Self <: SubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: uri): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    @scala.inline
    def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    @scala.inline
    def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value :_*))
    
    @scala.inline
    def set_payload(value: Element): Self = StObject.set(x, "_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_payloadUndefined: Self = StObject.set(x, "_payload", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
