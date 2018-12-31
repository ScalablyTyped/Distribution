package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the calibrations that have been performed or that are required to be performed
  */
trait DeviceMetricCalibration extends BackboneElement {
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * not-calibrated | calibration-required | calibrated | unspecified
    */
  var state: js.UndefOr[code] = js.undefined
  /**
    * Describes the time last calibration has been performed
    */
  var time: js.UndefOr[instant] = js.undefined
  /**
    * unspecified | offset | gain | two-point
    */
  var `type`: js.UndefOr[code] = js.undefined
}

