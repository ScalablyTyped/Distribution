package typings.fhir.fhir

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

object DeviceMetricCalibration {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _state: Element = null,
    _time: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    state: code = null,
    time: instant = null,
    `type`: code = null
  ): DeviceMetricCalibration = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_state != null) __obj.updateDynamic("_state")(_state.asInstanceOf[js.Any])
    if (_time != null) __obj.updateDynamic("_time")(_time.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetricCalibration]
  }
}

