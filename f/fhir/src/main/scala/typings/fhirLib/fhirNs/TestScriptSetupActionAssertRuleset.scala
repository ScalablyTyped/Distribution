package typings
package fhirLib.fhirNs

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

