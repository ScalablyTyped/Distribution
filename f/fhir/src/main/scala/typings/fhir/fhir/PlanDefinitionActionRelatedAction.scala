package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationship to another action
  */
trait PlanDefinitionActionRelatedAction extends BackboneElement {
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.undefined
  /**
    * What action is this related to
    */
  var actionId: id
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code
}

object PlanDefinitionActionRelatedAction {
  @scala.inline
  def apply(
    actionId: id,
    relationship: code,
    _actionId: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _relationship: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    offsetDuration: Duration = null,
    offsetRange: Range = null
  ): PlanDefinitionActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    if (_actionId != null) __obj.updateDynamic("_actionId")(_actionId.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_relationship != null) __obj.updateDynamic("_relationship")(_relationship.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (offsetDuration != null) __obj.updateDynamic("offsetDuration")(offsetDuration.asInstanceOf[js.Any])
    if (offsetRange != null) __obj.updateDynamic("offsetRange")(offsetRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActionRelatedAction]
  }
}

