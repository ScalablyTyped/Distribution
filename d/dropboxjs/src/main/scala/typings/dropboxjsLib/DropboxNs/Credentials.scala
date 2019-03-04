package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var key: java.lang.String
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    key: java.lang.String,
    secret: java.lang.String = null,
    token: java.lang.String = null,
    uid: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(key = key)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (token != null) __obj.updateDynamic("token")(token)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Credentials]
  }
}

