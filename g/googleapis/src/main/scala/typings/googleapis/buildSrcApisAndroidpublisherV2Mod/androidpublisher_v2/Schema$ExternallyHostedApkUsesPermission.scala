package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission used by this APK.
  */
@js.native
trait Schema$ExternallyHostedApkUsesPermission extends js.Object {
  /**
    * Optionally, the maximum SDK version for which the permission is required.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * The name of the permission requested.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ExternallyHostedApkUsesPermission {
  @scala.inline
  def apply(maxSdkVersion: Int | Double = null, name: String = null): Schema$ExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (maxSdkVersion != null) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExternallyHostedApkUsesPermission]
  }
}

