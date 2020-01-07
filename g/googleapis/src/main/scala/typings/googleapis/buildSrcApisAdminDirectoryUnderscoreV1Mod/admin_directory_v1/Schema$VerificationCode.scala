package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for verification codes in Directory API.
  */
@js.native
trait Schema$VerificationCode extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the resource. This is always
    * admin#directory#verificationCode.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The obfuscated unique ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
  /**
    * A current verification code for the user. Invalidated or used
    * verification codes are not returned as part of the result.
    */
  var verificationCode: js.UndefOr[String] = js.native
}

object Schema$VerificationCode {
  @scala.inline
  def apply(etag: String = null, kind: String = null, userId: String = null, verificationCode: String = null): Schema$VerificationCode = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (verificationCode != null) __obj.updateDynamic("verificationCode")(verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VerificationCode]
  }
}

