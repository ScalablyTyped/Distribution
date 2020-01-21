package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification of one event relating to an enterprise.
  */
@js.native
trait SchemaNotification extends js.Object {
  /**
    * Notifications about new app restrictions schema changes.
    */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[SchemaAppRestrictionsSchemaChangeEvent] = js.native
  /**
    * Notifications about app updates.
    */
  var appUpdateEvent: js.UndefOr[SchemaAppUpdateEvent] = js.native
  /**
    * The ID of the enterprise for which the notification is sent. This will
    * always be present.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * Notifications about an app installation failure.
    */
  var installFailureEvent: js.UndefOr[SchemaInstallFailureEvent] = js.native
  /**
    * Notifications about new devices.
    */
  var newDeviceEvent: js.UndefOr[SchemaNewDeviceEvent] = js.native
  /**
    * Notifications about new app permissions.
    */
  var newPermissionsEvent: js.UndefOr[SchemaNewPermissionsEvent] = js.native
  /**
    * Type of the notification.
    */
  var notificationType: js.UndefOr[String] = js.native
  /**
    * Notifications about changes to a product&#39;s approval status.
    */
  var productApprovalEvent: js.UndefOr[SchemaProductApprovalEvent] = js.native
  /**
    * Notifications about product availability changes.
    */
  var productAvailabilityChangeEvent: js.UndefOr[SchemaProductAvailabilityChangeEvent] = js.native
  /**
    * The time when the notification was published in milliseconds since
    * 1970-01-01T00:00:00Z. This will always be present.
    */
  var timestampMillis: js.UndefOr[String] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(
    appRestrictionsSchemaChangeEvent: SchemaAppRestrictionsSchemaChangeEvent = null,
    appUpdateEvent: SchemaAppUpdateEvent = null,
    enterpriseId: String = null,
    installFailureEvent: SchemaInstallFailureEvent = null,
    newDeviceEvent: SchemaNewDeviceEvent = null,
    newPermissionsEvent: SchemaNewPermissionsEvent = null,
    notificationType: String = null,
    productApprovalEvent: SchemaProductApprovalEvent = null,
    productAvailabilityChangeEvent: SchemaProductAvailabilityChangeEvent = null,
    timestampMillis: String = null
  ): SchemaNotification = {
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
    __obj.asInstanceOf[SchemaNotification]
  }
}

