package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ResearchStudy extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.undefined
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.undefined
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.undefined
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code
  /**
    * Name for this study
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ResearchStudy {
  @scala.inline
  def apply(
    status: code,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    arm: js.Array[ResearchStudyArm] = null,
    category: js.Array[CodeableConcept] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    description: markdown = null,
    enrollment: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    focus: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    keyword: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    period: Period = null,
    principalInvestigator: Reference = null,
    protocol: js.Array[Reference] = null,
    reasonStopped: CodeableConcept = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    site: js.Array[Reference] = null,
    sponsor: Reference = null,
    text: Narrative = null,
    title: java.lang.String = null
  ): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (arm != null) __obj.updateDynamic("arm")(arm)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enrollment != null) __obj.updateDynamic("enrollment")(enrollment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (period != null) __obj.updateDynamic("period")(period)
    if (principalInvestigator != null) __obj.updateDynamic("principalInvestigator")(principalInvestigator)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (reasonStopped != null) __obj.updateDynamic("reasonStopped")(reasonStopped)
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (site != null) __obj.updateDynamic("site")(site)
    if (sponsor != null) __obj.updateDynamic("sponsor")(sponsor)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ResearchStudy]
  }
}

