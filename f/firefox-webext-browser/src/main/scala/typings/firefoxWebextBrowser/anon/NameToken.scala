package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameToken extends js.Object {
  var name: String
  var token: js.UndefOr[FWVersion] = js.undefined
}

object NameToken {
  @scala.inline
  def apply(name: String, token: FWVersion = null): NameToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameToken]
  }
}

