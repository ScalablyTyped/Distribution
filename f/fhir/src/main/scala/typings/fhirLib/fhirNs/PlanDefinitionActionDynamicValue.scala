package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic aspects of the definition
  */
trait PlanDefinitionActionDynamicValue extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Natural language description of the dynamic value
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An expression that provides the dynamic value for the customization
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Language of the expression
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the element to be set dynamically
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object PlanDefinitionActionDynamicValue {
  @scala.inline
  def apply(
    _description: Element = null,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _language: Element = null,
    _path: Element = null,
    description: java.lang.String = null,
    expression: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    language: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    path: java.lang.String = null
  ): PlanDefinitionActionDynamicValue = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PlanDefinitionActionDynamicValue]
  }
}

