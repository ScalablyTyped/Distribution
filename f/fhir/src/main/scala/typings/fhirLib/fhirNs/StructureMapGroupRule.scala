package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Transform Rule from source to target
     */

trait StructureMapGroupRule extends BackboneElement {
  /**
           * Contains extended information for property 'documentation'.
           */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Which other rules to apply in the context of this rule
           */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.undefined
  /**
           * Documentation for this instance of data
           */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the rule for internal references
           */
  var name: id
  /**
           * Rules contained in this rule
           */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.undefined
  /**
           * Source inputs to the mapping
           */
  var source: js.Array[StructureMapGroupRuleSource]
  /**
           * Content to create because of this mapping rule
           */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.undefined
}

