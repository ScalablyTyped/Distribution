package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PawsVerifyDeviceResponse extends js.Object {
  /**
               * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
               * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
               * the list of alternate URIs.
               */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.undefined
  /**
               * A device validities list is required in the device validation response to report whether each slave device listed in a previous device validation
               * request is valid. The number of entries must match the number of device descriptors listed in the previous device validation request.
               */
  var deviceValidities: js.UndefOr[js.Array[DeviceValidity]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsVerifyDeviceResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
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

