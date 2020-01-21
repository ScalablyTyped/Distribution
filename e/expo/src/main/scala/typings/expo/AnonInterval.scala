package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  var interval: Double
  var repeat: js.UndefOr[Boolean] = js.undefined
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, repeat: js.UndefOr[Boolean] = js.undefined): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterval]
  }
}

