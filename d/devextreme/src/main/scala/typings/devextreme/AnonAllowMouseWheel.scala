package typings.devextreme

import typings.devextreme.devextremeStrings.alt
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.ctrl
import typings.devextreme.devextremeStrings.meta
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowMouseWheel extends js.Object {
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  var allowTouchGestures: js.UndefOr[Boolean] = js.undefined
  var argumentAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
  var dragBoxStyle: js.UndefOr[AnonOpacity] = js.undefined
  var dragToZoom: js.UndefOr[Boolean] = js.undefined
  var panKey: js.UndefOr[alt | ctrl | meta | shift] = js.undefined
  var valueAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
}

object AnonAllowMouseWheel {
  @scala.inline
  def apply(
    allowMouseWheel: js.UndefOr[Boolean] = js.undefined,
    allowTouchGestures: js.UndefOr[Boolean] = js.undefined,
    argumentAxis: both | none | pan | zoom = null,
    dragBoxStyle: AnonOpacity = null,
    dragToZoom: js.UndefOr[Boolean] = js.undefined,
    panKey: alt | ctrl | meta | shift = null,
    valueAxis: both | none | pan | zoom = null
  ): AnonAllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMouseWheel)) __obj.updateDynamic("allowMouseWheel")(allowMouseWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTouchGestures)) __obj.updateDynamic("allowTouchGestures")(allowTouchGestures.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (dragBoxStyle != null) __obj.updateDynamic("dragBoxStyle")(dragBoxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToZoom)) __obj.updateDynamic("dragToZoom")(dragToZoom.asInstanceOf[js.Any])
    if (panKey != null) __obj.updateDynamic("panKey")(panKey.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowMouseWheel]
  }
}

