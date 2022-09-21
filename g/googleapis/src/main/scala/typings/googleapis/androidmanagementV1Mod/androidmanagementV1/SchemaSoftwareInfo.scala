package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareInfo extends StObject {
  
  /**
    * Android build ID string meant for displaying to the user. For example, shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys.
    */
  var androidBuildNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Build time.
    */
  var androidBuildTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Android Device Policy app version code.
    */
  var androidDevicePolicyVersionCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Android Device Policy app version as displayed to the user.
    */
  var androidDevicePolicyVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-visible Android version string. For example, 6.0.1.
    */
  var androidVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The system bootloader version number, e.g. 0.6.7.
    */
  var bootloaderVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SHA-256 hash of android.content.pm.Signature (https://developer.android.com/reference/android/content/pm/Signature.html) associated with the system package, which can be used to verify that the system build hasn't been modified.
    */
  var deviceBuildSignature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kernel version, for example, 2.6.32.9-g103d848.
    */
  var deviceKernelVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An IETF BCP 47 language code for the primary locale on the device.
    */
  var primaryLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Security patch level, e.g. 2016-05-01.
    */
  var securityPatchLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about a potential pending system update.
    */
  var systemUpdateInfo: js.UndefOr[SchemaSystemUpdateInfo] = js.undefined
}
object SchemaSoftwareInfo {
  
  inline def apply(): SchemaSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareInfo]
  }
  
  extension [Self <: SchemaSoftwareInfo](x: Self) {
    
    inline def setAndroidBuildNumber(value: String): Self = StObject.set(x, "androidBuildNumber", value.asInstanceOf[js.Any])
    
    inline def setAndroidBuildNumberNull: Self = StObject.set(x, "androidBuildNumber", null)
    
    inline def setAndroidBuildNumberUndefined: Self = StObject.set(x, "androidBuildNumber", js.undefined)
    
    inline def setAndroidBuildTime(value: String): Self = StObject.set(x, "androidBuildTime", value.asInstanceOf[js.Any])
    
    inline def setAndroidBuildTimeNull: Self = StObject.set(x, "androidBuildTime", null)
    
    inline def setAndroidBuildTimeUndefined: Self = StObject.set(x, "androidBuildTime", js.undefined)
    
    inline def setAndroidDevicePolicyVersionCode(value: Double): Self = StObject.set(x, "androidDevicePolicyVersionCode", value.asInstanceOf[js.Any])
    
    inline def setAndroidDevicePolicyVersionCodeNull: Self = StObject.set(x, "androidDevicePolicyVersionCode", null)
    
    inline def setAndroidDevicePolicyVersionCodeUndefined: Self = StObject.set(x, "androidDevicePolicyVersionCode", js.undefined)
    
    inline def setAndroidDevicePolicyVersionName(value: String): Self = StObject.set(x, "androidDevicePolicyVersionName", value.asInstanceOf[js.Any])
    
    inline def setAndroidDevicePolicyVersionNameNull: Self = StObject.set(x, "androidDevicePolicyVersionName", null)
    
    inline def setAndroidDevicePolicyVersionNameUndefined: Self = StObject.set(x, "androidDevicePolicyVersionName", js.undefined)
    
    inline def setAndroidVersion(value: String): Self = StObject.set(x, "androidVersion", value.asInstanceOf[js.Any])
    
    inline def setAndroidVersionNull: Self = StObject.set(x, "androidVersion", null)
    
    inline def setAndroidVersionUndefined: Self = StObject.set(x, "androidVersion", js.undefined)
    
    inline def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    inline def setBootloaderVersionNull: Self = StObject.set(x, "bootloaderVersion", null)
    
    inline def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    inline def setDeviceBuildSignature(value: String): Self = StObject.set(x, "deviceBuildSignature", value.asInstanceOf[js.Any])
    
    inline def setDeviceBuildSignatureNull: Self = StObject.set(x, "deviceBuildSignature", null)
    
    inline def setDeviceBuildSignatureUndefined: Self = StObject.set(x, "deviceBuildSignature", js.undefined)
    
    inline def setDeviceKernelVersion(value: String): Self = StObject.set(x, "deviceKernelVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceKernelVersionNull: Self = StObject.set(x, "deviceKernelVersion", null)
    
    inline def setDeviceKernelVersionUndefined: Self = StObject.set(x, "deviceKernelVersion", js.undefined)
    
    inline def setPrimaryLanguageCode(value: String): Self = StObject.set(x, "primaryLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLanguageCodeNull: Self = StObject.set(x, "primaryLanguageCode", null)
    
    inline def setPrimaryLanguageCodeUndefined: Self = StObject.set(x, "primaryLanguageCode", js.undefined)
    
    inline def setSecurityPatchLevel(value: String): Self = StObject.set(x, "securityPatchLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityPatchLevelNull: Self = StObject.set(x, "securityPatchLevel", null)
    
    inline def setSecurityPatchLevelUndefined: Self = StObject.set(x, "securityPatchLevel", js.undefined)
    
    inline def setSystemUpdateInfo(value: SchemaSystemUpdateInfo): Self = StObject.set(x, "systemUpdateInfo", value.asInstanceOf[js.Any])
    
    inline def setSystemUpdateInfoUndefined: Self = StObject.set(x, "systemUpdateInfo", js.undefined)
  }
}
