package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information reported about an installed app.
  */
@js.native
trait Schema$ApplicationReport extends js.Object {
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
  var events: js.UndefOr[js.Array[Schema$ApplicationEvent]] = js.native
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

object Schema$ApplicationReport {
  @scala.inline
  def apply(
    applicationSource: String = null,
    displayName: String = null,
    events: js.Array[Schema$ApplicationEvent] = null,
    installerPackageName: String = null,
    packageName: String = null,
    packageSha256Hash: String = null,
    signingKeyCertFingerprints: js.Array[String] = null,
    state: String = null,
    versionCode: Int | Double = null,
    versionName: String = null
  ): Schema$ApplicationReport = {
    val __obj = js.Dynamic.literal()
    if (applicationSource != null) __obj.updateDynamic("applicationSource")(applicationSource.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (installerPackageName != null) __obj.updateDynamic("installerPackageName")(installerPackageName.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (packageSha256Hash != null) __obj.updateDynamic("packageSha256Hash")(packageSha256Hash.asInstanceOf[js.Any])
    if (signingKeyCertFingerprints != null) __obj.updateDynamic("signingKeyCertFingerprints")(signingKeyCertFingerprints.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationReport]
  }
}

