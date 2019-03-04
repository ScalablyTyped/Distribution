package typings
package fhirLib.fhirNs

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
  var expression: java.lang.String
  /**
    * Human description of constraint
    */
  var human: java.lang.String
  /**
    * Target of 'condition' reference above
    */
  var key: id
  /**
    * Why this constraint is necessary or appropriate
    */
  var requirements: js.UndefOr[java.lang.String] = js.undefined
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
  var xpath: js.UndefOr[java.lang.String] = js.undefined
}

object ElementDefinitionConstraint {
  @scala.inline
  def apply(
    expression: java.lang.String,
    human: java.lang.String,
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    requirements: java.lang.String = null,
    source: uri = null,
    xpath: java.lang.String = null
  ): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression, human = human, key = key, severity = severity)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_human != null) __obj.updateDynamic("_human")(_human)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_key != null) __obj.updateDynamic("_key")(_key)
    if (_requirements != null) __obj.updateDynamic("_requirements")(_requirements)
    if (_severity != null) __obj.updateDynamic("_severity")(_severity)
    if (_source != null) __obj.updateDynamic("_source")(_source)
    if (_xpath != null) __obj.updateDynamic("_xpath")(_xpath)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (source != null) __obj.updateDynamic("source")(source)
    if (xpath != null) __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
}

