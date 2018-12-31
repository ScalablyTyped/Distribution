package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dates governing proposed immunization
  */
trait ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Type of date
    */
  var code: CodeableConcept
  /**
    * Recommended date
    */
  var value: dateTime
}

