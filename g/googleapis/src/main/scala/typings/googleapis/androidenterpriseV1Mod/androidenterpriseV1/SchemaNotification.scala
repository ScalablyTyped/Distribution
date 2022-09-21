package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Notifications about device report updates.
    */
  var deviceReportUpdateEvent: js.UndefOr[SchemaDeviceReportUpdateEvent] = js.undefined
  
  /**
    * The ID of the enterprise for which the notification is sent. This will always be present.
    */
  var enterpriseId: js.UndefOr[String | Null] = js.undefined
  
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
  var notificationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notifications about changes to a product's approval status.
    */
  var productApprovalEvent: js.UndefOr[SchemaProductApprovalEvent] = js.undefined
  
  /**
    * Notifications about product availability changes.
    */
  var productAvailabilityChangeEvent: js.UndefOr[SchemaProductAvailabilityChangeEvent] = js.undefined
  
  /**
    * The time when the notification was published in milliseconds since 1970-01-01T00:00:00Z. This will always be present.
    */
  var timestampMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotification {
  
  inline def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  extension [Self <: SchemaNotification](x: Self) {
    
    inline def setAppRestrictionsSchemaChangeEvent(value: SchemaAppRestrictionsSchemaChangeEvent): Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setAppRestrictionsSchemaChangeEventUndefined: Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", js.undefined)
    
    inline def setAppUpdateEvent(value: SchemaAppUpdateEvent): Self = StObject.set(x, "appUpdateEvent", value.asInstanceOf[js.Any])
    
    inline def setAppUpdateEventUndefined: Self = StObject.set(x, "appUpdateEvent", js.undefined)
    
    inline def setDeviceReportUpdateEvent(value: SchemaDeviceReportUpdateEvent): Self = StObject.set(x, "deviceReportUpdateEvent", value.asInstanceOf[js.Any])
    
    inline def setDeviceReportUpdateEventUndefined: Self = StObject.set(x, "deviceReportUpdateEvent", js.undefined)
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdNull: Self = StObject.set(x, "enterpriseId", null)
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setInstallFailureEvent(value: SchemaInstallFailureEvent): Self = StObject.set(x, "installFailureEvent", value.asInstanceOf[js.Any])
    
    inline def setInstallFailureEventUndefined: Self = StObject.set(x, "installFailureEvent", js.undefined)
    
    inline def setNewDeviceEvent(value: SchemaNewDeviceEvent): Self = StObject.set(x, "newDeviceEvent", value.asInstanceOf[js.Any])
    
    inline def setNewDeviceEventUndefined: Self = StObject.set(x, "newDeviceEvent", js.undefined)
    
    inline def setNewPermissionsEvent(value: SchemaNewPermissionsEvent): Self = StObject.set(x, "newPermissionsEvent", value.asInstanceOf[js.Any])
    
    inline def setNewPermissionsEventUndefined: Self = StObject.set(x, "newPermissionsEvent", js.undefined)
    
    inline def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeNull: Self = StObject.set(x, "notificationType", null)
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    inline def setProductApprovalEvent(value: SchemaProductApprovalEvent): Self = StObject.set(x, "productApprovalEvent", value.asInstanceOf[js.Any])
    
    inline def setProductApprovalEventUndefined: Self = StObject.set(x, "productApprovalEvent", js.undefined)
    
    inline def setProductAvailabilityChangeEvent(value: SchemaProductAvailabilityChangeEvent): Self = StObject.set(x, "productAvailabilityChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setProductAvailabilityChangeEventUndefined: Self = StObject.set(x, "productAvailabilityChangeEvent", js.undefined)
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillisNull: Self = StObject.set(x, "timestampMillis", null)
    
    inline def setTimestampMillisUndefined: Self = StObject.set(x, "timestampMillis", js.undefined)
  }
}
