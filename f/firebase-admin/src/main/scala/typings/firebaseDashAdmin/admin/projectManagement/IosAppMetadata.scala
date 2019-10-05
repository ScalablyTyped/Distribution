package typings.firebaseDashAdmin.admin.projectManagement

import typings.firebaseDashAdmin.admin.projectManagement.AppPlatform.IOS
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
  var bundleId: String
  @JSName("platform")
  var platform_IosAppMetadata: IOS
}

object IosAppMetadata {
  @scala.inline
  def apply(
    appId: String,
    bundleId: String,
    platform: IOS,
    projectId: String,
    resourceName: String,
    displayName: String = null
  ): IosAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, bundleId = bundleId, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[IosAppMetadata]
  }
}

