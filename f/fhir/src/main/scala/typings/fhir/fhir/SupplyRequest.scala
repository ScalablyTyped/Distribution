package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for a medication, substance or device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait SupplyRequest extends DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * When the request was made
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  
  /**
    * The kind of supply (central, non-stock, etc.)
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The origin of the supply
    */
  var deliverFrom: js.UndefOr[Reference] = js.native
  
  /**
    * The destination of the supply
    */
  var deliverTo: js.UndefOr[Reference] = js.native
  
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * When the request should be fulfilled
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When the request should be fulfilled
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  
  /**
    * When the request should be fulfilled
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  
  /**
    * The item being requested
    */
  var orderedItem: js.UndefOr[SupplyRequestOrderedItem] = js.native
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  
  /**
    * Why the supply item was requested
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Why the supply item was requested
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[SupplyRequestRequester] = js.native
  
  /**
    * draft | active | suspended +
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Who is intended to fulfill the request
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.native
}
object SupplyRequest {
  
  @scala.inline
  def apply(): SupplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyRequest]
  }
  
  @scala.inline
  implicit class SupplyRequestMutableBuilder[Self <: SupplyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDeliverFrom(value: Reference): Self = StObject.set(x, "deliverFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverFromUndefined: Self = StObject.set(x, "deliverFrom", js.undefined)
    
    @scala.inline
    def setDeliverTo(value: Reference): Self = StObject.set(x, "deliverTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverToUndefined: Self = StObject.set(x, "deliverTo", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    @scala.inline
    def setOrderedItem(value: SupplyRequestOrderedItem): Self = StObject.set(x, "orderedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedItemUndefined: Self = StObject.set(x, "orderedItem", js.undefined)
    
    @scala.inline
    def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setRequester(value: SupplyRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    @scala.inline
    def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value :_*))
    
    @scala.inline
    def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
