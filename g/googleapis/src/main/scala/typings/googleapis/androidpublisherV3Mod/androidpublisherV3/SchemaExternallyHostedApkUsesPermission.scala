package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission used by this APK.
  */
@js.native
trait SchemaExternallyHostedApkUsesPermission extends js.Object {
  /**
    * Optionally, the maximum SDK version for which the permission is required.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * The name of the permission requested.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaExternallyHostedApkUsesPermission {
  @scala.inline
  def apply(maxSdkVersion: Int | Double = null, name: String = null): SchemaExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (maxSdkVersion != null) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternallyHostedApkUsesPermission]
  }
}

