package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCode extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
  var verificationCode: js.UndefOr[java.lang.String] = js.undefined
}

object VerificationCode {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    userId: java.lang.String = null,
    verificationCode: java.lang.String = null
  ): VerificationCode = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (verificationCode != null) __obj.updateDynamic("verificationCode")(verificationCode)
    __obj.asInstanceOf[VerificationCode]
  }
}

