package typings
package fhirLib.fhirNs

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

