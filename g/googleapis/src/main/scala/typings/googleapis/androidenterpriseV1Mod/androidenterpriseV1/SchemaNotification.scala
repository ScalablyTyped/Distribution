package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
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
    def setAppRestrictionsSchemaChangeEvent(value: SchemaAppRestrictionsSchemaChangeEvent): Self = this.set("appRestrictionsSchemaChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRestrictionsSchemaChangeEvent: Self = this.set("appRestrictionsSchemaChangeEvent", js.undefined)
    
    @scala.inline
    def setAppUpdateEvent(value: SchemaAppUpdateEvent): Self = this.set("appUpdateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUpdateEvent: Self = this.set("appUpdateEvent", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    
    @scala.inline
    def setInstallFailureEvent(value: SchemaInstallFailureEvent): Self = this.set("installFailureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallFailureEvent: Self = this.set("installFailureEvent", js.undefined)
    
    @scala.inline
    def setNewDeviceEvent(value: SchemaNewDeviceEvent): Self = this.set("newDeviceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDeviceEvent: Self = this.set("newDeviceEvent", js.undefined)
    
    @scala.inline
    def setNewPermissionsEvent(value: SchemaNewPermissionsEvent): Self = this.set("newPermissionsEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPermissionsEvent: Self = this.set("newPermissionsEvent", js.undefined)
    
    @scala.inline
    def setNotificationType(value: String): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    
    @scala.inline
    def setProductApprovalEvent(value: SchemaProductApprovalEvent): Self = this.set("productApprovalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductApprovalEvent: Self = this.set("productApprovalEvent", js.undefined)
    
    @scala.inline
    def setProductAvailabilityChangeEvent(value: SchemaProductAvailabilityChangeEvent): Self = this.set("productAvailabilityChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductAvailabilityChangeEvent: Self = this.set("productAvailabilityChangeEvent", js.undefined)
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampMillis: Self = this.set("timestampMillis", js.undefined)
  }
}
