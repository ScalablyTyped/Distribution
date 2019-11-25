package typings.firebaseDashAdmin.admin.projectManagement

import typings.firebaseDashAdmin.admin.projectManagement.AppPlatform.ANDROID
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
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidAppMetadata]
  }
}

