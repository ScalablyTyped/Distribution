package typings.firebaseDashAdmin.adminNs.projectManagementNs

import typings.firebaseDashAdmin.adminNs.projectManagementNs.AppPlatform.ANDROID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase Android App.
  */
trait AndroidAppMetadata extends AppMetadata {
  /**
    * The canonical package name of the Android App, as would appear in the Google Play Developer
    * Console.
    *
    * @example
    * ```javascript
    * var packageName = androidAppMetadata.packageName;
    * ```
    */
  var packageName: String
  @JSName("platform")
  var platform_AndroidAppMetadata: ANDROID
}

object AndroidAppMetadata {
  @scala.inline
  def apply(
    appId: String,
    packageName: String,
    platform: ANDROID,
    projectId: String,
    resourceName: String,
    displayName: String = null
  ): AndroidAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, packageName = packageName, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[AndroidAppMetadata]
  }
}

