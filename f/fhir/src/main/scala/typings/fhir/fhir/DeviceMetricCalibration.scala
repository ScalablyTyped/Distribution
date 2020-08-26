package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the calibrations that have been performed or that are required to be performed
  */
@js.native
trait DeviceMetricCalibration extends BackboneElement {
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * not-calibrated | calibration-required | calibrated | unspecified
    */
  var state: js.UndefOr[code] = js.native
  /**
    * Describes the time last calibration has been performed
    */
  var time: js.UndefOr[instant] = js.native
  /**
    * unspecified | offset | gain | two-point
    */
  var `type`: js.UndefOr[code] = js.native
}

object DeviceMetricCalibration {
  @scala.inline
  def apply(): DeviceMetricCalibration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetricCalibration]
  }
  @scala.inline
  implicit class DeviceMetricCalibrationOps[Self <: DeviceMetricCalibration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_state(value: Element): Self = this.set("_state", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_state: Self = this.set("_state", js.undefined)
    @scala.inline
    def set_time(value: Element): Self = this.set("_time", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_time: Self = this.set("_time", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setState(value: code): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTime(value: instant): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

