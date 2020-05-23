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
    height: js.UndefOr[Double] = js.undefined,
    keyTracker: js.UndefOr[Boolean] = js.undefined,
    mouseTracker: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    refreshRate: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCollision)) __obj.updateDynamic("disableCollision")(disableCollision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyTracker)) __obj.updateDynamic("keyTracker")(keyTracker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTracker)) __obj.updateDynamic("mouseTracker")(mouseTracker.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshRate)) __obj.updateDynamic("refreshRate")(refreshRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaygroundOptions]
  }
}

