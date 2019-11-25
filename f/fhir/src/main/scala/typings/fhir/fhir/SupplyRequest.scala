package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for a medication, substance or device
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait SupplyRequest extends DomainResource {
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
  @scala.inline
  def apply(
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    deliverFrom: Reference = null,
    deliverTo: Reference = null,
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
    orderedItem: SupplyRequestOrderedItem = null,
    priority: code = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    requester: SupplyRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    supplier: js.Array[Reference] = null,
    text: Narrative = null
  ): SupplyRequest = {
    val __obj = js.Dynamic.literal()
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (deliverFrom != null) __obj.updateDynamic("deliverFrom")(deliverFrom.asInstanceOf[js.Any])
    if (deliverTo != null) __obj.updateDynamic("deliverTo")(deliverTo.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (orderedItem != null) __obj.updateDynamic("orderedItem")(orderedItem.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supplier != null) __obj.updateDynamic("supplier")(supplier.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplyRequest]
  }
}

