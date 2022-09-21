package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1TelemetryDevice extends StObject {
  
  /**
    * Output only. Audio reports collected periodically sorted in a decreasing order of report_time.
    */
  var audioStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1AudioStatusReport]] = js.undefined
  
  /**
    * Output only. Information on battery specs for the device.
    */
  var batteryInfo: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1BatteryInfo]] = js.undefined
  
  /**
    * Output only. Battery reports collected periodically.
    */
  var batteryStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1BatteryStatusReport]] = js.undefined
  
  /**
    * Output only. Information regarding CPU specs for the device.
    */
  var cpuInfo: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1CpuInfo]] = js.undefined
  
  /**
    * Output only. CPU status reports collected periodically sorted in a decreasing order of report_time.
    */
  var cpuStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1CpuStatusReport]] = js.undefined
  
  /**
    * Output only. Google Workspace Customer whose enterprise enrolled the device.
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique Directory API ID of the device. This value is the same as the Admin Console's Directory API ID in the ChromeOS Devices tab
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Contains information regarding Graphic peripherals for the device.
    */
  var graphicsInfo: js.UndefOr[SchemaGoogleChromeManagementV1GraphicsInfo] = js.undefined
  
  /**
    * Output only. Graphics reports collected periodically.
    */
  var graphicsStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1GraphicsStatusReport]] = js.undefined
  
  /**
    * Output only. Information regarding memory specs for the device.
    */
  var memoryInfo: js.UndefOr[SchemaGoogleChromeManagementV1MemoryInfo] = js.undefined
  
  /**
    * Output only. Memory status reports collected periodically sorted decreasing by report_time.
    */
  var memoryStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1MemoryStatusReport]] = js.undefined
  
  /**
    * Output only. Resource name of the device.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Network diagnostics collected periodically.
    */
  var networkDiagnosticsReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1NetworkDiagnosticsReport]] = js.undefined
  
  /**
    * Output only. Network devices information.
    */
  var networkInfo: js.UndefOr[SchemaGoogleChromeManagementV1NetworkInfo] = js.undefined
  
  /**
    * Output only. Network specs collected periodically.
    */
  var networkStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1NetworkStatusReport]] = js.undefined
  
  /**
    * Output only. Organization unit ID of the device.
    */
  var orgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Contains relevant information regarding ChromeOS update status.
    */
  var osUpdateStatus: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1OsUpdateStatus]] = js.undefined
  
  /**
    * Output only. Device serial number. This value is the same as the Admin Console's Serial Number in the ChromeOS Devices tab.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Information of storage specs for the device.
    */
  var storageInfo: js.UndefOr[SchemaGoogleChromeManagementV1StorageInfo] = js.undefined
  
  /**
    * Output only. Storage reports collected periodically.
    */
  var storageStatusReport: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1StorageStatusReport]] = js.undefined
  
  /**
    * Output only. Information on Thunderbolt bus.
    */
  var thunderboltInfo: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1ThunderboltInfo]] = js.undefined
}
object SchemaGoogleChromeManagementV1TelemetryDevice {
  
