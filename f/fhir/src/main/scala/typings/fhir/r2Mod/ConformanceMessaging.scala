package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceMessaging
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * An endpoint (network accessible address) to which messages and/or replies are to be sent.
    */
  var endpoint: js.UndefOr[js.Array[ConformanceMessagingEndpoint]] = js.undefined
  
  /**
    * A description of the solution's support for an event at this end-point.
    */
  var event: js.Array[ConformanceMessagingEvent]
  
  /**
    * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
    */
  var reliableCache: js.UndefOr[Double] = js.undefined
}
object ConformanceMessaging {
  
  inline def apply(event: js.Array[ConformanceMessagingEvent]): ConformanceMessaging = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceMessaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConformanceMessaging] (val x: Self) extends AnyVal {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setEndpoint(value: js.Array[ConformanceMessagingEndpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: ConformanceMessagingEndpoint*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setEvent(value: js.Array[ConformanceMessagingEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventVarargs(value: ConformanceMessagingEvent*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setReliableCache(value: Double): Self = StObject.set(x, "reliableCache", value.asInstanceOf[js.Any])
    
    inline def setReliableCacheUndefined: Self = StObject.set(x, "reliableCache", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
