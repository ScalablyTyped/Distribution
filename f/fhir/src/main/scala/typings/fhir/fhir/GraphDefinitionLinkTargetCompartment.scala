package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compartment Consistency Rules
  */
trait GraphDefinitionLinkTargetCompartment extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rule'.
    */
  var _rule: js.UndefOr[Element] = js.undefined
  /**
    * Identifies the compartment
    */
  var code: typings.fhir.fhir.code
  /**
    * Documentation for FHIRPath expression
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Custom rule, as a FHIRPath expression
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * identical | matching | different | custom
    */
  var rule: code
}

object GraphDefinitionLinkTargetCompartment {
  @scala.inline
  def apply(
    code: code,
    rule: code,
    _code: Element = null,
    _description: Element = null,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _rule: Element = null,
    description: String = null,
    expression: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): GraphDefinitionLinkTargetCompartment = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_expression != null) __obj.updateDynamic("_expression")(_expression.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_rule != null) __obj.updateDynamic("_rule")(_rule.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTargetCompartment]
  }
}

