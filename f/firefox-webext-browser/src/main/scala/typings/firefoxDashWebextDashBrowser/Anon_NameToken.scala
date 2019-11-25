package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameToken extends js.Object {
  var name: String
  var token: js.UndefOr[Anon_FWVersion] = js.undefined
}

object Anon_NameToken {
  @scala.inline
  def apply(name: String, token: Anon_FWVersion = null): Anon_NameToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameToken]
  }
}

