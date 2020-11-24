package typings.fhir.fhir

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
  implicit class SubscriptionChannelOps[Self <: SubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpoint(value: Element): Self = this.set("_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_endpoint: Self = this.set("_endpoint", js.undefined)
    
    @scala.inline
    def set_headerVarargs(value: Element*): Self = this.set("_header", js.Array(value :_*))
    
    @scala.inline
    def set_header(value: js.Array[Element]): Self = this.set("_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_header: Self = this.set("_header", js.undefined)
    
    @scala.inline
    def set_payload(value: Element): Self = this.set("_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_payload: Self = this.set("_payload", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setEndpoint(value: uri): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
