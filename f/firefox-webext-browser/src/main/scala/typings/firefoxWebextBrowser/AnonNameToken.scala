package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameToken extends js.Object {
  var name: String
  var token: js.UndefOr[AnonFWVersion] = js.undefined
}

object AnonNameToken {
  @scala.inline
  def apply(name: String, token: AnonFWVersion = null): AnonNameToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameToken]
  }
}

