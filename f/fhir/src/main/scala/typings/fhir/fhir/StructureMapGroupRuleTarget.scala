package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content to create because of this mapping rule
  */
trait StructureMapGroupRuleTarget extends BackboneElement {
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'listRuleId'.
    */
  var _listRuleId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'transform'.
    */
  var _transform: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.undefined
  /**
    * Type or variable this rule applies to
    */
  var context: js.UndefOr[id] = js.undefined
  /**
    * type | variable
    */
  var contextType: js.UndefOr[code] = js.undefined
  /**
    * Field to create in the context
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * first | share | last | collate
    */
  var listMode: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * Internal rule reference for shared list items
    */
  var listRuleId: js.UndefOr[id] = js.undefined
  /**
    * Parameters to the transform
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.undefined
  /**
    * create | copy +
    */
  var transform: js.UndefOr[code] = js.undefined
  /**
    * Named context for field, if desired, and a field is specified
    */
  var variable: js.UndefOr[id] = js.undefined
}

object StructureMapGroupRuleTarget {
  @scala.inline
  def apply(
    _context: Element = null,
    _contextType: Element = null,
    _element: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _listMode: js.Array[Element] = null,
    _listRuleId: Element = null,
    _transform: Element = null,
    _variable: Element = null,
    context: id = null,
    contextType: code = null,
    element: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    listMode: js.Array[code] = null,
    listRuleId: id = null,
    modifierExtension: js.Array[Extension] = null,
    parameter: js.Array[StructureMapGroupRuleTargetParameter] = null,
    transform: code = null,
    variable: id = null
  ): StructureMapGroupRuleTarget = {
    val __obj = js.Dynamic.literal()
    if (_context != null) __obj.updateDynamic("_context")(_context.asInstanceOf[js.Any])
    if (_contextType != null) __obj.updateDynamic("_contextType")(_contextType.asInstanceOf[js.Any])
    if (_element != null) __obj.updateDynamic("_element")(_element.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_listMode != null) __obj.updateDynamic("_listMode")(_listMode.asInstanceOf[js.Any])
    if (_listRuleId != null) __obj.updateDynamic("_listRuleId")(_listRuleId.asInstanceOf[js.Any])
    if (_transform != null) __obj.updateDynamic("_transform")(_transform.asInstanceOf[js.Any])
    if (_variable != null) __obj.updateDynamic("_variable")(_variable.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (listRuleId != null) __obj.updateDynamic("listRuleId")(listRuleId.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
}

