package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reference to a TestScript.ruleset
  */
trait TestScriptSetupActionAssertRuleset extends BackboneElement {
  /**
    * Contains extended information for property 'rulesetId'.
    */
  var _rulesetId: js.UndefOr[Element] = js.undefined
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.undefined
  /**
    * Id of the TestScript.ruleset
    */
  var rulesetId: id
}

object TestScriptSetupActionAssertRuleset {
  @scala.inline
  def apply(
    rulesetId: id,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _rulesetId: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    rule: js.Array[TestScriptSetupActionAssertRulesetRule] = null
  ): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_rulesetId != null) __obj.updateDynamic("_rulesetId")(_rulesetId.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
}

