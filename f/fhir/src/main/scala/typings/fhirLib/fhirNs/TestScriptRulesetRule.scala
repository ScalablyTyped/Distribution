package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The referenced rule within the ruleset
  */
trait TestScriptRulesetRule extends BackboneElement {
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.undefined
  /**
    * Ruleset rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRulesetRuleParam]] = js.undefined
  /**
    * Id of referenced rule within the ruleset
    */
  var ruleId: id
}

