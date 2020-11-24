package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If messaging is supported
  */
@js.native
trait CapabilityStatementMessaging extends BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'reliableCache'.
    */
  var _reliableCache: js.UndefOr[Element] = js.native
  
  /**
    * Messaging interface behavior details
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Where messages should be sent
    */
  var endpoint: js.UndefOr[js.Array[CapabilityStatementMessagingEndpoint]] = js.native
  
  /**
    * Declare support for this event
    */
  var event: js.UndefOr[js.Array[CapabilityStatementMessagingEvent]] = js.native
  
  /**
    * Reliable Message Cache Length (min)
    */
  var reliableCache: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Messages supported by this system
    */
  var supportedMessage: js.UndefOr[js.Array[CapabilityStatementMessagingSupportedMessage]] = js.native
}
object CapabilityStatementMessaging {
  
  @scala.inline
  def apply(): CapabilityStatementMessaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementMessaging]
  }
  
  @scala.inline
  implicit class CapabilityStatementMessagingOps[Self <: CapabilityStatementMessaging] (val x: Self) extends AnyVal {
    
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
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    
    @scala.inline
    def set_reliableCache(value: Element): Self = this.set("_reliableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_reliableCache: Self = this.set("_reliableCache", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: CapabilityStatementMessagingEndpoint*): Self = this.set("endpoint", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: js.Array[CapabilityStatementMessagingEndpoint]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CapabilityStatementMessagingEvent*): Self = this.set("event", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[CapabilityStatementMessagingEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setReliableCache(value: unsignedInt): Self = this.set("reliableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReliableCache: Self = this.set("reliableCache", js.undefined)
    
    @scala.inline
    def setSupportedMessageVarargs(value: CapabilityStatementMessagingSupportedMessage*): Self = this.set("supportedMessage", js.Array(value :_*))
    
    @scala.inline
    def setSupportedMessage(value: js.Array[CapabilityStatementMessagingSupportedMessage]): Self = this.set("supportedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedMessage: Self = this.set("supportedMessage", js.undefined)
  }
}
