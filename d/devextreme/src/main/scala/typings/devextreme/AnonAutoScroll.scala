package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoScroll extends js.Object {
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ AnonToData, _]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ AnonCancelEvent, _]] = js.undefined
  var onDragMove: js.UndefOr[js.Function1[/* e */ AnonCancelEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ AnonFromDataItemData, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ AnonEventFromComponent, _]] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}

object AnonAutoScroll {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    group: String = null,
    onAdd: /* e */ AnonToData => _ = null,
    onDragEnd: /* e */ AnonCancelEvent => _ = null,
    onDragMove: /* e */ AnonCancelEvent => _ = null,
    onDragStart: /* e */ AnonFromDataItemData => _ = null,
    onRemove: /* e */ AnonEventFromComponent => _ = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null
  ): AnonAutoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoScroll]
  }
}

