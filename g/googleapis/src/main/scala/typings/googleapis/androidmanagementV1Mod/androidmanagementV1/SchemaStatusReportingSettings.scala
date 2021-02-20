package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings controlling the behavior of status reports.
  */
@js.native
trait SchemaStatusReportingSettings extends StObject {
  
  /**
    * Whether app reports are enabled.
    */
  var applicationReportsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether device settings reporting is enabled.
    */
  var deviceSettingsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether displays reporting is enabled.
    */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether hardware status reporting is enabled.
    */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether memory reporting is enabled.
    */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether network info reporting is enabled.
    */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether power management event reporting is enabled.
    */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether software info reporting is enabled.
    */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaStatusReportingSettings {
  
  @scala.inline
  def apply(): SchemaStatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusReportingSettings]
  }
  
  @scala.inline
  implicit class SchemaStatusReportingSettingsMutableBuilder[Self <: SchemaStatusReportingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationReportsEnabled(value: Boolean): Self = StObject.set(x, "applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationReportsEnabledUndefined: Self = StObject.set(x, "applicationReportsEnabled", js.undefined)
    
    @scala.inline
    def setDeviceSettingsEnabled(value: Boolean): Self = StObject.set(x, "deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSettingsEnabledUndefined: Self = StObject.set(x, "deviceSettingsEnabled", js.undefined)
    
    @scala.inline
    def setDisplayInfoEnabled(value: Boolean): Self = StObject.set(x, "displayInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfoEnabledUndefined: Self = StObject.set(x, "displayInfoEnabled", js.undefined)
    
    @scala.inline
    def setHardwareStatusEnabled(value: Boolean): Self = StObject.set(x, "hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareStatusEnabledUndefined: Self = StObject.set(x, "hardwareStatusEnabled", js.undefined)
    
    @scala.inline
    def setMemoryInfoEnabled(value: Boolean): Self = StObject.set(x, "memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoEnabledUndefined: Self = StObject.set(x, "memoryInfoEnabled", js.undefined)
    
    @scala.inline
    def setNetworkInfoEnabled(value: Boolean): Self = StObject.set(x, "networkInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInfoEnabledUndefined: Self = StObject.set(x, "networkInfoEnabled", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsEnabled(value: Boolean): Self = StObject.set(x, "powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerManagementEventsEnabledUndefined: Self = StObject.set(x, "powerManagementEventsEnabled", js.undefined)
    
    @scala.inline
    def setSoftwareInfoEnabled(value: Boolean): Self = StObject.set(x, "softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareInfoEnabledUndefined: Self = StObject.set(x, "softwareInfoEnabled", js.undefined)
  }
}
