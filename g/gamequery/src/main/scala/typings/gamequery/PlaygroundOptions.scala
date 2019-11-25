package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaygroundOptions extends js.Object {
  var disableCollision: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var keyTracker: js.UndefOr[Boolean] = js.undefined
  var mouseTracker: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var refreshRate: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PlaygroundOptions {
  @scala.inline
  def apply(
    disableCollision: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    keyTracker: js.UndefOr[Boolean] = js.undefined,
    mouseTracker: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    refreshRate: Int | Double = null,
    width: Int | Double = null
  ): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCollision)) __obj.updateDynamic("disableCollision")(disableCollision.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyTracker)) __obj.updateDynamic("keyTracker")(keyTracker.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTracker)) __obj.updateDynamic("mouseTracker")(mouseTracker.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaygroundOptions]
  }
}

