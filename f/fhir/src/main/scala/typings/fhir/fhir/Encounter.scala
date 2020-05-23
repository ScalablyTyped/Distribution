package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction during which services are provided to the patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Encounter extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The set of accounts that may be used for billing for this Encounter
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The appointment that scheduled this encounter
    */
  var appointment: js.UndefOr[Reference] = js.undefined
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: js.UndefOr[Coding] = js.undefined
  /**
    * List of past encounter classes
    */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.undefined
  /**
    * The list of diagnosis relevant to this encounter
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.undefined
  /**
    * Episode(s) of care that this encounter should be recorded against
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Details about the admission to a healthcare service
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.undefined
  /**
    * Identifier(s) by which this encounter is known
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The ReferralRequest that initiated this encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Quantity of time the encounter lasted (less time absent)
    */
  var length: js.UndefOr[Duration] = js.undefined
  /**
    * List of locations where the patient has been
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.undefined
  /**
    * Another Encounter this encounter is part of
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
    * List of participants involved in the encounter
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.undefined
  /**
    * The start and end time of the encounter
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Indicates the urgency of the encounter
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason the encounter takes place (code)
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * The custodian organization of this Encounter record
    */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code
  /**
    * List of past encounter statuses
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.undefined
  /**
    * The patient ro group present at the encounter
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Specific type of encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object Encounter {
  @scala.inline
  def apply(
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    appointment: Reference = null,
    `class`: Coding = null,
    classHistory: js.Array[EncounterClassHistory] = null,
    contained: js.Array[Resource] = null,
    diagnosis: js.Array[EncounterDiagnosis] = null,
    episodeOfCare: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    hospitalization: EncounterHospitalization = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    incomingReferral: js.Array[Reference] = null,
    language: code = null,
    length: Duration = null,
    location: js.Array[EncounterLocation] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    partOf: Reference = null,
    participant: js.Array[EncounterParticipant] = null,
    period: Period = null,
    priority: CodeableConcept = null,
    reason: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    serviceProvider: Reference = null,
    statusHistory: js.Array[EncounterStatusHistory] = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Encounter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (classHistory != null) __obj.updateDynamic("classHistory")(classHistory.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (episodeOfCare != null) __obj.updateDynamic("episodeOfCare")(episodeOfCare.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (incomingReferral != null) __obj.updateDynamic("incomingReferral")(incomingReferral.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceProvider != null) __obj.updateDynamic("serviceProvider")(serviceProvider.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
}

