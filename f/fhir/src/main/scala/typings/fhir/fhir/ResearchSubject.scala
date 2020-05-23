package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ResearchSubject extends DomainResource {
  /**
    * Contains extended information for property 'actualArm'.
    */
  var _actualArm: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'assignedArm'.
    */
  var _assignedArm: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * What path was followed
    */
  var actualArm: js.UndefOr[String] = js.undefined
  /**
    * What path should be followed
    */
  var assignedArm: js.UndefOr[String] = js.undefined
  /**
    * Agreement to participate in study
    */
  var consent: js.UndefOr[Reference] = js.undefined
  /**
    * Business Identifier for research subject
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Who is part of study
    */
  var individual: Reference
  /**
    * Start and end of participation
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * candidate | enrolled | active | suspended | withdrawn | completed
    */
  var status: code
  /**
    * Study subject is part of
    */
  var study: Reference
}

object ResearchSubject {
  @scala.inline
  def apply(
    individual: Reference,
    status: code,
    study: Reference,
    _actualArm: Element = null,
    _assignedArm: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    actualArm: String = null,
    assignedArm: String = null,
    consent: Reference = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    if (_actualArm != null) __obj.updateDynamic("_actualArm")(_actualArm.asInstanceOf[js.Any])
    if (_assignedArm != null) __obj.updateDynamic("_assignedArm")(_assignedArm.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (actualArm != null) __obj.updateDynamic("actualArm")(actualArm.asInstanceOf[js.Any])
    if (assignedArm != null) __obj.updateDynamic("assignedArm")(assignedArm.asInstanceOf[js.Any])
    if (consent != null) __obj.updateDynamic("consent")(consent.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
}

