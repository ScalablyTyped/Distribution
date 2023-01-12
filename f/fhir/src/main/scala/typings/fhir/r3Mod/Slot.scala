package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`busy-tentative`
import typings.fhir.fhirStrings.`busy-unavailable`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.busy
import typings.fhir.fhirStrings.free
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _overbooked: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The style of appointment or patient that may be booked in the slot (not service type).
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Comments on the slot to describe any extended information. Such as custom constraints on the slot.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Date/Time that the slot is to conclude.
    */
  var end: String
  
  /**
    * External Ids for this item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This slot has already been overbooked, appointments are unlikely to be accepted for this time.
    */
  var overbooked: js.UndefOr[Boolean] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Slot: typings.fhir.fhirStrings.Slot
  
  /**
    * The schedule resource that this slot defines an interval of status information.
    */
  var schedule: Reference
  
  /**
    * A broad categorisation of the service that is to be performed during this appointment.
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Date/Time that the slot is to begin.
    */
  var start: String
  
  /**
    * busy | free | busy-unavailable | busy-tentative | entered-in-error.
    */
  var status: busy | free | `busy-unavailable` | `busy-tentative` | `entered-in-error`
}
object Slot {
  
  inline def apply(
    end: String,
    schedule: Reference,
    start: String,
    status: busy | free | `busy-unavailable` | `busy-tentative` | `entered-in-error`
  ): Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], resourceType = "Slot", schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
    
    inline def setAppointmentType(value: CodeableConcept): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTypeUndefined: Self = StObject.set(x, "appointmentType", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOverbooked(value: Boolean): Self = StObject.set(x, "overbooked", value.asInstanceOf[js.Any])
    
    inline def setOverbookedUndefined: Self = StObject.set(x, "overbooked", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Slot): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: Reference): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setServiceCategory(value: CodeableConcept): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    inline def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    inline def setServiceType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: busy | free | `busy-unavailable` | `busy-tentative` | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_overbooked(value: Element): Self = StObject.set(x, "_overbooked", value.asInstanceOf[js.Any])
    
    inline def set_overbookedUndefined: Self = StObject.set(x, "_overbooked", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
