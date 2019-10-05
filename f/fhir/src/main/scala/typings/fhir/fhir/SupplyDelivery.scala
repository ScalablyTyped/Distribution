package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Delivery of bulk Supplies
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait SupplyDelivery extends DomainResource {
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Where the Supply was sent
    */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * When event occurred
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When event occurred
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * When event occurred
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Patient for whom the item is supplied
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Who collected the Supply
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * in-progress | completed | abandoned | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * The item that is delivered or supplied
    */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.undefined
  /**
    * Dispenser
    */
  var supplier: js.UndefOr[Reference] = js.undefined
  /**
    * Category of dispense event
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object SupplyDelivery {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    destination: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    partOf: js.Array[Reference] = null,
    patient: Reference = null,
    receiver: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    suppliedItem: SupplyDeliverySuppliedItem = null,
    supplier: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): SupplyDelivery = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime)
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod)
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (receiver != null) __obj.updateDynamic("receiver")(receiver)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (suppliedItem != null) __obj.updateDynamic("suppliedItem")(suppliedItem)
    if (supplier != null) __obj.updateDynamic("supplier")(supplier)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SupplyDelivery]
  }
}

