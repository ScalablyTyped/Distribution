package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SupplyRequestOps[Self <: SupplyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = this.set("authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthoredOn: Self = this.set("authoredOn", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDeliverFrom(value: Reference): Self = this.set("deliverFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverFrom: Self = this.set("deliverFrom", js.undefined)
    @scala.inline
    def setDeliverTo(value: Reference): Self = this.set("deliverTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverTo: Self = this.set("deliverTo", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = this.set("occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceDateTime: Self = this.set("occurrenceDateTime", js.undefined)
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = this.set("occurrencePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrencePeriod: Self = this.set("occurrencePeriod", js.undefined)
    @scala.inline
    def setOccurrenceTiming(value: Timing): Self = this.set("occurrenceTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceTiming: Self = this.set("occurrenceTiming", js.undefined)
    @scala.inline
    def setOrderedItem(value: SupplyRequestOrderedItem): Self = this.set("orderedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedItem: Self = this.set("orderedItem", js.undefined)
    @scala.inline
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = this.set("reasonCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCodeableConcept: Self = this.set("reasonCodeableConcept", js.undefined)
    @scala.inline
    def setReasonReference(value: Reference): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    @scala.inline
    def setRequester(value: SupplyRequestRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSupplierVarargs(value: Reference*): Self = this.set("supplier", js.Array(value :_*))
    @scala.inline
    def setSupplier(value: js.Array[Reference]): Self = this.set("supplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplier: Self = this.set("supplier", js.undefined)
  }
  
}

