package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsInitRequest extends js.Object {
  /**
    * The DeviceDescriptor parameter is required. If the database does not support the device or any of the rulesets specified in the device descriptor, it
    * must return an UNSUPPORTED error code in the error response.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /** A device's geolocation is required. */
  var location: js.UndefOr[GeoLocation] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PawsInitRequest {
  @scala.inline
  def apply(
    deviceDesc: DeviceDescriptor = null,
    location: GeoLocation = null,
    `type`: java.lang.String = null,
    version: java.lang.String = null
  ): PawsInitRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc)
    if (location != null) __obj.updateDynamic("location")(location)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PawsInitRequest]
  }
}

