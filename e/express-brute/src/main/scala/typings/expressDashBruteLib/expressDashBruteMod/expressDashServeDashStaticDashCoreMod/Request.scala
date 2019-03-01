package typings
package expressDashBruteLib.expressDashBruteMod.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var brute: js.UndefOr[expressDashBruteLib.Anon_Callback] = js.undefined
}

object Request {
  @scala.inline
  def apply(brute: expressDashBruteLib.Anon_Callback = null): Request = {
    val __obj = js.Dynamic.literal()
    if (brute != null) __obj.updateDynamic("brute")(brute)
    __obj.asInstanceOf[Request]
  }
}

