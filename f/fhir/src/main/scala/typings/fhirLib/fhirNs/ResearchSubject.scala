package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ResearchSubject extends DomainResource {
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
  var actualArm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What path should be followed
    */
  var assignedArm: js.UndefOr[java.lang.String] = js.undefined
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
    actualArm: java.lang.String = null,
    assignedArm: java.lang.String = null,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("individual")(individual)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("study")(study)
    if (_actualArm != null) __obj.updateDynamic("_actualArm")(_actualArm)
    if (_assignedArm != null) __obj.updateDynamic("_assignedArm")(_assignedArm)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (actualArm != null) __obj.updateDynamic("actualArm")(actualArm)
    if (assignedArm != null) __obj.updateDynamic("assignedArm")(assignedArm)
    if (consent != null) __obj.updateDynamic("consent")(consent)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ResearchSubject]
  }
}

