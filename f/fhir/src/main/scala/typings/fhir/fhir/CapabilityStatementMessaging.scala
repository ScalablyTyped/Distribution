package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If messaging is supported
  */
trait CapabilityStatementMessaging
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'reliableCache'.
    */
  var _reliableCache: js.UndefOr[Element] = js.undefined
  
  /**
    * Messaging interface behavior details
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Where messages should be sent
    */
  var endpoint: js.UndefOr[js.Array[CapabilityStatementMessagingEndpoint]] = js.undefined
  
  /**
    * Declare support for this event
    */
  var event: js.UndefOr[js.Array[CapabilityStatementMessagingEvent]] = js.undefined
  
  /**
    * Reliable Message Cache Length (min)
    */
  var reliableCache: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Messages supported by this system
    */
  var supportedMessage: js.UndefOr[js.Array[CapabilityStatementMessagingSupportedMessage]] = js.undefined
}
object CapabilityStatementMessaging {
  
  inline def apply(): CapabilityStatementMessaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementMessaging]
  }
  
  extension [Self <: CapabilityStatementMessaging](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setEndpoint(value: js.Array[CapabilityStatementMessagingEndpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: CapabilityStatementMessagingEndpoint*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    inline def setEvent(value: js.Array[CapabilityStatementMessagingEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CapabilityStatementMessagingEvent*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    inline def setReliableCache(value: unsignedInt): Self = StObject.set(x, "reliableCache", value.asInstanceOf[js.Any])
    
    inline def setReliableCacheUndefined: Self = StObject.set(x, "reliableCache", js.undefined)
    
    inline def setSupportedMessage(value: js.Array[CapabilityStatementMessagingSupportedMessage]): Self = StObject.set(x, "supportedMessage", value.asInstanceOf[js.Any])
    
    inline def setSupportedMessageUndefined: Self = StObject.set(x, "supportedMessage", js.undefined)
    
    inline def setSupportedMessageVarargs(value: CapabilityStatementMessagingSupportedMessage*): Self = StObject.set(x, "supportedMessage", js.Array(value :_*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_reliableCache(value: Element): Self = StObject.set(x, "_reliableCache", value.asInstanceOf[js.Any])
    
    inline def set_reliableCacheUndefined: Self = StObject.set(x, "_reliableCache", js.undefined)
  }
}
