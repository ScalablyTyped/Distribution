package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Population criteria
     */

trait MeasureGroupPopulation extends BackboneElement {
  /**
           * Contains extended information for property 'criteria'.
           */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
           */
  var criteria: java.lang.String
  /**
           * The human readable description of this population criteria
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Unique identifier
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Short name
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

