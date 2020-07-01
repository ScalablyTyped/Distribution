package typings.firebaseAdmin.admin.remoteConfig

import typings.firebaseAdmin.firebaseAdminStrings.ADMIN_SDK_NODE
import typings.firebaseAdmin.firebaseAdminStrings.CONSOLE
import typings.firebaseAdmin.firebaseAdminStrings.FORCED_UPDATE
import typings.firebaseAdmin.firebaseAdminStrings.INCREMENTAL_UPDATE
import typings.firebaseAdmin.firebaseAdminStrings.REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED
import typings.firebaseAdmin.firebaseAdminStrings.REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED
import typings.firebaseAdmin.firebaseAdminStrings.REST_API
import typings.firebaseAdmin.firebaseAdminStrings.ROLLBACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  /**
    * The user-provided description of the corresponding Remote Config template.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this Remote Config template was published before version history was
    * supported.
    */
  var isLegacy: js.UndefOr[Boolean] = js.undefined
  /**
    * The version number of the Remote Config template that has become the current version
    * due to a rollback. Only present if this version is the result of a rollback.
    */
  var rollbackSource: js.UndefOr[String] = js.undefined
  /**
    * The origin of the template update action.
    */
  var updateOrigin: js.UndefOr[REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED | CONSOLE | REST_API | ADMIN_SDK_NODE] = js.undefined
  /**
    * The timestamp of when this version of the Remote Config template was written to the
    * Remote Config backend.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  /**
    * The type of the template update action.
    */
  var updateType: js.UndefOr[
    REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED | INCREMENTAL_UPDATE | FORCED_UPDATE | ROLLBACK
  ] = js.undefined
  /**
    * Aggregation of all metadata fields about the account that performed the update.
    */
  var updateUser: js.UndefOr[RemoteConfigUser] = js.undefined
  /**
    * The version number of a Remote Config template.
    */
  var versionNumber: js.UndefOr[String] = js.undefined
}

object Version {
  @scala.inline
  def apply(
    description: String = null,
    isLegacy: js.UndefOr[Boolean] = js.undefined,
    rollbackSource: String = null,
    updateOrigin: REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED | CONSOLE | REST_API | ADMIN_SDK_NODE = null,
    updateTime: String = null,
    updateType: REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED | INCREMENTAL_UPDATE | FORCED_UPDATE | ROLLBACK = null,
    updateUser: RemoteConfigUser = null,
    versionNumber: String = null
  ): Version = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isLegacy)) __obj.updateDynamic("isLegacy")(isLegacy.get.asInstanceOf[js.Any])
    if (rollbackSource != null) __obj.updateDynamic("rollbackSource")(rollbackSource.asInstanceOf[js.Any])
    if (updateOrigin != null) __obj.updateDynamic("updateOrigin")(updateOrigin.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (updateType != null) __obj.updateDynamic("updateType")(updateType.asInstanceOf[js.Any])
    if (updateUser != null) __obj.updateDynamic("updateUser")(updateUser.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

