package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Rule parameter template
     */

trait TestScriptSetupActionAssertRulesetRuleParam extends BackboneElement {
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
  var value: java.lang.String
}

