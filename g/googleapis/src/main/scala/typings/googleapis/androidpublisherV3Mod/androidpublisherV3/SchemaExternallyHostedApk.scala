package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternallyHostedApk extends StObject {
  
  /**
    * The application label.
    */
  var applicationLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A certificate (or array of certificates if a certificate-chain is used) used to sign this APK, represented as a base64 encoded byte array.
    */
  var certificateBase64s: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URL at which the APK is hosted. This must be an https URL.
    */
  var externallyHostedUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sha1 checksum of this APK, represented as a base64 encoded byte array.
    */
  var fileSha1Base64: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sha256 checksum of this APK, represented as a base64 encoded byte array.
    */
  var fileSha256Base64: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file size in bytes of this APK.
    */
  var fileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The icon image from the APK, as a base64 encoded byte array.
    */
  var iconBase64: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum SDK supported by this APK (optional).
    */
  var maximumSdk: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum SDK targeted by this APK.
    */
  var minimumSdk: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The native code environments supported by this APK (optional).
    */
  var nativeCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The package name.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The features required by this APK (optional).
    */
  var usesFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The permissions requested by this APK.
    */
  var usesPermissions: js.UndefOr[js.Array[SchemaUsesPermission]] = js.undefined
  
  /**
    * The version code of this APK.
    */
  var versionCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The version name of this APK.
    */
  var versionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternallyHostedApk {
  
  inline def apply(): SchemaExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternallyHostedApk]
  }
  
  extension [Self <: SchemaExternallyHostedApk](x: Self) {
    
    inline def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    inline def setApplicationLabelNull: Self = StObject.set(x, "applicationLabel", null)
    
    inline def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    inline def setCertificateBase64s(value: js.Array[String]): Self = StObject.set(x, "certificateBase64s", value.asInstanceOf[js.Any])
    
    inline def setCertificateBase64sNull: Self = StObject.set(x, "certificateBase64s", null)
    
    inline def setCertificateBase64sUndefined: Self = StObject.set(x, "certificateBase64s", js.undefined)
    
    inline def setCertificateBase64sVarargs(value: String*): Self = StObject.set(x, "certificateBase64s", js.Array(value*))
    
    inline def setExternallyHostedUrl(value: String): Self = StObject.set(x, "externallyHostedUrl", value.asInstanceOf[js.Any])
    
    inline def setExternallyHostedUrlNull: Self = StObject.set(x, "externallyHostedUrl", null)
    
    inline def setExternallyHostedUrlUndefined: Self = StObject.set(x, "externallyHostedUrl", js.undefined)
    
    inline def setFileSha1Base64(value: String): Self = StObject.set(x, "fileSha1Base64", value.asInstanceOf[js.Any])
    
    inline def setFileSha1Base64Null: Self = StObject.set(x, "fileSha1Base64", null)
    
    inline def setFileSha1Base64Undefined: Self = StObject.set(x, "fileSha1Base64", js.undefined)
    
    inline def setFileSha256Base64(value: String): Self = StObject.set(x, "fileSha256Base64", value.asInstanceOf[js.Any])
    
    inline def setFileSha256Base64Null: Self = StObject.set(x, "fileSha256Base64", null)
    
    inline def setFileSha256Base64Undefined: Self = StObject.set(x, "fileSha256Base64", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setIconBase64(value: String): Self = StObject.set(x, "iconBase64", value.asInstanceOf[js.Any])
    
    inline def setIconBase64Null: Self = StObject.set(x, "iconBase64", null)
    
    inline def setIconBase64Undefined: Self = StObject.set(x, "iconBase64", js.undefined)
    
    inline def setMaximumSdk(value: Double): Self = StObject.set(x, "maximumSdk", value.asInstanceOf[js.Any])
    
    inline def setMaximumSdkNull: Self = StObject.set(x, "maximumSdk", null)
    
    inline def setMaximumSdkUndefined: Self = StObject.set(x, "maximumSdk", js.undefined)
    
    inline def setMinimumSdk(value: Double): Self = StObject.set(x, "minimumSdk", value.asInstanceOf[js.Any])
    
    inline def setMinimumSdkNull: Self = StObject.set(x, "minimumSdk", null)
    
    inline def setMinimumSdkUndefined: Self = StObject.set(x, "minimumSdk", js.undefined)
    
    inline def setNativeCodes(value: js.Array[String]): Self = StObject.set(x, "nativeCodes", value.asInstanceOf[js.Any])
    
    inline def setNativeCodesNull: Self = StObject.set(x, "nativeCodes", null)
    
    inline def setNativeCodesUndefined: Self = StObject.set(x, "nativeCodes", js.undefined)
    
    inline def setNativeCodesVarargs(value: String*): Self = StObject.set(x, "nativeCodes", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setUsesFeatures(value: js.Array[String]): Self = StObject.set(x, "usesFeatures", value.asInstanceOf[js.Any])
    
    inline def setUsesFeaturesNull: Self = StObject.set(x, "usesFeatures", null)
    
    inline def setUsesFeaturesUndefined: Self = StObject.set(x, "usesFeatures", js.undefined)
    
    inline def setUsesFeaturesVarargs(value: String*): Self = StObject.set(x, "usesFeatures", js.Array(value*))
    
    inline def setUsesPermissions(value: js.Array[SchemaUsesPermission]): Self = StObject.set(x, "usesPermissions", value.asInstanceOf[js.Any])
    
    inline def setUsesPermissionsUndefined: Self = StObject.set(x, "usesPermissions", js.undefined)
    
    inline def setUsesPermissionsVarargs(value: SchemaUsesPermission*): Self = StObject.set(x, "usesPermissions", js.Array(value*))
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
