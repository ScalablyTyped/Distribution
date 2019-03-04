package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ChargeItem extends DomainResource {
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
  var overrideReason: js.UndefOr[java.lang.String] = js.undefined
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
    factorOverride: js.UndefOr[decimal] = js.undefined,
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
    overrideReason: java.lang.String = null,
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
    val __obj = js.Dynamic.literal(code = code, status = status, subject = subject)
    if (_definition != null) __obj.updateDynamic("_definition")(_definition)
    if (_enteredDate != null) __obj.updateDynamic("_enteredDate")(_enteredDate)
    if (_factorOverride != null) __obj.updateDynamic("_factorOverride")(_factorOverride)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime)
    if (_overrideReason != null) __obj.updateDynamic("_overrideReason")(_overrideReason)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (account != null) __obj.updateDynamic("account")(account)
    if (bodysite != null) __obj.updateDynamic("bodysite")(bodysite)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (enteredDate != null) __obj.updateDynamic("enteredDate")(enteredDate)
    if (enterer != null) __obj.updateDynamic("enterer")(enterer)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(factorOverride)) __obj.updateDynamic("factorOverride")(factorOverride)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime)
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod)
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming)
    if (overrideReason != null) __obj.updateDynamic("overrideReason")(overrideReason)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (participant != null) __obj.updateDynamic("participant")(participant)
    if (performingOrganization != null) __obj.updateDynamic("performingOrganization")(performingOrganization)
    if (priceOverride != null) __obj.updateDynamic("priceOverride")(priceOverride)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (requestingOrganization != null) __obj.updateDynamic("requestingOrganization")(requestingOrganization)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (service != null) __obj.updateDynamic("service")(service)
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChargeItem]
  }
}

