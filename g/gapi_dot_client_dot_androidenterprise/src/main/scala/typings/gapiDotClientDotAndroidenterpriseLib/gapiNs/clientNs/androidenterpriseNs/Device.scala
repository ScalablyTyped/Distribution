package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The Google Play Services Android ID for the device encoded as a lowercase hex string. For example, "123456789abcdef0". */
  var androidId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#device". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the extent to which the device is controlled by a managed Google Play EMM in various deployment configurations.
    *
    * Possible values include:
    * - "managedDevice", a device that has the EMM's device policy controller (DPC) as the device owner.
    * - "managedProfile", a device that has a profile managed by the DPC (DPC is profile owner) in addition to a separate, personal profile that is
    * unavailable to the DPC.
    * - "containerApp", no longer used (deprecated).
    * - "unmanagedProfile", a device that has been allowed (by the domain's admin, using the Admin Console to enable the privilege) to use managed Google
    * Play, but the profile is itself not owned by a DPC.
    */
  var managementType: js.UndefOr[java.lang.String] = js.undefined
}

