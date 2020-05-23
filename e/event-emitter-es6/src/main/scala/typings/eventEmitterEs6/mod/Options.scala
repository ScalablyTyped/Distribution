package typings.eventEmitterEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var emitDelay: js.UndefOr[Double] = js.undefined
  var strictMode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(emitDelay: js.UndefOr[Double] = js.undefined, strictMode: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitDelay)) __obj.updateDynamic("emitDelay")(emitDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

