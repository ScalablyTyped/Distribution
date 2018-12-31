package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

