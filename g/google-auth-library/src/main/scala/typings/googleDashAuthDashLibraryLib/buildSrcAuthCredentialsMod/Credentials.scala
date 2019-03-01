package typings
package googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var access_token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var expiry_date: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var id_token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var refresh_token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var token_type: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    access_token: java.lang.String = null,
    expiry_date: scala.Int | scala.Double = null,
    id_token: java.lang.String = null,
    refresh_token: java.lang.String = null,
    token_type: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (expiry_date != null) __obj.updateDynamic("expiry_date")(expiry_date.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[Credentials]
  }
}

