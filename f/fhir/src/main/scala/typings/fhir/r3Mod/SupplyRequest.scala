package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When the request was made.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the supply is expected to come from.
    */
  var deliverFrom: js.UndefOr[Reference] = js.undefined
  
  /**
    * Where the supply is destined to go.
    */
  var deliverTo: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is assigned by the requester, and used to refer to this order in other external standards.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The item being requested.
    */
  var orderedItem: js.UndefOr[SupplyRequestOrderedItem] = js.undefined
  
  /**
    * Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * Why the supply item was requested.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why the supply item was requested.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The individual who initiated the request and has responsibility for its activation.
    */
  var requester: js.UndefOr[SupplyRequestRequester] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SupplyRequest: typings.fhir.fhirStrings.SupplyRequest
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[
    draft | active | suspended | cancelled | completed | `entered-in-error` | unknown
  ] = js.undefined
  
  /**
    * Who is intended to fulfill the request.
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
}
object SupplyRequest {
  
  inline def apply(): SupplyRequest = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyRequest")
    __obj.asInstanceOf[SupplyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupplyRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDeliverFrom(value: Reference): Self = StObject.set(x, "deliverFrom", value.asInstanceOf[js.Any])
    
    inline def setDeliverFromUndefined: Self = StObject.set(x, "deliverFrom", js.undefined)
    
    inline def setDeliverTo(value: Reference): Self = StObject.set(x, "deliverTo", value.asInstanceOf[js.Any])
    
    inline def setDeliverToUndefined: Self = StObject.set(x, "deliverTo", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOrderedItem(value: SupplyRequestOrderedItem): Self = StObject.set(x, "orderedItem", value.asInstanceOf[js.Any])
    
    inline def setOrderedItemUndefined: Self = StObject.set(x, "orderedItem", js.undefined)
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setRequester(value: SupplyRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SupplyRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | suspended | cancelled | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value*))
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
