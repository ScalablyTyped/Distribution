package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristicTimeFromEvent
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _eventDateTime: js.UndefOr[Element] = js.undefined
  
  var _eventId: js.UndefOr[Element] = js.undefined
  
  /**
    * Human readable description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The event used as a base point (reference point) in time.
    */
  var eventCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The event used as a base point (reference point) in time.
    */
  var eventDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The event used as a base point (reference point) in time.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * The event used as a base point (reference point) in time.
    */
  var eventReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the timeFromEvent.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Used to express the observation at a defined amount of time before or after the event.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Used to express the observation within a period before and/or after the event.
    */
  var range: js.UndefOr[Range] = js.undefined
}
object EvidenceVariableCharacteristicTimeFromEvent {
  
  inline def apply(): EvidenceVariableCharacteristicTimeFromEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceVariableCharacteristicTimeFromEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableCharacteristicTimeFromEvent] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "eventCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setEventCodeableConceptUndefined: Self = StObject.set(x, "eventCodeableConcept", js.undefined)
    
    inline def setEventDateTime(value: String): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventReference(value: Reference): Self = StObject.set(x, "eventReference", value.asInstanceOf[js.Any])
    
    inline def setEventReferenceUndefined: Self = StObject.set(x, "eventReference", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_eventDateTime(value: Element): Self = StObject.set(x, "_eventDateTime", value.asInstanceOf[js.Any])
    
    inline def set_eventDateTimeUndefined: Self = StObject.set(x, "_eventDateTime", js.undefined)
    
    inline def set_eventId(value: Element): Self = StObject.set(x, "_eventId", value.asInstanceOf[js.Any])
    
    inline def set_eventIdUndefined: Self = StObject.set(x, "_eventId", js.undefined)
  }
}
