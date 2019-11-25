package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that must evaluate to true
  */
trait ElementDefinitionConstraint extends Element {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'human'.
    */
  var _human: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'key'.
    */
  var _key: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'requirements'.
    */
  var _requirements: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.undefined
  /**
    * FHIRPath expression of constraint
    */
  var expression: String
  /**
    * Human description of constraint
    */
  var human: String
  /**
    * Target of 'condition' reference above
    */
  var key: id
  /**
    * Why this constraint is necessary or appropriate
    */
  var requirements: js.UndefOr[String] = js.undefined
  /**
    * error | warning
    */
  var severity: code
  /**
    * Reference to original source of constraint
    */
  var source: js.UndefOr[uri] = js.undefined
  /**
    * XPath expression of constraint
    */
  var xpath: js.UndefOr[String] = js.undefined
}

object ElementDefinitionConstraint {
  @scala.inline
  def apply(
    expression: String,
    human: String,
    key: id,
    severity: code,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _human: Element = null,
    _id: Element = null,
    _key: Element = null,
    _requirements: Element = null,
    _severity: Element = null,
    _source: Element = null,
    _xpath: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    requirements: String = null,
    source: uri = null,
    xpath: String = null
  ): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (_expression != null) __obj.updateDynamic("_expression")(_expression.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_human != null) __obj.updateDynamic("_human")(_human.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_key != null) __obj.updateDynamic("_key")(_key.asInstanceOf[js.Any])
    if (_requirements != null) __obj.updateDynamic("_requirements")(_requirements.asInstanceOf[js.Any])
    if (_severity != null) __obj.updateDynamic("_severity")(_severity.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_xpath != null) __obj.updateDynamic("_xpath")(_xpath.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (xpath != null) __obj.updateDynamic("xpath")(xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
}

