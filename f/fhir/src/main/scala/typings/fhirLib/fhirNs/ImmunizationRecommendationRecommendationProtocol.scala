package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Protocol used by recommendation
  */
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.undefined
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol details
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[java.lang.String] = js.undefined
}

