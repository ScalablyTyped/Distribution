package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for App Access Collections Resource object in Directory API.
  */
@js.native
trait Schema$AppAccessCollections extends js.Object {
  /**
    * List of blocked api access buckets.
    */
  var blockedApiAccessBuckets: js.UndefOr[js.Array[String]] = js.native
  /**
    * Boolean to indicate whether to enforce app access settings on Android
    * Drive or not.
    */
  var enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.native
  /**
    * Error message provided by the Admin that will be shown to the user when
    * an app is blocked.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as an app access collection. Value:
    * admin#directory#appaccesscollection
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Unique ID of app access collection. (Readonly)
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Resource name given by the customer while creating/updating. Should be
    * unique under given customer.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Boolean that indicates whether to trust domain owned apps.
    */
  var trustDomainOwnedApps: js.UndefOr[Boolean] = js.native
}

object Schema$AppAccessCollections {
  @scala.inline
  def apply(
    blockedApiAccessBuckets: js.Array[String] = null,
    enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    etag: String = null,
    kind: String = null,
    resourceId: String = null,
    resourceName: String = null,
    trustDomainOwnedApps: js.UndefOr[Boolean] = js.undefined
  ): Schema$AppAccessCollections = {
    val __obj = js.Dynamic.literal()
    if (blockedApiAccessBuckets != null) __obj.updateDynamic("blockedApiAccessBuckets")(blockedApiAccessBuckets.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceSettingsForAndroidDrive)) __obj.updateDynamic("enforceSettingsForAndroidDrive")(enforceSettingsForAndroidDrive.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (!js.isUndefined(trustDomainOwnedApps)) __obj.updateDynamic("trustDomainOwnedApps")(trustDomainOwnedApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppAccessCollections]
  }
}

