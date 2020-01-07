package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification of one event relating to an enterprise.
  */
@js.native
trait Schema$Notification extends js.Object {
  /**
    * Notifications about new app restrictions schema changes.
    */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[Schema$AppRestrictionsSchemaChangeEvent] = js.native
  /**
    * Notifications about app updates.
    */
  var appUpdateEvent: js.UndefOr[Schema$AppUpdateEvent] = js.native
  /**
    * The ID of the enterprise for which the notification is sent. This will
    * always be present.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * Notifications about an app installation failure.
    */
  var installFailureEvent: js.UndefOr[Schema$InstallFailureEvent] = js.native
  /**
    * Notifications about new devices.
    */
  var newDeviceEvent: js.UndefOr[Schema$NewDeviceEvent] = js.native
  /**
    * Notifications about new app permissions.
    */
  var newPermissionsEvent: js.UndefOr[Schema$NewPermissionsEvent] = js.native
  /**
    * Type of the notification.
    */
  var notificationType: js.UndefOr[String] = js.native
  /**
    * Notifications about changes to a product&#39;s approval status.
    */
  var productApprovalEvent: js.UndefOr[Schema$ProductApprovalEvent] = js.native
  /**
    * Notifications about product availability changes.
    */
  var productAvailabilityChangeEvent: js.UndefOr[Schema$ProductAvailabilityChangeEvent] = js.native
  /**
    * The time when the notification was published in milliseconds since
    * 1970-01-01T00:00:00Z. This will always be present.
    */
  var timestampMillis: js.UndefOr[String] = js.native
}

object Schema$Notification {
  @scala.inline
  def apply(
    appRestrictionsSchemaChangeEvent: Schema$AppRestrictionsSchemaChangeEvent = null,
    appUpdateEvent: Schema$AppUpdateEvent = null,
    enterpriseId: String = null,
    installFailureEvent: Schema$InstallFailureEvent = null,
    newDeviceEvent: Schema$NewDeviceEvent = null,
    newPermissionsEvent: Schema$NewPermissionsEvent = null,
    notificationType: String = null,
    productApprovalEvent: Schema$ProductApprovalEvent = null,
    productAvailabilityChangeEvent: Schema$ProductAvailabilityChangeEvent = null,
    timestampMillis: String = null
  ): Schema$Notification = {
    val __obj = js.Dynamic.literal()
    if (appRestrictionsSchemaChangeEvent != null) __obj.updateDynamic("appRestrictionsSchemaChangeEvent")(appRestrictionsSchemaChangeEvent.asInstanceOf[js.Any])
    if (appUpdateEvent != null) __obj.updateDynamic("appUpdateEvent")(appUpdateEvent.asInstanceOf[js.Any])
    if (enterpriseId != null) __obj.updateDynamic("enterpriseId")(enterpriseId.asInstanceOf[js.Any])
    if (installFailureEvent != null) __obj.updateDynamic("installFailureEvent")(installFailureEvent.asInstanceOf[js.Any])
    if (newDeviceEvent != null) __obj.updateDynamic("newDeviceEvent")(newDeviceEvent.asInstanceOf[js.Any])
    if (newPermissionsEvent != null) __obj.updateDynamic("newPermissionsEvent")(newPermissionsEvent.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (productApprovalEvent != null) __obj.updateDynamic("productApprovalEvent")(productApprovalEvent.asInstanceOf[js.Any])
    if (productAvailabilityChangeEvent != null) __obj.updateDynamic("productAvailabilityChangeEvent")(productAvailabilityChangeEvent.asInstanceOf[js.Any])
    if (timestampMillis != null) __obj.updateDynamic("timestampMillis")(timestampMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Notification]
  }
}

