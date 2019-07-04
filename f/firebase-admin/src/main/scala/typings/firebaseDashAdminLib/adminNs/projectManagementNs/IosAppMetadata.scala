package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase iOS App.
  */
trait IosAppMetadata extends AppMetadata {
  /**
    * The canonical bundle ID of the iOS App as it would appear in the iOS App Store.
    *
    * @example
    * ```javascript
    * var bundleId = iosAppMetadata.bundleId;
    *```
    */
  var bundleId: java.lang.String
  @JSName("platform")
  var platform_IosAppMetadata: firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform.IOS
}

object IosAppMetadata {
  @scala.inline
  def apply(
    appId: java.lang.String,
    bundleId: java.lang.String,
    platform: firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform.IOS,
    projectId: java.lang.String,
    resourceName: java.lang.String,
    displayName: java.lang.String = null
  ): IosAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, bundleId = bundleId, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[IosAppMetadata]
  }
}