  inline def apply(): SchemaGoogleChromeManagementV1TelemetryDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1TelemetryDevice]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1TelemetryDevice](x: Self) {
    
    inline def setAudioStatusReport(value: js.Array[SchemaGoogleChromeManagementV1AudioStatusReport]): Self = StObject.set(x, "audioStatusReport", value.asInstanceOf[js.Any])
    
    inline def setAudioStatusReportUndefined: Self = StObject.set(x, "audioStatusReport", js.undefined)
    
    inline def setAudioStatusReportVarargs(value: SchemaGoogleChromeManagementV1AudioStatusReport*): Self = StObject.set(x, "audioStatusReport", js.Array(value*))
    
    inline def setBatteryInfo(value: js.Array[SchemaGoogleChromeManagementV1BatteryInfo]): Self = StObject.set(x, "batteryInfo", value.asInstanceOf[js.Any])
    
    inline def setBatteryInfoUndefined: Self = StObject.set(x, "batteryInfo", js.undefined)
    
    inline def setBatteryInfoVarargs(value: SchemaGoogleChromeManagementV1BatteryInfo*): Self = StObject.set(x, "batteryInfo", js.Array(value*))
    
    inline def setBatteryStatusReport(value: js.Array[SchemaGoogleChromeManagementV1BatteryStatusReport]): Self = StObject.set(x, "batteryStatusReport", value.asInstanceOf[js.Any])
    
    inline def setBatteryStatusReportUndefined: Self = StObject.set(x, "batteryStatusReport", js.undefined)
    
    inline def setBatteryStatusReportVarargs(value: SchemaGoogleChromeManagementV1BatteryStatusReport*): Self = StObject.set(x, "batteryStatusReport", js.Array(value*))
    
    inline def setCpuInfo(value: js.Array[SchemaGoogleChromeManagementV1CpuInfo]): Self = StObject.set(x, "cpuInfo", value.asInstanceOf[js.Any])
    
    inline def setCpuInfoUndefined: Self = StObject.set(x, "cpuInfo", js.undefined)
    
    inline def setCpuInfoVarargs(value: SchemaGoogleChromeManagementV1CpuInfo*): Self = StObject.set(x, "cpuInfo", js.Array(value*))
    
    inline def setCpuStatusReport(value: js.Array[SchemaGoogleChromeManagementV1CpuStatusReport]): Self = StObject.set(x, "cpuStatusReport", value.asInstanceOf[js.Any])
    
    inline def setCpuStatusReportUndefined: Self = StObject.set(x, "cpuStatusReport", js.undefined)
    
    inline def setCpuStatusReportVarargs(value: SchemaGoogleChromeManagementV1CpuStatusReport*): Self = StObject.set(x, "cpuStatusReport", js.Array(value*))
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setGraphicsInfo(value: SchemaGoogleChromeManagementV1GraphicsInfo): Self = StObject.set(x, "graphicsInfo", value.asInstanceOf[js.Any])
    
    inline def setGraphicsInfoUndefined: Self = StObject.set(x, "graphicsInfo", js.undefined)
    
    inline def setGraphicsStatusReport(value: js.Array[SchemaGoogleChromeManagementV1GraphicsStatusReport]): Self = StObject.set(x, "graphicsStatusReport", value.asInstanceOf[js.Any])
    
    inline def setGraphicsStatusReportUndefined: Self = StObject.set(x, "graphicsStatusReport", js.undefined)
    
    inline def setGraphicsStatusReportVarargs(value: SchemaGoogleChromeManagementV1GraphicsStatusReport*): Self = StObject.set(x, "graphicsStatusReport", js.Array(value*))
    
    inline def setMemoryInfo(value: SchemaGoogleChromeManagementV1MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    inline def setMemoryStatusReport(value: js.Array[SchemaGoogleChromeManagementV1MemoryStatusReport]): Self = StObject.set(x, "memoryStatusReport", value.asInstanceOf[js.Any])
    
    inline def setMemoryStatusReportUndefined: Self = StObject.set(x, "memoryStatusReport", js.undefined)
    
    inline def setMemoryStatusReportVarargs(value: SchemaGoogleChromeManagementV1MemoryStatusReport*): Self = StObject.set(x, "memoryStatusReport", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkDiagnosticsReport(value: js.Array[SchemaGoogleChromeManagementV1NetworkDiagnosticsReport]): Self = StObject.set(x, "networkDiagnosticsReport", value.asInstanceOf[js.Any])
    
    inline def setNetworkDiagnosticsReportUndefined: Self = StObject.set(x, "networkDiagnosticsReport", js.undefined)
    
    inline def setNetworkDiagnosticsReportVarargs(value: SchemaGoogleChromeManagementV1NetworkDiagnosticsReport*): Self = StObject.set(x, "networkDiagnosticsReport", js.Array(value*))
    
    inline def setNetworkInfo(value: SchemaGoogleChromeManagementV1NetworkInfo): Self = StObject.set(x, "networkInfo", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoUndefined: Self = StObject.set(x, "networkInfo", js.undefined)
    
    inline def setNetworkStatusReport(value: js.Array[SchemaGoogleChromeManagementV1NetworkStatusReport]): Self = StObject.set(x, "networkStatusReport", value.asInstanceOf[js.Any])
    
    inline def setNetworkStatusReportUndefined: Self = StObject.set(x, "networkStatusReport", js.undefined)
    
    inline def setNetworkStatusReportVarargs(value: SchemaGoogleChromeManagementV1NetworkStatusReport*): Self = StObject.set(x, "networkStatusReport", js.Array(value*))
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdNull: Self = StObject.set(x, "orgUnitId", null)
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setOsUpdateStatus(value: js.Array[SchemaGoogleChromeManagementV1OsUpdateStatus]): Self = StObject.set(x, "osUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setOsUpdateStatusUndefined: Self = StObject.set(x, "osUpdateStatus", js.undefined)
    
    inline def setOsUpdateStatusVarargs(value: SchemaGoogleChromeManagementV1OsUpdateStatus*): Self = StObject.set(x, "osUpdateStatus", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStorageInfo(value: SchemaGoogleChromeManagementV1StorageInfo): Self = StObject.set(x, "storageInfo", value.asInstanceOf[js.Any])
    
    inline def setStorageInfoUndefined: Self = StObject.set(x, "storageInfo", js.undefined)
    
    inline def setStorageStatusReport(value: js.Array[SchemaGoogleChromeManagementV1StorageStatusReport]): Self = StObject.set(x, "storageStatusReport", value.asInstanceOf[js.Any])
    
    inline def setStorageStatusReportUndefined: Self = StObject.set(x, "storageStatusReport", js.undefined)
    
    inline def setStorageStatusReportVarargs(value: SchemaGoogleChromeManagementV1StorageStatusReport*): Self = StObject.set(x, "storageStatusReport", js.Array(value*))
    
    inline def setThunderboltInfo(value: js.Array[SchemaGoogleChromeManagementV1ThunderboltInfo]): Self = StObject.set(x, "thunderboltInfo", value.asInstanceOf[js.Any])
    
    inline def setThunderboltInfoUndefined: Self = StObject.set(x, "thunderboltInfo", js.undefined)
    
    inline def setThunderboltInfoVarargs(value: SchemaGoogleChromeManagementV1ThunderboltInfo*): Self = StObject.set(x, "thunderboltInfo", js.Array(value*))
  }
}
