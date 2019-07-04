package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

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
  var packageName: java.lang.String
  @JSName("platform")
  var platform_AndroidAppMetadata: firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform.ANDROID
}

object AndroidAppMetadata {
  @scala.inline
  def apply(
    appId: java.lang.String,
    packageName: java.lang.String,
    platform: firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform.ANDROID,
    projectId: java.lang.String,
    resourceName: java.lang.String,
    displayName: java.lang.String = null
  ): AndroidAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, packageName = packageName, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[AndroidAppMetadata]
  }
}

