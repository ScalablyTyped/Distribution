package typings.devextreme.anon

import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowDropInsideItem extends js.Object {
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var boundary: js.UndefOr[String | typings.std.Element | JQuery] = js.undefined
  var container: js.UndefOr[String | typings.std.Element | JQuery] = js.undefined
  var cursorOffset: js.UndefOr[String | Y] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.undefined
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.undefined
  var onDragChange: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.undefined
  var onDragMove: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromData, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ FromIndex, _]] = js.undefined
  var onReorder: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var showDragIcons: js.UndefOr[Boolean] = js.undefined
}

object AllowDropInsideItem {
  @scala.inline
  def apply(
    allowDropInsideItem: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    boundary: String | typings.std.Element | JQuery = null,
    container: String | typings.std.Element | JQuery = null,
    cursorOffset: String | Y = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | typings.std.Element | JQuery
    ]) = null,
    dropFeedbackMode: push | indicate = null,
    filter: String = null,
    group: String = null,
    handle: String = null,
    onAdd: /* e */ DropInsideItem => _ = null,
    onDragChange: /* e */ FromComponent => _ = null,
    onDragEnd: /* e */ FromComponent => _ = null,
    onDragMove: /* e */ FromComponent => _ = null,
    onDragStart: /* e */ FromData => _ = null,
    onRemove: /* e */ FromIndex => _ = null,
    onReorder: /* e */ DropInsideItem => _ = null,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    showDragIcons: js.UndefOr[Boolean] = js.undefined
  ): AllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDropInsideItem)) __obj.updateDynamic("allowDropInsideItem")(allowDropInsideItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragDirection != null) __obj.updateDynamic("dragDirection")(dragDirection.asInstanceOf[js.Any])
    if (dragTemplate != null) __obj.updateDynamic("dragTemplate")(dragTemplate.asInstanceOf[js.Any])
    if (dropFeedbackMode != null) __obj.updateDynamic("dropFeedbackMode")(dropFeedbackMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onDragChange != null) __obj.updateDynamic("onDragChange")(js.Any.fromFunction1(onDragChange))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1(onReorder))
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDragIcons)) __obj.updateDynamic("showDragIcons")(showDragIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDropInsideItem]
  }
}

