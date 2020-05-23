package typings.fancybox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoStart_ extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AutoStart_ {
  @scala.inline
  def apply(autoStart: js.UndefOr[Boolean] = js.undefined, speed: js.UndefOr[Double] = js.undefined): AutoStart_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoStart_]
  }
}

