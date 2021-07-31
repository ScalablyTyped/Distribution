package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information reported about an installed app.
  */
trait SchemaApplicationReport extends StObject {
  
  /**
    * The source of the package.
    */
  var applicationSource: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the app.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * List of app events. The most recent 20 events are stored in the list.
    */
  var events: js.UndefOr[js.Array[SchemaApplicationEvent]] = js.undefined
  
  /**
    * The package name of the app that installed this app.
    */
  var installerPackageName: js.UndefOr[String] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-256 hash of the app&#39;s APK file, which can be used to verify
    * the app hasn&#39;t been modified. Each byte of the hash value is
    * represented as a two-digit hexadecimal number.
    */
  var packageSha256Hash: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-1 hash of each android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the app package. Each byte of each hash value is
    * represented as a two-digit hexadecimal number.
    */
  var signingKeyCertFingerprints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Application state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The app version code, which can be used to determine whether one version
    * is more recent than another.
    */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The app version as displayed to the user.
    */
  var versionName: js.UndefOr[String] = js.undefined
}
object SchemaApplicationReport {
  
  @scala.inline
  def apply(): SchemaApplicationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReport]
  }
  
  @scala.inline
  implicit class SchemaApplicationReportMutableBuilder[Self <: SchemaApplicationReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSource(value: String): Self = StObject.set(x, "applicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSourceUndefined: Self = StObject.set(x, "applicationSource", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaApplicationEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaApplicationEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setInstallerPackageName(value: String): Self = StObject.set(x, "installerPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallerPackageNameUndefined: Self = StObject.set(x, "installerPackageName", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setPackageSha256Hash(value: String): Self = StObject.set(x, "packageSha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSha256HashUndefined: Self = StObject.set(x, "packageSha256Hash", js.undefined)
    
    @scala.inline
    def setSigningKeyCertFingerprints(value: js.Array[String]): Self = StObject.set(x, "signingKeyCertFingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyCertFingerprintsUndefined: Self = StObject.set(x, "signingKeyCertFingerprints", js.undefined)
    
    @scala.inline
    def setSigningKeyCertFingerprintsVarargs(value: String*): Self = StObject.set(x, "signingKeyCertFingerprints", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
