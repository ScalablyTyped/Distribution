package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScroll extends js.Object {
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ ToData, _]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ CancelEvent, _]] = js.undefined
  var onDragMove: js.UndefOr[js.Function1[/* e */ CancelEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataItemData, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ EventFromComponent, _]] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}

object AutoScroll {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    group: String = null,
    onAdd: /* e */ ToData => _ = null,
    onDragEnd: /* e */ CancelEvent => _ = null,
    onDragMove: /* e */ CancelEvent => _ = null,
    onDragStart: /* e */ FromDataItemData => _ = null,
    onRemove: /* e */ EventFromComponent => _ = null,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined
  ): AutoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScroll]
  }
}

