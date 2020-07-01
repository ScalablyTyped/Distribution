package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Major extends js.Object {
  var major: js.UndefOr[Double] = js.native
  var minor: js.UndefOr[Double] = js.native
}

object Major {
  @scala.inline
  def apply(major: js.UndefOr[Double] = js.undefined, minor: js.UndefOr[Double] = js.undefined): Major = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(major)) __obj.updateDynamic("major")(major.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minor)) __obj.updateDynamic("minor")(minor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
}

