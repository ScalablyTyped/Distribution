package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Notifications about new app restrictions schema changes. */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[AppRestrictionsSchemaChangeEvent] = js.undefined
  /** Notifications about app updates. */
  var appUpdateEvent: js.UndefOr[AppUpdateEvent] = js.undefined
  /** The ID of the enterprise for which the notification is sent. This will always be present. */
  var enterpriseId: js.UndefOr[String] = js.undefined
  /** Notifications about an app installation failure. */
  var installFailureEvent: js.UndefOr[InstallFailureEvent] = js.undefined
  /** Notifications about new devices. */
  var newDeviceEvent: js.UndefOr[NewDeviceEvent] = js.undefined
  /** Notifications about new app permissions. */
  var newPermissionsEvent: js.UndefOr[NewPermissionsEvent] = js.undefined
  /** Type of the notification. */
  var notificationType: js.UndefOr[String] = js.undefined
  /** Notifications about changes to a product's approval status. */
  var productApprovalEvent: js.UndefOr[ProductApprovalEvent] = js.undefined
  /** Notifications about product availability changes. */
  var productAvailabilityChangeEvent: js.UndefOr[ProductAvailabilityChangeEvent] = js.undefined
  /** The time when the notification was published in milliseconds since 1970-01-01T00:00:00Z. This will always be present. */
  var timestampMillis: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    appRestrictionsSchemaChangeEvent: AppRestrictionsSchemaChangeEvent = null,
    appUpdateEvent: AppUpdateEvent = null,
    enterpriseId: String = null,
    installFailureEvent: InstallFailureEvent = null,
    newDeviceEvent: NewDeviceEvent = null,
    newPermissionsEvent: NewPermissionsEvent = null,
    notificationType: String = null,
    productApprovalEvent: ProductApprovalEvent = null,
    productAvailabilityChangeEvent: ProductAvailabilityChangeEvent = null,
    timestampMillis: String = null
  ): Notification = {
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
    __obj.asInstanceOf[Notification]
  }
}

