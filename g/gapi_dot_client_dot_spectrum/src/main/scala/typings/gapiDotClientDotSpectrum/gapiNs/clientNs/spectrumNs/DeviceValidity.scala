package typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceValidity extends js.Object {
  /** The descriptor of the device for which the validity check was requested. It will always be present. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /** The validity status: true if the device is valid for operation, false otherwise. It will always be present. */
  var isValid: js.UndefOr[Boolean] = js.undefined
  /**
    * If the device identifier is not valid, the database may include a reason. The reason may be in any language. The length of the value should not exceed
    * 128 characters.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object DeviceValidity {
  @scala.inline
  def apply(
    deviceDesc: DeviceDescriptor = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    reason: String = null
  ): DeviceValidity = {
    val __obj = js.Dynamic.literal()
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc)
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[DeviceValidity]
  }
}

