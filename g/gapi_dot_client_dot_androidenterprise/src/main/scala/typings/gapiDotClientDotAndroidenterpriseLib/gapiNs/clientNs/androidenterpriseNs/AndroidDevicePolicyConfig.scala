package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AndroidDevicePolicyConfig extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#androidDevicePolicyConfig". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The state of Android Device Policy. "enabled" indicates that Android Device Policy is enabled for the enterprise and the EMM is allowed to manage
               * devices with Android Device Policy, while "disabled" means that it cannot.
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

