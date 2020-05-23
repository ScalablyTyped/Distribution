package typings.devextreme.anon

import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.down
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.up
import typings.devextreme.mod.DevExpress.positionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseIcon extends js.Object {
  var closeIcon: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[auto | up | down] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var maxSpeedDialActionCount: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.undefined
  var shading: js.UndefOr[Boolean] = js.undefined
}

object CloseIcon {
  @scala.inline
  def apply(
    closeIcon: String = null,
    direction: auto | up | down = null,
    icon: String = null,
    label: String = null,
    maxSpeedDialActionCount: js.UndefOr[Double] = js.undefined,
    position: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function = null,
    shading: js.UndefOr[Boolean] = js.undefined
  ): CloseIcon = {
    val __obj = js.Dynamic.literal()
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSpeedDialActionCount)) __obj.updateDynamic("maxSpeedDialActionCount")(maxSpeedDialActionCount.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseIcon]
  }
}

