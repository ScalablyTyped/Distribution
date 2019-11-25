package typings.estimate.estimateMod

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
  def apply(spaces: RegExp = null, speed: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

