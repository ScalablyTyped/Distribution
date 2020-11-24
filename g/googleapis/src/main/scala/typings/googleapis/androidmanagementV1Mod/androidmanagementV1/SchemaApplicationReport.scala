package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information reported about an installed app.
  */
@js.native
trait SchemaApplicationReport extends js.Object {
  
  /**
    * The source of the package.
    */
  var applicationSource: js.UndefOr[String] = js.native
  
  /**
    * The display name of the app.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * List of app events. The most recent 20 events are stored in the list.
    */
  var events: js.UndefOr[js.Array[SchemaApplicationEvent]] = js.native
  
  /**
    * The package name of the app that installed this app.
    */
  var installerPackageName: js.UndefOr[String] = js.native
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * The SHA-256 hash of the app&#39;s APK file, which can be used to verify
    * the app hasn&#39;t been modified. Each byte of the hash value is
    * represented as a two-digit hexadecimal number.
    */
  var packageSha256Hash: js.UndefOr[String] = js.native
  
  /**
    * The SHA-1 hash of each android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the app package. Each byte of each hash value is
    * represented as a two-digit hexadecimal number.
    */
  var signingKeyCertFingerprints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Application state.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The app version code, which can be used to determine whether one version
    * is more recent than another.
    */
  var versionCode: js.UndefOr[Double] = js.native
  
  /**
    * The app version as displayed to the user.
    */
  var versionName: js.UndefOr[String] = js.native
}
object SchemaApplicationReport {
  
  @scala.inline
  def apply(): SchemaApplicationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReport]
  }
  
  @scala.inline
  implicit class SchemaApplicationReportOps[Self <: SchemaApplicationReport] (val x: Self) extends AnyVal {
    
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
    def setApplicationSource(value: String): Self = this.set("applicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationSource: Self = this.set("applicationSource", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaApplicationEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[SchemaApplicationEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setInstallerPackageName(value: String): Self = this.set("installerPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerPackageName: Self = this.set("installerPackageName", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPackageSha256Hash(value: String): Self = this.set("packageSha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageSha256Hash: Self = this.set("packageSha256Hash", js.undefined)
    
    @scala.inline
    def setSigningKeyCertFingerprintsVarargs(value: String*): Self = this.set("signingKeyCertFingerprints", js.Array(value :_*))
    
    @scala.inline
    def setSigningKeyCertFingerprints(value: js.Array[String]): Self = this.set("signingKeyCertFingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningKeyCertFingerprints: Self = this.set("signingKeyCertFingerprints", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
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
