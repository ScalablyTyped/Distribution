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
    if (_context != null) __obj.updateDynamic("_context")(_context)
    if (_contextType != null) __obj.updateDynamic("_contextType")(_contextType)
    if (_element != null) __obj.updateDynamic("_element")(_element)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_listMode != null) __obj.updateDynamic("_listMode")(_listMode)
    if (_listRuleId != null) __obj.updateDynamic("_listRuleId")(_listRuleId)
    if (_transform != null) __obj.updateDynamic("_transform")(_transform)
    if (_variable != null) __obj.updateDynamic("_variable")(_variable)
    if (context != null) __obj.updateDynamic("context")(context)
    if (contextType != null) __obj.updateDynamic("contextType")(contextType)
    if (element != null) __obj.updateDynamic("element")(element)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (listRuleId != null) __obj.updateDynamic("listRuleId")(listRuleId)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
}

