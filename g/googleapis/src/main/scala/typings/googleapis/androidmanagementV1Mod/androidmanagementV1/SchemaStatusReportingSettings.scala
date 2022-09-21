package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusReportingSettings extends StObject {
  
  /**
    * Application reporting settings. Only applicable if application_reports_enabled is true.
    */
  var applicationReportingSettings: js.UndefOr[SchemaApplicationReportingSettings] = js.undefined
  
  /**
    * Whether app reports are enabled.
    */
  var applicationReportsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Common Criteria Mode reporting is enabled.
    */
  var commonCriteriaModeEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether device settings reporting is enabled.
    */
  var deviceSettingsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether displays reporting is enabled. Report data is not available for personally owned devices with work profiles.
    */
  var displayInfoEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether hardware status reporting is enabled. Report data is not available for personally owned devices with work profiles.
    */
  var hardwareStatusEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether memory event reporting is enabled.
    */
  var memoryInfoEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether network info reporting is enabled.
    */
  var networkInfoEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether power management event reporting is enabled. Report data is not available for personally owned devices with work profiles.
    */
  var powerManagementEventsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether software info reporting is enabled.
    */
  var softwareInfoEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether system properties reporting is enabled.
    */
  var systemPropertiesEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaStatusReportingSettings {
  
  inline def apply(): SchemaStatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusReportingSettings]
  }
  
  extension [Self <: SchemaStatusReportingSettings](x: Self) {
    
    inline def setApplicationReportingSettings(value: SchemaApplicationReportingSettings): Self = StObject.set(x, "applicationReportingSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationReportingSettingsUndefined: Self = StObject.set(x, "applicationReportingSettings", js.undefined)
    
    inline def setApplicationReportsEnabled(value: Boolean): Self = StObject.set(x, "applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationReportsEnabledNull: Self = StObject.set(x, "applicationReportsEnabled", null)
    
    inline def setApplicationReportsEnabledUndefined: Self = StObject.set(x, "applicationReportsEnabled", js.undefined)
    
    inline def setCommonCriteriaModeEnabled(value: Boolean): Self = StObject.set(x, "commonCriteriaModeEnabled", value.asInstanceOf[js.Any])
    
    inline def setCommonCriteriaModeEnabledNull: Self = StObject.set(x, "commonCriteriaModeEnabled", null)
    
    inline def setCommonCriteriaModeEnabledUndefined: Self = StObject.set(x, "commonCriteriaModeEnabled", js.undefined)
    
    inline def setDeviceSettingsEnabled(value: Boolean): Self = StObject.set(x, "deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingsEnabledNull: Self = StObject.set(x, "deviceSettingsEnabled", null)
    
    inline def setDeviceSettingsEnabledUndefined: Self = StObject.set(x, "deviceSettingsEnabled", js.undefined)
    
    inline def setDisplayInfoEnabled(value: Boolean): Self = StObject.set(x, "displayInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayInfoEnabledNull: Self = StObject.set(x, "displayInfoEnabled", null)
    
    inline def setDisplayInfoEnabledUndefined: Self = StObject.set(x, "displayInfoEnabled", js.undefined)
    
    inline def setHardwareStatusEnabled(value: Boolean): Self = StObject.set(x, "hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    inline def setHardwareStatusEnabledNull: Self = StObject.set(x, "hardwareStatusEnabled", null)
    
    inline def setHardwareStatusEnabledUndefined: Self = StObject.set(x, "hardwareStatusEnabled", js.undefined)
    
    inline def setMemoryInfoEnabled(value: Boolean): Self = StObject.set(x, "memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoEnabledNull: Self = StObject.set(x, "memoryInfoEnabled", null)
    
    inline def setMemoryInfoEnabledUndefined: Self = StObject.set(x, "memoryInfoEnabled", js.undefined)
    
    inline def setNetworkInfoEnabled(value: Boolean): Self = StObject.set(x, "networkInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoEnabledNull: Self = StObject.set(x, "networkInfoEnabled", null)
    
    inline def setNetworkInfoEnabledUndefined: Self = StObject.set(x, "networkInfoEnabled", js.undefined)
    
    inline def setPowerManagementEventsEnabled(value: Boolean): Self = StObject.set(x, "powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPowerManagementEventsEnabledNull: Self = StObject.set(x, "powerManagementEventsEnabled", null)
    
    inline def setPowerManagementEventsEnabledUndefined: Self = StObject.set(x, "powerManagementEventsEnabled", js.undefined)
    
    inline def setSoftwareInfoEnabled(value: Boolean): Self = StObject.set(x, "softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoftwareInfoEnabledNull: Self = StObject.set(x, "softwareInfoEnabled", null)
    
    inline def setSoftwareInfoEnabledUndefined: Self = StObject.set(x, "softwareInfoEnabled", js.undefined)
    
    inline def setSystemPropertiesEnabled(value: Boolean): Self = StObject.set(x, "systemPropertiesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSystemPropertiesEnabledNull: Self = StObject.set(x, "systemPropertiesEnabled", null)
    
    inline def setSystemPropertiesEnabledUndefined: Self = StObject.set(x, "systemPropertiesEnabled", js.undefined)
  }
}
