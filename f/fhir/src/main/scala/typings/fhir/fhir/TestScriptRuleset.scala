package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assert ruleset used within the test script
  */
trait TestScriptRuleset extends BackboneElement {
  /**
    * Assert ruleset resource reference
    */
  var resource: Reference
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.Array[TestScriptRulesetRule]
}

object TestScriptRuleset {
  @scala.inline
  def apply(
    resource: Reference,
    rule: js.Array[TestScriptRulesetRule],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): TestScriptRuleset = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleset]
  }
}

