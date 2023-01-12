package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionStatusNotificationEvent
  extends StObject
     with BackboneElement {
  
  var _eventNumber: js.UndefOr[Element] = js.undefined
  
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional context information for this event. Generally, this will contain references to additional resources included with the event (e.g., the Patient relevant to an Encounter), however it MAY refer to non-FHIR objects.
    */
  var additionalContext: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The sequential number of this event in this subscription context.
    */
  var eventNumber: String
  
  /**
    * The focus of this event. While this will usually be a reference to the focus resource of the event, it MAY contain a reference to a non-FHIR object.
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
  /**
    * The actual time this event occured on the server.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SubscriptionStatusNotificationEvent {
  
  inline def apply(eventNumber: String): SubscriptionStatusNotificationEvent = {
    val __obj = js.Dynamic.literal(eventNumber = eventNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionStatusNotificationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionStatusNotificationEvent] (val x: Self) extends AnyVal {
    
    inline def setAdditionalContext(value: js.Array[Reference]): Self = StObject.set(x, "additionalContext", value.asInstanceOf[js.Any])
    
    inline def setAdditionalContextUndefined: Self = StObject.set(x, "additionalContext", js.undefined)
    
    inline def setAdditionalContextVarargs(value: Reference*): Self = StObject.set(x, "additionalContext", js.Array(value*))
    
    inline def setEventNumber(value: String): Self = StObject.set(x, "eventNumber", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def set_eventNumber(value: Element): Self = StObject.set(x, "_eventNumber", value.asInstanceOf[js.Any])
    
    inline def set_eventNumberUndefined: Self = StObject.set(x, "_eventNumber", js.undefined)
    
    inline def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
  }
}
