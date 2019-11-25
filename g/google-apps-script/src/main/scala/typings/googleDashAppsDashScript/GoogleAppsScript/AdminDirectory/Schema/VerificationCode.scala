package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCode extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
  var verificationCode: js.UndefOr[String] = js.undefined
}

object VerificationCode {
  @scala.inline
  def apply(etag: String = null, kind: String = null, userId: String = null, verificationCode: String = null): VerificationCode = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (verificationCode != null) __obj.updateDynamic("verificationCode")(verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationCode]
  }
}

