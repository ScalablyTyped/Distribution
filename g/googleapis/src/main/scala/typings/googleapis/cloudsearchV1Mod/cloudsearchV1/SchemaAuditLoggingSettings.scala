package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuditLoggingSettings extends StObject {
  
  /**
    * Indicates whether audit logging is on/off for admin activity read APIs i.e. Get/List DataSources, Get/List SearchApplications etc.
    */
  var logAdminReadActions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether audit logging is on/off for data access read APIs i.e. ListItems, GetItem etc.
    */
  var logDataReadActions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether audit logging is on/off for data access write APIs i.e. IndexItem etc.
    */
  var logDataWriteActions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource name of the GCP Project to store audit logs. Cloud audit logging will be enabled after project_name has been updated through CustomerService. Format: projects/{project_id\}
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuditLoggingSettings {
  
  inline def apply(): SchemaAuditLoggingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLoggingSettings]
  }
  
  extension [Self <: SchemaAuditLoggingSettings](x: Self) {
    
    inline def setLogAdminReadActions(value: Boolean): Self = StObject.set(x, "logAdminReadActions", value.asInstanceOf[js.Any])
    
    inline def setLogAdminReadActionsNull: Self = StObject.set(x, "logAdminReadActions", null)
    
    inline def setLogAdminReadActionsUndefined: Self = StObject.set(x, "logAdminReadActions", js.undefined)
    
    inline def setLogDataReadActions(value: Boolean): Self = StObject.set(x, "logDataReadActions", value.asInstanceOf[js.Any])
    
    inline def setLogDataReadActionsNull: Self = StObject.set(x, "logDataReadActions", null)
    
    inline def setLogDataReadActionsUndefined: Self = StObject.set(x, "logDataReadActions", js.undefined)
    
    inline def setLogDataWriteActions(value: Boolean): Self = StObject.set(x, "logDataWriteActions", value.asInstanceOf[js.Any])
    
    inline def setLogDataWriteActionsNull: Self = StObject.set(x, "logDataWriteActions", null)
    
    inline def setLogDataWriteActionsUndefined: Self = StObject.set(x, "logDataWriteActions", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
