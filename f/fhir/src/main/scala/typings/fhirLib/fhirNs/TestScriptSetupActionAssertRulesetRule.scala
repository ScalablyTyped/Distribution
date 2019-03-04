package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The referenced rule within the ruleset
  */
trait TestScriptSetupActionAssertRulesetRule extends BackboneElement {
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.undefined
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRuleParam]] = js.undefined
  /**
    * Id of referenced rule within the ruleset
    */
  var ruleId: id
}

object TestScriptSetupActionAssertRulesetRule {
  @scala.inline
  def apply(
    ruleId: id,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _ruleId: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    param: js.Array[TestScriptSetupActionAssertRulesetRuleParam] = null
  ): TestScriptSetupActionAssertRulesetRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_ruleId != null) __obj.updateDynamic("_ruleId")(_ruleId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[TestScriptSetupActionAssertRulesetRule]
  }
}

