package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medical care, research study or other healthcare event causing physical injury
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait AdverseEvent extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * AE | PAE An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
    */
  var category: js.UndefOr[code] = js.undefined
  /**
    * When the event occurred
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Description of the adverse event
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Who  was involved in the adverse event or the potential adverse event
    */
  var eventParticipant: js.UndefOr[Reference] = js.undefined
  /**
    * Business identifier for the event
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Location where adverse event occurred
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who recorded the adverse event
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  /**
    * AdverseEvent.referenceDocument
    */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Mild | Moderate | Severe
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * AdverseEvent.study
    */
  var study: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Subject or group impacted by event
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * AdverseEvent.subjectMedicalHistory
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The suspected agent causing the adverse event
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.undefined
  /**
    * actual | potential
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object AdverseEvent {
  @scala.inline
  def apply(
    _category: Element = null,
    _date: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    category: code = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: String = null,
    eventParticipant: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    reaction: js.Array[Reference] = null,
    recorder: Reference = null,
    referenceDocument: js.Array[Reference] = null,
    resourceType: code = null,
    seriousness: CodeableConcept = null,
    study: js.Array[Reference] = null,
    subject: Reference = null,
    subjectMedicalHistory: js.Array[Reference] = null,
    suspectEntity: js.Array[AdverseEventSuspectEntity] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): AdverseEvent = {
    val __obj = js.Dynamic.literal()
    if (_category != null) __obj.updateDynamic("_category")(_category)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (eventParticipant != null) __obj.updateDynamic("eventParticipant")(eventParticipant)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (location != null) __obj.updateDynamic("location")(location)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (reaction != null) __obj.updateDynamic("reaction")(reaction)
    if (recorder != null) __obj.updateDynamic("recorder")(recorder)
    if (referenceDocument != null) __obj.updateDynamic("referenceDocument")(referenceDocument)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (seriousness != null) __obj.updateDynamic("seriousness")(seriousness)
    if (study != null) __obj.updateDynamic("study")(study)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (subjectMedicalHistory != null) __obj.updateDynamic("subjectMedicalHistory")(subjectMedicalHistory)
    if (suspectEntity != null) __obj.updateDynamic("suspectEntity")(suspectEntity)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdverseEvent]
  }
}

