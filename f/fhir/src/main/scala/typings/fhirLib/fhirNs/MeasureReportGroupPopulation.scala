package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The populations in the group
  */
trait MeasureReportGroupPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Size of the population
    */
  var count: js.UndefOr[integer] = js.undefined
  /**
    * Population identifier as defined in the measure
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * For patient-list reports, the patients in this population
    */
  var patients: js.UndefOr[Reference] = js.undefined
}

