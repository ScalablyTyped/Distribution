package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an APK available for this application that is hosted externally and
  * not uploaded to Google Play. This function is only available to enterprises
  * who are using Google Play for Work, and whos application is restricted to
  * the enterprise private channel
  */
@js.native
trait SchemaExternallyHostedApk extends js.Object {
  
  /**
    * The application label.
    */
  var applicationLabel: js.UndefOr[String] = js.native
  
  /**
    * A certificate (or array of certificates if a certificate-chain is used)
    * used to signed this APK, represented as a base64 encoded byte array.
    */
  var certificateBase64s: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The URL at which the APK is hosted. This must be an https URL.
    */
  var externallyHostedUrl: js.UndefOr[String] = js.native
  
  /**
    * The SHA1 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha1Base64: js.UndefOr[String] = js.native
  
  /**
    * The SHA256 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha256Base64: js.UndefOr[String] = js.native
  
  /**
    * The file size in bytes of this APK.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * The icon image from the APK, as a base64 encoded byte array.
    */
  var iconBase64: js.UndefOr[String] = js.native
  
  /**
    * The maximum SDK supported by this APK (optional).
    */
  var maximumSdk: js.UndefOr[Double] = js.native
  
  /**
    * The minimum SDK targeted by this APK.
    */
  var minimumSdk: js.UndefOr[Double] = js.native
  
  /**
    * The native code environments supported by this APK (optional).
    */
  var nativeCodes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The package name.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * The features required by this APK (optional).
    */
  var usesFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The permissions requested by this APK.
    */
  var usesPermissions: js.UndefOr[js.Array[SchemaExternallyHostedApkUsesPermission]] = js.native
  
  /**
    * The version code of this APK.
    */
  var versionCode: js.UndefOr[Double] = js.native
  
  /**
    * The version name of this APK.
    */
  var versionName: js.UndefOr[String] = js.native
}
object SchemaExternallyHostedApk {
  
  @scala.inline
  def apply(): SchemaExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternallyHostedApk]
  }
  
  @scala.inline
  implicit class SchemaExternallyHostedApkOps[Self <: SchemaExternallyHostedApk] (val x: Self) extends AnyVal {
    
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
    def setApplicationLabel(value: String): Self = this.set("applicationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationLabel: Self = this.set("applicationLabel", js.undefined)
    
    @scala.inline
    def setCertificateBase64sVarargs(value: String*): Self = this.set("certificateBase64s", js.Array(value :_*))
    
    @scala.inline
    def setCertificateBase64s(value: js.Array[String]): Self = this.set("certificateBase64s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateBase64s: Self = this.set("certificateBase64s", js.undefined)
    
    @scala.inline
    def setExternallyHostedUrl(value: String): Self = this.set("externallyHostedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternallyHostedUrl: Self = this.set("externallyHostedUrl", js.undefined)
    
    @scala.inline
    def setFileSha1Base64(value: String): Self = this.set("fileSha1Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSha1Base64: Self = this.set("fileSha1Base64", js.undefined)
    
    @scala.inline
    def setFileSha256Base64(value: String): Self = this.set("fileSha256Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSha256Base64: Self = this.set("fileSha256Base64", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setIconBase64(value: String): Self = this.set("iconBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconBase64: Self = this.set("iconBase64", js.undefined)
    
    @scala.inline
    def setMaximumSdk(value: Double): Self = this.set("maximumSdk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumSdk: Self = this.set("maximumSdk", js.undefined)
    
    @scala.inline
    def setMinimumSdk(value: Double): Self = this.set("minimumSdk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSdk: Self = this.set("minimumSdk", js.undefined)
    
    @scala.inline
    def setNativeCodesVarargs(value: String*): Self = this.set("nativeCodes", js.Array(value :_*))
    
    @scala.inline
    def setNativeCodes(value: js.Array[String]): Self = this.set("nativeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeCodes: Self = this.set("nativeCodes", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setUsesFeaturesVarargs(value: String*): Self = this.set("usesFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUsesFeatures(value: js.Array[String]): Self = this.set("usesFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesFeatures: Self = this.set("usesFeatures", js.undefined)
    
    @scala.inline
    def setUsesPermissionsVarargs(value: SchemaExternallyHostedApkUsesPermission*): Self = this.set("usesPermissions", js.Array(value :_*))
    
    @scala.inline
    def setUsesPermissions(value: js.Array[SchemaExternallyHostedApkUsesPermission]): Self = this.set("usesPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesPermissions: Self = this.set("usesPermissions", js.undefined)
    
    @scala.inline
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
}
