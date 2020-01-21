package typings.gapiClientSpectrum.gapi.client.spectrum

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
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsInitRequest {
  @scala.inline
  def apply(
    deviceDesc: DeviceDescriptor = null,
    location: GeoLocation = null,
    `type`: String = null,
    version: String = null
  ): PawsInitRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PawsInitRequest]
  }
}

