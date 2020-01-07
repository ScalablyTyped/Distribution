package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List verification codes operation in Directory
  * API.
  */
@js.native
trait Schema$VerificationCodes extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of verification code resources.
    */
  var items: js.UndefOr[js.Array[Schema$VerificationCode]] = js.native
  /**
    * The type of the resource. This is always
    * admin#directory#verificationCodesList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$VerificationCodes {
  @scala.inline
  def apply(etag: String = null, items: js.Array[Schema$VerificationCode] = null, kind: String = null): Schema$VerificationCodes = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VerificationCodes]
  }
}

