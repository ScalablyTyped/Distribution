package typings.firebaseAdmin.admin.projectManagement

import typings.firebaseAdmin.projectManagementMod.admin.projectManagement.AppPlatform.IOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase iOS App.
  */
trait IosAppMetadata
  extends typings.firebaseAdmin.projectManagementMod.admin.projectManagement.AppMetadata {
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
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosAppMetadata]
  }
}

