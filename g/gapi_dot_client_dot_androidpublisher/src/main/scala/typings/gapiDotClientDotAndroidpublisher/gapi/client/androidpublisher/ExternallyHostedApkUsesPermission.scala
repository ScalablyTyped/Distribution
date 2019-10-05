package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyHostedApkUsesPermission extends js.Object {
  /** Optionally, the maximum SDK version for which the permission is required. */
  var maxSdkVersion: js.UndefOr[Double] = js.undefined
  /** The name of the permission requested. */
  var name: js.UndefOr[String] = js.undefined
}

object ExternallyHostedApkUsesPermission {
  @scala.inline
  def apply(maxSdkVersion: Int | Double = null, name: String = null): ExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (maxSdkVersion != null) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ExternallyHostedApkUsesPermission]
  }
}

