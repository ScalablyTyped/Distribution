package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeviceOwner extends js.Object {
  /** The vCard contact information for the device operator is optional, but may be required by specific regulatory domains. */
  var operator: js.UndefOr[Vcard] = js.undefined
  /** The vCard contact information for the individual or business that owns the device is required. */
  var owner: js.UndefOr[Vcard] = js.undefined
}

