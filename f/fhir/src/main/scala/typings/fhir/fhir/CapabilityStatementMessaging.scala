package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class CapabilityStatementMessagingMutableBuilder[Self <: CapabilityStatementMessaging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setEndpoint(value: js.Array[CapabilityStatementMessagingEndpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: CapabilityStatementMessagingEndpoint*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[CapabilityStatementMessagingEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CapabilityStatementMessagingEvent*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setReliableCache(value: unsignedInt): Self = StObject.set(x, "reliableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReliableCacheUndefined: Self = StObject.set(x, "reliableCache", js.undefined)
    
    @scala.inline
    def setSupportedMessage(value: js.Array[CapabilityStatementMessagingSupportedMessage]): Self = StObject.set(x, "supportedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedMessageUndefined: Self = StObject.set(x, "supportedMessage", js.undefined)
    
    @scala.inline
    def setSupportedMessageVarargs(value: CapabilityStatementMessagingSupportedMessage*): Self = StObject.set(x, "supportedMessage", js.Array(value :_*))
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_reliableCache(value: Element): Self = StObject.set(x, "_reliableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_reliableCacheUndefined: Self = StObject.set(x, "_reliableCache", js.undefined)
  }
}
