package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceValidity extends js.Object {
  /** The descriptor of the device for which the validity check was requested. It will always be present. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /** The validity status: true if the device is valid for operation, false otherwise. It will always be present. */
  var isValid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the device identifier is not valid, the database may include a reason. The reason may be in any language. The length of the value should not exceed
    * 128 characters.
    */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

