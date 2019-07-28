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
  def apply(tapDelay: Int | Double = null, touchBoundary: Int | Double = null): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    if (tapDelay != null) __obj.updateDynamic("tapDelay")(tapDelay.asInstanceOf[js.Any])
    if (touchBoundary != null) __obj.updateDynamic("touchBoundary")(touchBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastClickOptions]
  }
}

