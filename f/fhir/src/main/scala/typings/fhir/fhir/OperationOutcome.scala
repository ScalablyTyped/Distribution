package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the success/failure of an action
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait OperationOutcome extends DomainResource {
  /**
    * A single issue associated with the action
    */
  var issue: js.Array[OperationOutcomeIssue]
}

object OperationOutcome {
  @scala.inline
  def apply(
    issue: js.Array[OperationOutcomeIssue],
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OperationOutcome]
  }
}

