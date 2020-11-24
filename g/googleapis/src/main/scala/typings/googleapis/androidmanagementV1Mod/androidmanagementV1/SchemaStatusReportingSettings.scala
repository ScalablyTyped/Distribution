package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings controlling the behavior of status reports.
  */
@js.native
trait SchemaStatusReportingSettings extends js.Object {
  
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
  implicit class SchemaStatusReportingSettingsOps[Self <: SchemaStatusReportingSettings] (val x: Self) extends AnyVal {
    
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
    def setApplicationReportsEnabled(value: Boolean): Self = this.set("applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationReportsEnabled: Self = this.set("applicationReportsEnabled", js.undefined)
    
    @scala.inline
    def setDeviceSettingsEnabled(value: Boolean): Self = this.set("deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettingsEnabled: Self = this.set("deviceSettingsEnabled", js.undefined)
    
    @scala.inline
    def setDisplayInfoEnabled(value: Boolean): Self = this.set("displayInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInfoEnabled: Self = this.set("displayInfoEnabled", js.undefined)
    
    @scala.inline
    def setHardwareStatusEnabled(value: Boolean): Self = this.set("hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareStatusEnabled: Self = this.set("hardwareStatusEnabled", js.undefined)
    
    @scala.inline
    def setMemoryInfoEnabled(value: Boolean): Self = this.set("memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfoEnabled: Self = this.set("memoryInfoEnabled", js.undefined)
    
    @scala.inline
    def setNetworkInfoEnabled(value: Boolean): Self = this.set("networkInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInfoEnabled: Self = this.set("networkInfoEnabled", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsEnabled(value: Boolean): Self = this.set("powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerManagementEventsEnabled: Self = this.set("powerManagementEventsEnabled", js.undefined)
    
    @scala.inline
    def setSoftwareInfoEnabled(value: Boolean): Self = this.set("softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareInfoEnabled: Self = this.set("softwareInfoEnabled", js.undefined)
  }
}
