package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementMessaging
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * An endpoint (network accessible address) to which messages and/or replies are to be sent.
    */
  var endpoint: js.UndefOr[js.Array[CapabilityStatementMessagingEndpoint]] = js.undefined
  
  /**
    * If this value is missing then the application does not implement (receiver) or depend on (sender) reliable messaging.
    */
  var reliableCache: js.UndefOr[Double] = js.undefined
  
  /**
    * This is a proposed alternative to the messaging.event structure.
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
    
    inline def setEndpointVarargs(value: CapabilityStatementMessagingEndpoint*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setReliableCache(value: Double): Self = StObject.set(x, "reliableCache", value.asInstanceOf[js.Any])
    
    inline def setReliableCacheUndefined: Self = StObject.set(x, "reliableCache", js.undefined)
    
    inline def setSupportedMessage(value: js.Array[CapabilityStatementMessagingSupportedMessage]): Self = StObject.set(x, "supportedMessage", value.asInstanceOf[js.Any])
    
    inline def setSupportedMessageUndefined: Self = StObject.set(x, "supportedMessage", js.undefined)
    
    inline def setSupportedMessageVarargs(value: CapabilityStatementMessagingSupportedMessage*): Self = StObject.set(x, "supportedMessage", js.Array(value*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
