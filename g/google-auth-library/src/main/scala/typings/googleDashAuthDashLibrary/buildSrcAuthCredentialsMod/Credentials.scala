package typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var access_token: js.UndefOr[String | Null] = js.undefined
  var expiry_date: js.UndefOr[Double | Null] = js.undefined
  var id_token: js.UndefOr[String | Null] = js.undefined
  var refresh_token: js.UndefOr[String | Null] = js.undefined
  var token_type: js.UndefOr[String | Null] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    access_token: String = null,
    expiry_date: Int | Double = null,
    id_token: String = null,
    refresh_token: String = null,
    token_type: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (expiry_date != null) __obj.updateDynamic("expiry_date")(expiry_date.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

