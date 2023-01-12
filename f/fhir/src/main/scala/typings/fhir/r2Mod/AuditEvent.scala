package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * The event must be identified.
    */
  var event: AuditEventEvent
  
  /**
    * The event may have other objects involved.
    */
  var `object`: js.UndefOr[js.Array[AuditEventObject]] = js.undefined
  
  /**
    * The event has one or more active participants.
    */
  var participant: js.Array[AuditEventParticipant]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AuditEvent: typings.fhir.fhirStrings.AuditEvent
  
  /**
    * The event is reported by one source.
    */
  var source: AuditEventSource
}
object AuditEvent {
  
  inline def apply(event: AuditEventEvent, participant: js.Array[AuditEventParticipant], source: AuditEventSource): AuditEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], resourceType = "AuditEvent", source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: AuditEventEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setObject(value: js.Array[AuditEventObject]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setObjectVarargs(value: AuditEventObject*): Self = StObject.set(x, "object", js.Array(value*))
    
    inline def setParticipant(value: js.Array[AuditEventParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantVarargs(value: AuditEventParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AuditEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: AuditEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
