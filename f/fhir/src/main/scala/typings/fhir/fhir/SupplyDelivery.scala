package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Delivery of bulk Supplies
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait SupplyDelivery extends DomainResource {
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Where the Supply was sent
    */
  var destination: js.UndefOr[Reference] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * When event occurred
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When event occurred
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * When event occurred
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Patient for whom the item is supplied
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Who collected the Supply
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * in-progress | completed | abandoned | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * The item that is delivered or supplied
    */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.native
  /**
    * Dispenser
    */
  var supplier: js.UndefOr[Reference] = js.native
  /**
    * Category of dispense event
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object SupplyDelivery {
  @scala.inline
  def apply(): SupplyDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDelivery]
  }
  @scala.inline
  implicit class SupplyDeliveryOps[Self <: SupplyDelivery] (val x: Self) extends AnyVal {
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
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    @scala.inline
    def setDestination(value: Reference): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
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
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    @scala.inline
    def setReceiverVarargs(value: Reference*): Self = this.set("receiver", js.Array(value :_*))
    @scala.inline
    def setReceiver(value: js.Array[Reference]): Self = this.set("receiver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSuppliedItem(value: SupplyDeliverySuppliedItem): Self = this.set("suppliedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppliedItem: Self = this.set("suppliedItem", js.undefined)
    @scala.inline
    def setSupplier(value: Reference): Self = this.set("supplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplier: Self = this.set("supplier", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

