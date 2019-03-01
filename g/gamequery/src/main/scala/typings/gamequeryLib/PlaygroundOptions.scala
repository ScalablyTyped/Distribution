package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaygroundOptions extends js.Object {
  var disableCollision: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var keyTracker: js.UndefOr[scala.Boolean] = js.undefined
  var mouseTracker: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var refreshRate: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PlaygroundOptions {
  @scala.inline
  def apply(
    disableCollision: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    keyTracker: js.UndefOr[scala.Boolean] = js.undefined,
    mouseTracker: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    refreshRate: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCollision)) __obj.updateDynamic("disableCollision")(disableCollision)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyTracker)) __obj.updateDynamic("keyTracker")(keyTracker)
    if (!js.isUndefined(mouseTracker)) __obj.updateDynamic("mouseTracker")(mouseTracker)
    if (position != null) __obj.updateDynamic("position")(position)
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaygroundOptions]
  }
}

