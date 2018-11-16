package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeviceState extends js.Object {
  /**
               * The state of the Google account on the device. "enabled" indicates that the Google account on the device can be used to access Google services
               * (including Google Play), while "disabled" means that it cannot. A new device is initially in the "disabled" state.
               */
  var accountState: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#deviceState". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

