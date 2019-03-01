package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ruleset rule parameter template
  */
trait TestScriptRulesetRuleParam extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Parameter name matching external assert ruleset rule parameter
    */
  var name: java.lang.String
  /**
    * Parameter value defined either explicitly or dynamically
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TestScriptRulesetRuleParam {
  @scala.inline
  def apply(
    name: java.lang.String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    value: java.lang.String = null
  ): TestScriptRulesetRuleParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TestScriptRulesetRuleParam]
  }
}

