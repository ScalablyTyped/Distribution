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
    if (appRestrictionsSchemaChangeEvent != null) __obj.updateDynamic("appRestrictionsSchemaChangeEvent")(appRestrictionsSchemaChangeEvent)
    if (appUpdateEvent != null) __obj.updateDynamic("appUpdateEvent")(appUpdateEvent)
    if (enterpriseId != null) __obj.updateDynamic("enterpriseId")(enterpriseId)
    if (installFailureEvent != null) __obj.updateDynamic("installFailureEvent")(installFailureEvent)
    if (newDeviceEvent != null) __obj.updateDynamic("newDeviceEvent")(newDeviceEvent)
    if (newPermissionsEvent != null) __obj.updateDynamic("newPermissionsEvent")(newPermissionsEvent)
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType)
    if (productApprovalEvent != null) __obj.updateDynamic("productApprovalEvent")(productApprovalEvent)
    if (productAvailabilityChangeEvent != null) __obj.updateDynamic("productAvailabilityChangeEvent")(productAvailabilityChangeEvent)
    if (timestampMillis != null) __obj.updateDynamic("timestampMillis")(timestampMillis)
    __obj.asInstanceOf[Notification]
  }
}

