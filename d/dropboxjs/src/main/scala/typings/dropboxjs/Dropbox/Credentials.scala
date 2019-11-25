package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var key: String
  var secret: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(key: String, secret: String = null, token: String = null, uid: String = null): Credentials = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

