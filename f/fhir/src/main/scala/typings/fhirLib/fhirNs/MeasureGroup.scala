package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria group
  */
trait MeasureGroup extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Summary description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: Identifier
  /**
    * Short name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Population criteria
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  /**
    * Stratifier criteria for the measure
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.undefined
}

