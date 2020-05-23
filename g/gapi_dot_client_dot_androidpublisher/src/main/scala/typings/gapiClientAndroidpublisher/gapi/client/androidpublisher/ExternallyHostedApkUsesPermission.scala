package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

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
  def apply(maxSdkVersion: js.UndefOr[Double] = js.undefined, name: String = null): ExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSdkVersion)) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternallyHostedApkUsesPermission]
  }
}

