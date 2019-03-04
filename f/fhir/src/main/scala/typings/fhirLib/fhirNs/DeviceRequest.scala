package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medical device request
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait DeviceRequest extends DomainResource {
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
    * When recorded
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Device requested
    */
  var codeCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Device requested
    */
  var codeReference: js.UndefOr[Reference] = js.undefined
  /**
    * Encounter or Episode motivating request
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Identifier of composite request
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * External Request identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * proposal | plan | original-order | encoded | reflex-order
    */
  var intent: CodeableConcept
  /**
    * Notes or comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Desired time or schedule for use
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Desired time or schedule for use
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Desired time or schedule for use
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Requested Filler
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Fille role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What request replaces
    */
  var priorRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Indicates how quickly the {{title}} should be addressed with respect to other requests
    */
  var priority: js.UndefOr[code] = js.undefined
  /**
    * Coded Reason for request
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Linked Reason for request
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who/what is requesting diagnostics
    */
  var requester: js.UndefOr[DeviceRequestRequester] = js.undefined
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Focus of request
    */
  var subject: Reference
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}

object DeviceRequest {
  @scala.inline
  def apply(
    intent: CodeableConcept,
    subject: Reference,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    codeCodeableConcept: CodeableConcept = null,
    codeReference: Reference = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    performer: Reference = null,
    performerType: CodeableConcept = null,
    priorRequest: js.Array[Reference] = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    requester: DeviceRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null
  ): DeviceRequest = {
    val __obj = js.Dynamic.literal(intent = intent, subject = subject)
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime)
    if (_priority != null) __obj.updateDynamic("_priority")(_priority)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (codeCodeableConcept != null) __obj.updateDynamic("codeCodeableConcept")(codeCodeableConcept)
    if (codeReference != null) __obj.updateDynamic("codeReference")(codeReference)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier)
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
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (performerType != null) __obj.updateDynamic("performerType")(performerType)
    if (priorRequest != null) __obj.updateDynamic("priorRequest")(priorRequest)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory)
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DeviceRequest]
  }
}

