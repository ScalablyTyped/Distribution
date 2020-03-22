package typings.expressBrute.mod.expressServeStaticCoreAugmentingMod

import typings.expressBrute.AnonReset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var brute: js.UndefOr[AnonReset] = js.undefined
}

object Request {
  @scala.inline
  def apply(brute: AnonReset = null): Request = {
    val __obj = js.Dynamic.literal()
    if (brute != null) __obj.updateDynamic("brute")(brute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

