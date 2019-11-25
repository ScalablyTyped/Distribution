package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ResearchStudy extends DomainResource {
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
  var title: js.UndefOr[String] = js.undefined
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
    title: String = null
  ): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (arm != null) __obj.updateDynamic("arm")(arm.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enrollment != null) __obj.updateDynamic("enrollment")(enrollment.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (principalInvestigator != null) __obj.updateDynamic("principalInvestigator")(principalInvestigator.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (reasonStopped != null) __obj.updateDynamic("reasonStopped")(reasonStopped.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (sponsor != null) __obj.updateDynamic("sponsor")(sponsor.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
}

