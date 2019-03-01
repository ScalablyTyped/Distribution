package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for referral or transfer of care
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ReferralRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
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
    * Date of creation/activation
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
    * Request fulfilled by this request
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Originating encounter
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * A textual description of the referral
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * proposal | plan | order
    */
  var intent: code
  /**
    * Comments made about referral request
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When the service(s) requested in the referral should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When the service(s) requested in the referral should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Urgency of referral / transfer of care request
    */
  var priority: js.UndefOr[code] = js.undefined
  /**
    * Reason for referral / transfer of care request
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why is service needed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Receiver of referral / transfer of care request
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Key events in history of request
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[ReferralRequestRequester] = js.undefined
  /**
    * Actions requested as part of the referral
    */
  var serviceRequested: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * The clinical specialty (discipline) that the referral is requested for
    */
  var specialty: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code
  /**
    * Patient referred to care or transfer
    */
  var subject: Reference
  /**
    * Additonal information to support referral or transfer of care request
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Referral/Transition of care request type
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ReferralRequest {
  @scala.inline
  def apply(
    intent: code,
    status: code,
    subject: Reference,
    _authoredOn: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    description: java.lang.String = null,
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
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    recipient: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    replaces: js.Array[Reference] = null,
    requester: ReferralRequestRequester = null,
    resourceType: code = null,
    serviceRequested: js.Array[CodeableConcept] = null,
    specialty: CodeableConcept = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): ReferralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("intent")(intent)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("subject")(subject)
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_intent != null) __obj.updateDynamic("_intent")(_intent)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime)
    if (_priority != null) __obj.updateDynamic("_priority")(_priority)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (description != null) __obj.updateDynamic("description")(description)
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
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (serviceRequested != null) __obj.updateDynamic("serviceRequested")(serviceRequested)
    if (specialty != null) __obj.updateDynamic("specialty")(specialty)
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReferralRequest]
  }
}

