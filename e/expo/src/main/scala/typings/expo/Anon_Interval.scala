package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: Double
  var repeat: js.UndefOr[Boolean] = js.undefined
}

object Anon_Interval {
  @scala.inline
  def apply(interval: Double, repeat: js.UndefOr[Boolean] = js.undefined): Anon_Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Interval]
  }
}

