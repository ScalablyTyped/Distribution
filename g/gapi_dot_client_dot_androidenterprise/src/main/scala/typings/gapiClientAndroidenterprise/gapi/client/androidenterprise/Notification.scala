package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /** Notifications about new app restrictions schema changes. */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[AppRestrictionsSchemaChangeEvent] = js.native
  /** Notifications about app updates. */
  var appUpdateEvent: js.UndefOr[AppUpdateEvent] = js.native
  /** The ID of the enterprise for which the notification is sent. This will always be present. */
  var enterpriseId: js.UndefOr[String] = js.native
  /** Notifications about an app installation failure. */
  var installFailureEvent: js.UndefOr[InstallFailureEvent] = js.native
  /** Notifications about new devices. */
  var newDeviceEvent: js.UndefOr[NewDeviceEvent] = js.native
  /** Notifications about new app permissions. */
  var newPermissionsEvent: js.UndefOr[NewPermissionsEvent] = js.native
  /** Type of the notification. */
  var notificationType: js.UndefOr[String] = js.native
  /** Notifications about changes to a product's approval status. */
  var productApprovalEvent: js.UndefOr[ProductApprovalEvent] = js.native
  /** Notifications about product availability changes. */
  var productAvailabilityChangeEvent: js.UndefOr[ProductAvailabilityChangeEvent] = js.native
  /** The time when the notification was published in milliseconds since 1970-01-01T00:00:00Z. This will always be present. */
  var timestampMillis: js.UndefOr[String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppRestrictionsSchemaChangeEvent(value: AppRestrictionsSchemaChangeEvent): Self = this.set("appRestrictionsSchemaChangeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppRestrictionsSchemaChangeEvent: Self = this.set("appRestrictionsSchemaChangeEvent", js.undefined)
    @scala.inline
    def setAppUpdateEvent(value: AppUpdateEvent): Self = this.set("appUpdateEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppUpdateEvent: Self = this.set("appUpdateEvent", js.undefined)
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    @scala.inline
    def setInstallFailureEvent(value: InstallFailureEvent): Self = this.set("installFailureEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallFailureEvent: Self = this.set("installFailureEvent", js.undefined)
    @scala.inline
    def setNewDeviceEvent(value: NewDeviceEvent): Self = this.set("newDeviceEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewDeviceEvent: Self = this.set("newDeviceEvent", js.undefined)
    @scala.inline
    def setNewPermissionsEvent(value: NewPermissionsEvent): Self = this.set("newPermissionsEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPermissionsEvent: Self = this.set("newPermissionsEvent", js.undefined)
    @scala.inline
    def setNotificationType(value: String): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    @scala.inline
    def setProductApprovalEvent(value: ProductApprovalEvent): Self = this.set("productApprovalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductApprovalEvent: Self = this.set("productApprovalEvent", js.undefined)
    @scala.inline
    def setProductAvailabilityChangeEvent(value: ProductAvailabilityChangeEvent): Self = this.set("productAvailabilityChangeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductAvailabilityChangeEvent: Self = this.set("productAvailabilityChangeEvent", js.undefined)
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampMillis: Self = this.set("timestampMillis", js.undefined)
  }
  
}

