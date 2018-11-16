package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DevicesLongRunningOperationResponse extends js.Object {
  /**
               * Processing status for each device.
               * One `PerDeviceStatus` per device. The order is the same as in your requests.
               */
  var perDeviceStatus: js.UndefOr[js.Array[OperationPerDevice]] = js.undefined
  /** Number of succeesfully processed ones. */
  var successCount: js.UndefOr[scala.Double] = js.undefined
}

