package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase app.
  */
trait AppMetadata extends js.Object {
  /**
    * The globally unique, Firebase-assigned identifier of the app.
    *
    * @example
    * ```javascript
    * var appId = appMetadata.appId;
    * ```
    */
  var appId: java.lang.String
  /**
    * The optional user-assigned display name of the app.
    *
    * @example
    * ```javascript
    * var displayName = appMetadata.displayName;
    * ```
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The development platform of the app. Supporting Android and iOS app platforms.
    *
    * @example
    * ```javascript
    * var platform = AppPlatform.ANDROID;
    * ```
    */
  var platform: AppPlatform
  /**
    * The globally unique, user-assigned ID of the parent project for the app.
    *
    * @example
    * ```javascript
    * var projectId = appMetadata.projectId;
    * ```
    */
  var projectId: java.lang.String
  /**
    * The fully-qualified resource name that identifies this app.
    *
    * This is useful when manually constructing requests for Firebase's public API.
    *
    * @example
    * ```javascript
    * var resourceName = androidAppMetadata.resourceName;
    * ```
    */
  var resourceName: java.lang.String
}

object AppMetadata {
  @scala.inline
  def apply(
    appId: java.lang.String,
    platform: AppPlatform,
    projectId: java.lang.String,
    resourceName: java.lang.String,
    displayName: java.lang.String = null
  ): AppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[AppMetadata]
  }
}

