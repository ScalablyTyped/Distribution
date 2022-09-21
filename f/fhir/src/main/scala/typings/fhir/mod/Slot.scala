package typings.fhir.mod

import typings.fhir.fhirStrings.`busy-tentative`
import typings.fhir.fhirStrings.`busy-unavailable`
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
  
  var _freeBusyType: js.UndefOr[Element] = js.undefined
  
  var _overbooked: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * Comments on the slot to describe any extended information. Such as custom constraints on the slot.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Date/Time that the slot is to conclude.
    */
  var end: String
  
  /**
    * busy | free | busy-unavailable | busy-tentative.
    */
  var freeBusyType: busy | free | `busy-unavailable` | `busy-tentative`
  
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
    * Date/Time that the slot is to begin.
    */
  var start: String
  
  /**
    * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Slot {
  
  inline def apply(
    end: String,
    freeBusyType: busy | free | `busy-unavailable` | `busy-tentative`,
    schedule: Reference,
    start: String
  ): Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], freeBusyType = freeBusyType.asInstanceOf[js.Any], resourceType = "Slot", schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  
  extension [Self <: Slot](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFreeBusyType(value: busy | free | `busy-unavailable` | `busy-tentative`): Self = StObject.set(x, "freeBusyType", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOverbooked(value: Boolean): Self = StObject.set(x, "overbooked", value.asInstanceOf[js.Any])
    
    inline def setOverbookedUndefined: Self = StObject.set(x, "overbooked", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Slot): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: Reference): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_freeBusyType(value: Element): Self = StObject.set(x, "_freeBusyType", value.asInstanceOf[js.Any])
    
    inline def set_freeBusyTypeUndefined: Self = StObject.set(x, "_freeBusyType", js.undefined)
    
    inline def set_overbooked(value: Element): Self = StObject.set(x, "_overbooked", value.asInstanceOf[js.Any])
    
    inline def set_overbookedUndefined: Self = StObject.set(x, "_overbooked", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
