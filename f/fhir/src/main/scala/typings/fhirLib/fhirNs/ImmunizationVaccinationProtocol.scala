package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * What protocol was followed
     */

trait ImmunizationVaccinationProtocol extends BackboneElement {
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
           * Contains extended information for property 'seriesDoses'.
           */
  var _seriesDoses: js.UndefOr[Element] = js.undefined
  /**
           * Who is responsible for protocol
           */
  var authority: js.UndefOr[Reference] = js.undefined
  /**
           * Details of vaccine protocol
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Dose number within series
           */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  /**
           * Indicates if dose counts towards immunity
           */
  var doseStatus: CodeableConcept
  /**
           * Why dose does (not) count
           */
  var doseStatusReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Name of vaccine series
           */
  var series: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Recommended number of doses for immunity
           */
  var seriesDoses: js.UndefOr[positiveInt] = js.undefined
  /**
           * Disease immunized against
           */
  var targetDisease: js.Array[CodeableConcept]
}

