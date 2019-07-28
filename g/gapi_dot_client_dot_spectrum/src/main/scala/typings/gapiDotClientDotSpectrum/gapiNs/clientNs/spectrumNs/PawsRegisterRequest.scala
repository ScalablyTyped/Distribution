package typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsRegisterRequest extends js.Object {
  /** Antenna characteristics, including its height and height type. */
  var antenna: js.UndefOr[AntennaCharacteristics] = js.undefined
  /** A DeviceDescriptor is required. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /** Device owner information is required. */
  var deviceOwner: js.UndefOr[DeviceOwner] = js.undefined
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

object PawsRegisterRequest {
  @scala.inline
  def apply(
    antenna: AntennaCharacteristics = null,
    deviceDesc: DeviceDescriptor = null,
    deviceOwner: DeviceOwner = null,
    location: GeoLocation = null,
    `type`: String = null,
    version: String = null
  ): PawsRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (antenna != null) __obj.updateDynamic("antenna")(antenna)
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc)
    if (deviceOwner != null) __obj.updateDynamic("deviceOwner")(deviceOwner)
    if (location != null) __obj.updateDynamic("location")(location)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PawsRegisterRequest]
  }
}

