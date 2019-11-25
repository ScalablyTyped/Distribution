package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ChargeItem extends DomainResource {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'enteredDate'.
    */
  var _enteredDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'factorOverride'.
    */
  var _factorOverride: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'overrideReason'.
    */
  var _overrideReason: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Account to place this charge
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Anatomical location, if relevant
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A code that identifies the charge, like a billing code
    */
  var code: CodeableConcept
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Defining information about the code of this charge item
    */
  var definition: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Date the charge item was entered
    */
  var enteredDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Individual who was entering
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
    * Factor overriding the associated rules
    */
  var factorOverride: js.UndefOr[decimal] = js.undefined
  /**
    * Business Identifier for item
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Comments made about the ChargeItem
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Reason for overriding the list price/factor
    */
  var overrideReason: js.UndefOr[String] = js.undefined
  /**
    * Part of referenced ChargeItem
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who performed charged service
    */
  var participant: js.UndefOr[js.Array[ChargeItemParticipant]] = js.undefined
  /**
    * Organization providing the charged sevice
    */
  var performingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Price overriding the associated rules
    */
  var priceOverride: js.UndefOr[Money] = js.undefined
  /**
    * Quantity of which the charge item has been serviced
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Why was the charged  service rendered?
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Organization requesting the charged service
    */
  var requestingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Which rendered service is being charged?
    */
  var service: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
    */
  var status: code
  /**
    * Individual service was done for/to
    */
  var subject: Reference
  /**
    * Further information supporting the this charge
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}

object ChargeItem {
  @scala.inline
  def apply(
    code: CodeableConcept,
    status: code,
    subject: Reference,
    _definition: js.Array[Element] = null,
    _enteredDate: Element = null,
    _factorOverride: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _overrideReason: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    bodysite: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[uri] = null,
    enteredDate: dateTime = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    factorOverride: Int | Double = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    overrideReason: String = null,
    partOf: js.Array[Reference] = null,
    participant: js.Array[ChargeItemParticipant] = null,
    performingOrganization: Reference = null,
    priceOverride: Money = null,
    quantity: Quantity = null,
    reason: js.Array[CodeableConcept] = null,
    requestingOrganization: Reference = null,
    resourceType: code = null,
    service: js.Array[Reference] = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_enteredDate != null) __obj.updateDynamic("_enteredDate")(_enteredDate.asInstanceOf[js.Any])
    if (_factorOverride != null) __obj.updateDynamic("_factorOverride")(_factorOverride.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_overrideReason != null) __obj.updateDynamic("_overrideReason")(_overrideReason.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (bodysite != null) __obj.updateDynamic("bodysite")(bodysite.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (enteredDate != null) __obj.updateDynamic("enteredDate")(enteredDate.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (factorOverride != null) __obj.updateDynamic("factorOverride")(factorOverride.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (overrideReason != null) __obj.updateDynamic("overrideReason")(overrideReason.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (performingOrganization != null) __obj.updateDynamic("performingOrganization")(performingOrganization.asInstanceOf[js.Any])
    if (priceOverride != null) __obj.updateDynamic("priceOverride")(priceOverride.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (requestingOrganization != null) __obj.updateDynamic("requestingOrganization")(requestingOrganization.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItem]
  }
}

