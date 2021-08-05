package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings controlling the behavior of status reports.
  */
trait SchemaStatusReportingSettings extends StObject {
  
  /**
    * Whether app reports are enabled.
    */
  var applicationReportsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether device settings reporting is enabled.
    */
  var deviceSettingsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether displays reporting is enabled.
    */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether hardware status reporting is enabled.
    */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether memory reporting is enabled.
    */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether network info reporting is enabled.
    */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether power management event reporting is enabled.
    */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether software info reporting is enabled.
    */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaStatusReportingSettings {
  
  inline def apply(): SchemaStatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusReportingSettings]
  }
  
  extension [Self <: SchemaStatusReportingSettings](x: Self) {
    
    inline def setApplicationReportsEnabled(value: Boolean): Self = StObject.set(x, "applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationReportsEnabledUndefined: Self = StObject.set(x, "applicationReportsEnabled", js.undefined)
    
    inline def setDeviceSettingsEnabled(value: Boolean): Self = StObject.set(x, "deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingsEnabledUndefined: Self = StObject.set(x, "deviceSettingsEnabled", js.undefined)
    
    inline def setDisplayInfoEnabled(value: Boolean): Self = StObject.set(x, "displayInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayInfoEnabledUndefined: Self = StObject.set(x, "displayInfoEnabled", js.undefined)
    
    inline def setHardwareStatusEnabled(value: Boolean): Self = StObject.set(x, "hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    inline def setHardwareStatusEnabledUndefined: Self = StObject.set(x, "hardwareStatusEnabled", js.undefined)
    
    inline def setMemoryInfoEnabled(value: Boolean): Self = StObject.set(x, "memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoEnabledUndefined: Self = StObject.set(x, "memoryInfoEnabled", js.undefined)
    
    inline def setNetworkInfoEnabled(value: Boolean): Self = StObject.set(x, "networkInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoEnabledUndefined: Self = StObject.set(x, "networkInfoEnabled", js.undefined)
    
    inline def setPowerManagementEventsEnabled(value: Boolean): Self = StObject.set(x, "powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPowerManagementEventsEnabledUndefined: Self = StObject.set(x, "powerManagementEventsEnabled", js.undefined)
    
    inline def setSoftwareInfoEnabled(value: Boolean): Self = StObject.set(x, "softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoftwareInfoEnabledUndefined: Self = StObject.set(x, "softwareInfoEnabled", js.undefined)
  }
}
