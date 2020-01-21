package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToken extends js.Object {
  var token: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonToken {
  @scala.inline
  def apply(token: String = null, `type`: String = null): AnonToken = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToken]
  }
}

