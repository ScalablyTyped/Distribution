package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notification of one event relating to an enterprise.
  */
trait SchemaNotification extends StObject {
  
  /**
    * Notifications about new app restrictions schema changes.
    */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[SchemaAppRestrictionsSchemaChangeEvent] = js.undefined
  
  /**
    * Notifications about app updates.
    */
  var appUpdateEvent: js.UndefOr[SchemaAppUpdateEvent] = js.undefined
  
  /**
    * The ID of the enterprise for which the notification is sent. This will
    * always be present.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * Notifications about an app installation failure.
    */
  var installFailureEvent: js.UndefOr[SchemaInstallFailureEvent] = js.undefined
  
  /**
    * Notifications about new devices.
    */
  var newDeviceEvent: js.UndefOr[SchemaNewDeviceEvent] = js.undefined
  
  /**
    * Notifications about new app permissions.
    */
  var newPermissionsEvent: js.UndefOr[SchemaNewPermissionsEvent] = js.undefined
  
  /**
    * Type of the notification.
    */
  var notificationType: js.UndefOr[String] = js.undefined
  
  /**
    * Notifications about changes to a product&#39;s approval status.
    */
  var productApprovalEvent: js.UndefOr[SchemaProductApprovalEvent] = js.undefined
  
  /**
    * Notifications about product availability changes.
    */
  var productAvailabilityChangeEvent: js.UndefOr[SchemaProductAvailabilityChangeEvent] = js.undefined
  
  /**
    * The time when the notification was published in milliseconds since
    * 1970-01-01T00:00:00Z. This will always be present.
    */
  var timestampMillis: js.UndefOr[String] = js.undefined
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppRestrictionsSchemaChangeEvent(value: SchemaAppRestrictionsSchemaChangeEvent): Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRestrictionsSchemaChangeEventUndefined: Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", js.undefined)
    
    @scala.inline
    def setAppUpdateEvent(value: SchemaAppUpdateEvent): Self = StObject.set(x, "appUpdateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUpdateEventUndefined: Self = StObject.set(x, "appUpdateEvent", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setInstallFailureEvent(value: SchemaInstallFailureEvent): Self = StObject.set(x, "installFailureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallFailureEventUndefined: Self = StObject.set(x, "installFailureEvent", js.undefined)
    
    @scala.inline
    def setNewDeviceEvent(value: SchemaNewDeviceEvent): Self = StObject.set(x, "newDeviceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDeviceEventUndefined: Self = StObject.set(x, "newDeviceEvent", js.undefined)
    
    @scala.inline
    def setNewPermissionsEvent(value: SchemaNewPermissionsEvent): Self = StObject.set(x, "newPermissionsEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPermissionsEventUndefined: Self = StObject.set(x, "newPermissionsEvent", js.undefined)
    
    @scala.inline
    def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    @scala.inline
    def setProductApprovalEvent(value: SchemaProductApprovalEvent): Self = StObject.set(x, "productApprovalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductApprovalEventUndefined: Self = StObject.set(x, "productApprovalEvent", js.undefined)
    
    @scala.inline
    def setProductAvailabilityChangeEvent(value: SchemaProductAvailabilityChangeEvent): Self = StObject.set(x, "productAvailabilityChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAvailabilityChangeEventUndefined: Self = StObject.set(x, "productAvailabilityChangeEvent", js.undefined)
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillisUndefined: Self = StObject.set(x, "timestampMillis", js.undefined)
  }
}
