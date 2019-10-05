package typings.firebaseDashAdmin.admin.projectManagement

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
  var appId: String
  /**
    * The optional user-assigned display name of the app.
    *
    * @example
    * ```javascript
    * var displayName = appMetadata.displayName;
    * ```
    */
  var displayName: js.UndefOr[String] = js.undefined
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
  var projectId: String
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
  var resourceName: String
}

object AppMetadata {
  @scala.inline
  def apply(
    appId: String,
    platform: AppPlatform,
    projectId: String,
    resourceName: String,
    displayName: String = null
  ): AppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId, platform = platform, projectId = projectId, resourceName = resourceName)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[AppMetadata]
  }
}

