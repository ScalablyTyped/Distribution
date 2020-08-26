package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ChargeItem extends DomainResource {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'enteredDate'.
    */
  var _enteredDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factorOverride'.
    */
  var _factorOverride: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'overrideReason'.
    */
  var _overrideReason: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Account to place this charge
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Anatomical location, if relevant
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * A code that identifies the charge, like a billing code
    */
  var code: CodeableConcept = js.native
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Defining information about the code of this charge item
    */
  var definition: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Date the charge item was entered
    */
  var enteredDate: js.UndefOr[dateTime] = js.native
  /**
    * Individual who was entering
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Factor overriding the associated rules
    */
  var factorOverride: js.UndefOr[decimal] = js.native
  /**
    * Business Identifier for item
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Comments made about the ChargeItem
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When the charged service was applied
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When the charged service was applied
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * When the charged service was applied
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  /**
    * Reason for overriding the list price/factor
    */
  var overrideReason: js.UndefOr[String] = js.native
  /**
    * Part of referenced ChargeItem
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who performed charged service
    */
  var participant: js.UndefOr[js.Array[ChargeItemParticipant]] = js.native
  /**
    * Organization providing the charged sevice
    */
  var performingOrganization: js.UndefOr[Reference] = js.native
  /**
    * Price overriding the associated rules
    */
  var priceOverride: js.UndefOr[Money] = js.native
  /**
    * Quantity of which the charge item has been serviced
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Why was the charged  service rendered?
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Organization requesting the charged service
    */
  var requestingOrganization: js.UndefOr[Reference] = js.native
  /**
    * Which rendered service is being charged?
    */
  var service: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Individual service was done for/to
    */
  var subject: Reference = js.native
  /**
    * Further information supporting the this charge
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object ChargeItem {
  @scala.inline
  def apply(code: CodeableConcept, status: code, subject: Reference): ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItem]
  }
  @scala.inline
  implicit class ChargeItemOps[Self <: ChargeItem] (val x: Self) extends AnyVal {
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def set_definitionVarargs(value: Element*): Self = this.set("_definition", js.Array(value :_*))
    @scala.inline
    def set_definition(value: js.Array[Element]): Self = this.set("_definition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    @scala.inline
    def set_enteredDate(value: Element): Self = this.set("_enteredDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_enteredDate: Self = this.set("_enteredDate", js.undefined)
    @scala.inline
    def set_factorOverride(value: Element): Self = this.set("_factorOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_factorOverride: Self = this.set("_factorOverride", js.undefined)
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    @scala.inline
    def set_overrideReason(value: Element): Self = this.set("_overrideReason", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_overrideReason: Self = this.set("_overrideReason", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAccountVarargs(value: Reference*): Self = this.set("account", js.Array(value :_*))
    @scala.inline
    def setAccount(value: js.Array[Reference]): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setBodysiteVarargs(value: CodeableConcept*): Self = this.set("bodysite", js.Array(value :_*))
    @scala.inline
    def setBodysite(value: js.Array[CodeableConcept]): Self = this.set("bodysite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodysite: Self = this.set("bodysite", js.undefined)
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDefinitionVarargs(value: uri*): Self = this.set("definition", js.Array(value :_*))
    @scala.inline
    def setDefinition(value: js.Array[uri]): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setEnteredDate(value: dateTime): Self = this.set("enteredDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnteredDate: Self = this.set("enteredDate", js.undefined)
    @scala.inline
    def setEnterer(value: Reference): Self = this.set("enterer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterer: Self = this.set("enterer", js.undefined)
    @scala.inline
    def setFactorOverride(value: decimal): Self = this.set("factorOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactorOverride: Self = this.set("factorOverride", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
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
    def setOverrideReason(value: String): Self = this.set("overrideReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideReason: Self = this.set("overrideReason", js.undefined)
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    @scala.inline
    def setParticipantVarargs(value: ChargeItemParticipant*): Self = this.set("participant", js.Array(value :_*))
    @scala.inline
    def setParticipant(value: js.Array[ChargeItemParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    @scala.inline
    def setPerformingOrganization(value: Reference): Self = this.set("performingOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformingOrganization: Self = this.set("performingOrganization", js.undefined)
    @scala.inline
    def setPriceOverride(value: Money): Self = this.set("priceOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceOverride: Self = this.set("priceOverride", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRequestingOrganization(value: Reference): Self = this.set("requestingOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestingOrganization: Self = this.set("requestingOrganization", js.undefined)
    @scala.inline
    def setServiceVarargs(value: Reference*): Self = this.set("service", js.Array(value :_*))
    @scala.inline
    def setService(value: js.Array[Reference]): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = this.set("supportingInformation", js.Array(value :_*))
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = this.set("supportingInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportingInformation: Self = this.set("supportingInformation", js.undefined)
  }
  
}

