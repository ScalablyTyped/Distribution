package typings.estimate.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var spaces: js.UndefOr[RegExp] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(spaces: RegExp = null, speed: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

