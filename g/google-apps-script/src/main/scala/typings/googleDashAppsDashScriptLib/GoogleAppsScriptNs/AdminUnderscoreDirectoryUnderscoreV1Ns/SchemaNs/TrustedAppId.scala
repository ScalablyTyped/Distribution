package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAppId extends js.Object {
  var androidPackageName: js.UndefOr[java.lang.String] = js.undefined
  var certificateHashSHA1: js.UndefOr[java.lang.String] = js.undefined
  var certificateHashSHA256: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TrustedAppId {
  @scala.inline
  def apply(
    androidPackageName: java.lang.String = null,
    certificateHashSHA1: java.lang.String = null,
    certificateHashSHA256: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null
  ): TrustedAppId = {
    val __obj = js.Dynamic.literal()
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName)
    if (certificateHashSHA1 != null) __obj.updateDynamic("certificateHashSHA1")(certificateHashSHA1)
    if (certificateHashSHA256 != null) __obj.updateDynamic("certificateHashSHA256")(certificateHashSHA256)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TrustedAppId]
  }
}

