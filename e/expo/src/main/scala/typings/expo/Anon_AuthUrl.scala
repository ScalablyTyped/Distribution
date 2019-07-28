package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthUrl extends js.Object {
  var authUrl: String
  var returnUrl: js.UndefOr[String] = js.undefined
}

object Anon_AuthUrl {
  @scala.inline
  def apply(authUrl: String, returnUrl: String = null): Anon_AuthUrl = {
    val __obj = js.Dynamic.literal(authUrl = authUrl)
    if (returnUrl != null) __obj.updateDynamic("returnUrl")(returnUrl)
    __obj.asInstanceOf[Anon_AuthUrl]
  }
}

