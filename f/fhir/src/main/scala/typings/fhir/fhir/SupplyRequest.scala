package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for a medication, substance or device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait SupplyRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When the request was made
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * The kind of supply (central, non-stock, etc.)
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The origin of the supply
    */
  var deliverFrom: js.UndefOr[Reference] = js.undefined
  
  /**
    * The destination of the supply
    */
  var deliverTo: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When the request should be fulfilled
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When the request should be fulfilled
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When the request should be fulfilled
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The item being requested
    */
  var orderedItem: js.UndefOr[SupplyRequestOrderedItem] = js.undefined
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Why the supply item was requested
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why the supply item was requested
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[SupplyRequestRequester] = js.undefined
  
  /**
    * draft | active | suspended +
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Who is intended to fulfill the request
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
}
object SupplyRequest {
  
  inline def apply(): SupplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyRequest]
  }
  
  extension [Self <: SupplyRequest](x: Self) {
    
    inline def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDeliverFrom(value: Reference): Self = StObject.set(x, "deliverFrom", value.asInstanceOf[js.Any])
    
    inline def setDeliverFromUndefined: Self = StObject.set(x, "deliverFrom", js.undefined)
    
    inline def setDeliverTo(value: Reference): Self = StObject.set(x, "deliverTo", value.asInstanceOf[js.Any])
    
    inline def setDeliverToUndefined: Self = StObject.set(x, "deliverTo", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOrderedItem(value: SupplyRequestOrderedItem): Self = StObject.set(x, "orderedItem", value.asInstanceOf[js.Any])
    
    inline def setOrderedItemUndefined: Self = StObject.set(x, "orderedItem", js.undefined)
    
    inline def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setRequester(value: SupplyRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value :_*))
    
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
