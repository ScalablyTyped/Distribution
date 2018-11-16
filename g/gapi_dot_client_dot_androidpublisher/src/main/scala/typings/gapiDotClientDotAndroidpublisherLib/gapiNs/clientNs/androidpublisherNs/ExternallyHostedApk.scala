package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExternallyHostedApk extends js.Object {
  /** The application label. */
  var applicationLabel: js.UndefOr[java.lang.String] = js.undefined
  /** A certificate (or array of certificates if a certificate-chain is used) used to signed this APK, represented as a base64 encoded byte array. */
  var certificateBase64s: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URL at which the APK is hosted. This must be an https URL. */
  var externallyHostedUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The SHA1 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha1Base64: js.UndefOr[java.lang.String] = js.undefined
  /** The SHA256 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha256Base64: js.UndefOr[java.lang.String] = js.undefined
  /** The file size in bytes of this APK. */
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  /** The icon image from the APK, as a base64 encoded byte array. */
  var iconBase64: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum SDK supported by this APK (optional). */
  var maximumSdk: js.UndefOr[scala.Double] = js.undefined
  /** The minimum SDK targeted by this APK. */
  var minimumSdk: js.UndefOr[scala.Double] = js.undefined
  /** The native code environments supported by this APK (optional). */
  var nativeCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The package name. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** The features required by this APK (optional). */
  var usesFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The permissions requested by this APK. */
  var usesPermissions: js.UndefOr[js.Array[ExternallyHostedApkUsesPermission]] = js.undefined
  /** The version code of this APK. */
  var versionCode: js.UndefOr[scala.Double] = js.undefined
  /** The version name of this APK. */
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

