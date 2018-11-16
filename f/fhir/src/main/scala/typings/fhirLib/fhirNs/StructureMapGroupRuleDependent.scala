package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Which other rules to apply in the context of this rule
     */

trait StructureMapGroupRuleDependent extends BackboneElement {
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'variable'.
           */
  var _variable: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Name of a rule or group to apply
           */
  var name: id
  /**
           * Variable to pass to the rule or group
           */
  var variable: js.Array[java.lang.String]
}

