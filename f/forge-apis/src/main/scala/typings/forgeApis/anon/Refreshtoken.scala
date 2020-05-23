package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refreshtoken extends js.Object {
  var refresh_token: js.UndefOr[String] = js.undefined
}

object Refreshtoken {
  @scala.inline
  def apply(refresh_token: String = null): Refreshtoken = {
    val __obj = js.Dynamic.literal()
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refreshtoken]
  }
}

