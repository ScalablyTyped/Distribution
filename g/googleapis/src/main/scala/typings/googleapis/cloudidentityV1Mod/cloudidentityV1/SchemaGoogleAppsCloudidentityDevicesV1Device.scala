package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1Device extends StObject {
  
  /**
    * Output only. Attributes specific to Android devices.
    */
  var androidSpecificAttributes: js.UndefOr[SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes] = js.undefined
  
  /**
    * Asset tag of the device.
    */
  var assetTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Baseband version of the device.
    */
  var basebandVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Device bootloader version. Example: 0.6.7.
    */
  var bootloaderVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Device brand. Example: Samsung.
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Build number of the device.
    */
  var buildNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Represents whether the Device is compromised.
    */
  var compromisedState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the Company-Owned device was imported. This field is empty for BYOD devices.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of device.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether developer options is enabled on device.
    */
  var enabledDeveloperOptions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether USB debugging is enabled on device.
    */
  var enabledUsbDebugging: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Device encryption state.
    */
  var encryptionState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. IMEI number of device if GSM device; empty otherwise.
    */
  var imei: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Kernel version of the device.
    */
  var kernelVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Most recent time when device synced with this service.
    */
  var lastSyncTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Management state of the device
    */
  var managementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Device manufacturer. Example: Motorola.
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. MEID number of device if CDMA device; empty otherwise.
    */
  var meid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Model name of device. Example: Pixel 3.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}`, where device is the unique id assigned to the Device.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Mobile or network operator of device, if available.
    */
  var networkOperator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. OS version of the device. Example: Android 8.1.0.
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Domain name for Google accounts on device. Type for other accounts on device. On Android, will only be populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the account signed in to the device policy app if that account's domain has only one account. Examples: "com.example", "xyz.com".
    */
  var otherAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Whether the device is owned by the company or an individual
    */
  var ownerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. OS release version. Example: 6.0.
    */
  var releaseVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. OS security patch update time on device.
    */
  var securityPatchTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serial Number of device. Example: HT82V1A01076.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * WiFi MAC addresses of device.
    */
  var wifiMacAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1Device {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1Device]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1Device](x: Self) {
    
    inline def setAndroidSpecificAttributes(value: SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes): Self = StObject.set(x, "androidSpecificAttributes", value.asInstanceOf[js.Any])
    
    inline def setAndroidSpecificAttributesUndefined: Self = StObject.set(x, "androidSpecificAttributes", js.undefined)
    
    inline def setAssetTag(value: String): Self = StObject.set(x, "assetTag", value.asInstanceOf[js.Any])
    
    inline def setAssetTagNull: Self = StObject.set(x, "assetTag", null)
    
    inline def setAssetTagUndefined: Self = StObject.set(x, "assetTag", js.undefined)
    
    inline def setBasebandVersion(value: String): Self = StObject.set(x, "basebandVersion", value.asInstanceOf[js.Any])
    
    inline def setBasebandVersionNull: Self = StObject.set(x, "basebandVersion", null)
    
    inline def setBasebandVersionUndefined: Self = StObject.set(x, "basebandVersion", js.undefined)
    
    inline def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    inline def setBootloaderVersionNull: Self = StObject.set(x, "bootloaderVersion", null)
    
    inline def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setCompromisedState(value: String): Self = StObject.set(x, "compromisedState", value.asInstanceOf[js.Any])
    
    inline def setCompromisedStateNull: Self = StObject.set(x, "compromisedState", null)
    
    inline def setCompromisedStateUndefined: Self = StObject.set(x, "compromisedState", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setEnabledDeveloperOptions(value: Boolean): Self = StObject.set(x, "enabledDeveloperOptions", value.asInstanceOf[js.Any])
    
    inline def setEnabledDeveloperOptionsNull: Self = StObject.set(x, "enabledDeveloperOptions", null)
    
    inline def setEnabledDeveloperOptionsUndefined: Self = StObject.set(x, "enabledDeveloperOptions", js.undefined)
    
    inline def setEnabledUsbDebugging(value: Boolean): Self = StObject.set(x, "enabledUsbDebugging", value.asInstanceOf[js.Any])
    
    inline def setEnabledUsbDebuggingNull: Self = StObject.set(x, "enabledUsbDebugging", null)
    
    inline def setEnabledUsbDebuggingUndefined: Self = StObject.set(x, "enabledUsbDebugging", js.undefined)
    
    inline def setEncryptionState(value: String): Self = StObject.set(x, "encryptionState", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStateNull: Self = StObject.set(x, "encryptionState", null)
    
    inline def setEncryptionStateUndefined: Self = StObject.set(x, "encryptionState", js.undefined)
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiNull: Self = StObject.set(x, "imei", null)
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersionNull: Self = StObject.set(x, "kernelVersion", null)
    
    inline def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    inline def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeNull: Self = StObject.set(x, "lastSyncTime", null)
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
    
    inline def setManagementState(value: String): Self = StObject.set(x, "managementState", value.asInstanceOf[js.Any])
    
    inline def setManagementStateNull: Self = StObject.set(x, "managementState", null)
    
    inline def setManagementStateUndefined: Self = StObject.set(x, "managementState", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkOperator(value: String): Self = StObject.set(x, "networkOperator", value.asInstanceOf[js.Any])
    
    inline def setNetworkOperatorNull: Self = StObject.set(x, "networkOperator", null)
    
    inline def setNetworkOperatorUndefined: Self = StObject.set(x, "networkOperator", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOtherAccounts(value: js.Array[String]): Self = StObject.set(x, "otherAccounts", value.asInstanceOf[js.Any])
    
    inline def setOtherAccountsNull: Self = StObject.set(x, "otherAccounts", null)
    
    inline def setOtherAccountsUndefined: Self = StObject.set(x, "otherAccounts", js.undefined)
    
    inline def setOtherAccountsVarargs(value: String*): Self = StObject.set(x, "otherAccounts", js.Array(value*))
    
    inline def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypeNull: Self = StObject.set(x, "ownerType", null)
    
    inline def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionNull: Self = StObject.set(x, "releaseVersion", null)
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setSecurityPatchTime(value: String): Self = StObject.set(x, "securityPatchTime", value.asInstanceOf[js.Any])
    
    inline def setSecurityPatchTimeNull: Self = StObject.set(x, "securityPatchTime", null)
    
    inline def setSecurityPatchTimeUndefined: Self = StObject.set(x, "securityPatchTime", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setWifiMacAddresses(value: js.Array[String]): Self = StObject.set(x, "wifiMacAddresses", value.asInstanceOf[js.Any])
    
    inline def setWifiMacAddressesNull: Self = StObject.set(x, "wifiMacAddresses", null)
    
    inline def setWifiMacAddressesUndefined: Self = StObject.set(x, "wifiMacAddresses", js.undefined)
    
    inline def setWifiMacAddressesVarargs(value: String*): Self = StObject.set(x, "wifiMacAddresses", js.Array(value*))
  }
}
