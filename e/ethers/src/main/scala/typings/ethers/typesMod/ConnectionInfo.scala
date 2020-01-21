package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var allowInsecure: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var url: String
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionInfo {
  @scala.inline
  def apply(
    url: String,
    allowInsecure: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    user: String = null
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsecure)) __obj.updateDynamic("allowInsecure")(allowInsecure.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

