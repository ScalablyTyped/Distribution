package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  var interval: Double
  var repeat: js.UndefOr[Boolean] = js.undefined
}

object Interval {
  @scala.inline
  def apply(interval: Double, repeat: js.UndefOr[Boolean] = js.undefined): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

