package typings.gapiDotClientDotSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsVerifyDeviceRequest extends js.Object {
  /** A list of device descriptors, which specifies the slave devices to be validated, is required. */
  var deviceDescs: js.UndefOr[js.Array[DeviceDescriptor]] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsVerifyDeviceRequest {
  @scala.inline
  def apply(deviceDescs: js.Array[DeviceDescriptor] = null, `type`: String = null, version: String = null): PawsVerifyDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceDescs != null) __obj.updateDynamic("deviceDescs")(deviceDescs)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PawsVerifyDeviceRequest]
  }
}

