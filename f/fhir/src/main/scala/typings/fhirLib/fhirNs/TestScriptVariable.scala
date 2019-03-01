package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placeholder for evaluated elements
  */
trait TestScriptVariable extends BackboneElement {
  /**
    * Contains extended information for property 'defaultValue'.
    */
  var _defaultValue: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'hint'.
    */
  var _hint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.undefined
  /**
    * Default, hard-coded, or user-defined value for this variable
    */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Natural language description of the variable
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fluentpath expression against the fixture body
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTTP header field name for source
    */
  var headerField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hint help text for default value to enter
    */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Descriptive name for this variable
    */
  var name: java.lang.String
  /**
    * XPath or JSONPath against the fixture body
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fixture Id of source expression or headerField within this variable
    */
  var sourceId: js.UndefOr[id] = js.undefined
}

object TestScriptVariable {
  @scala.inline
  def apply(
    name: java.lang.String,
    _defaultValue: Element = null,
    _description: Element = null,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _headerField: Element = null,
    _hint: Element = null,
    _id: Element = null,
    _name: Element = null,
    _path: Element = null,
    _sourceId: Element = null,
    defaultValue: java.lang.String = null,
    description: java.lang.String = null,
    expression: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    headerField: java.lang.String = null,
    hint: java.lang.String = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    path: java.lang.String = null,
    sourceId: id = null
  ): TestScriptVariable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (_defaultValue != null) __obj.updateDynamic("_defaultValue")(_defaultValue)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_headerField != null) __obj.updateDynamic("_headerField")(_headerField)
    if (_hint != null) __obj.updateDynamic("_hint")(_hint)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (_sourceId != null) __obj.updateDynamic("_sourceId")(_sourceId)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (headerField != null) __obj.updateDynamic("headerField")(headerField)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId)
    __obj.asInstanceOf[TestScriptVariable]
  }
}

