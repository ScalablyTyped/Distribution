package typings.fastclick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastClickOptions extends js.Object {
  var tapDelay: js.UndefOr[Double] = js.undefined
  var touchBoundary: js.UndefOr[Double] = js.undefined
}

object FastClickOptions {
  @scala.inline
  def apply(tapDelay: js.UndefOr[Double] = js.undefined, touchBoundary: js.UndefOr[Double] = js.undefined): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tapDelay)) __obj.updateDynamic("tapDelay")(tapDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchBoundary)) __obj.updateDynamic("touchBoundary")(touchBoundary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastClickOptions]
  }
}

