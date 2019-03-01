package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyHostedApkUsesPermission extends js.Object {
  /** Optionally, the maximum SDK version for which the permission is required. */
  var maxSdkVersion: js.UndefOr[scala.Double] = js.undefined
  /** The name of the permission requested. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ExternallyHostedApkUsesPermission {
  @scala.inline
  def apply(maxSdkVersion: scala.Int | scala.Double = null, name: java.lang.String = null): ExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (maxSdkVersion != null) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ExternallyHostedApkUsesPermission]
  }
}

