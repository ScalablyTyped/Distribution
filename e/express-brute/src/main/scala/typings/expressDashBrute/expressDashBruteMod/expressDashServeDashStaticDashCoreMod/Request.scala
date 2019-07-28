package typings.expressDashBrute.expressDashBruteMod.expressDashServeDashStaticDashCoreMod

import typings.expressDashBrute.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var brute: js.UndefOr[Anon_Callback] = js.undefined
}

object Request {
  @scala.inline
  def apply(brute: Anon_Callback = null): Request = {
    val __obj = js.Dynamic.literal()
    if (brute != null) __obj.updateDynamic("brute")(brute)
    __obj.asInstanceOf[Request]
  }
}

