package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentDropInsideItem
import typings.devextreme.AnonDropInsideItemElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonFromComponentFromData
import typings.devextreme.AnonFromDataFromIndex
import typings.devextreme.AnonFromIndexItemData
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonY
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSortableOptions extends DraggableBaseOptions[dxSortable] {
  /** Allows a user to drop an item inside another item. */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  /** Allows a user to reorder sortable items. */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  /** Specifies custom markup to be shown instead of the item being dragged. */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ AnonFromIndexItemData, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies how to highlight the item's drop position. */
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.undefined
  /** Specifies a CSS selector for the items that can be dragged. */
  var filter: js.UndefOr[String] = js.undefined
  /** Notifies the widget of the items' orientation. */
  var itemOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  /** Moves an element in the HTML markup when it is dropped. */
  var moveItemOnDrop: js.UndefOr[Boolean] = js.undefined
  /** A function that is called when a new item is added. */
  var onAdd: js.UndefOr[js.Function1[/* e */ AnonComponentDropInsideItem, _]] = js.undefined
  /** A function that is called when the dragged item's position in the list is changed. */
  var onDragChange: js.UndefOr[js.Function1[/* e */ AnonDropInsideItemElement, _]] = js.undefined
  /** A function that is called when the drag gesture is finished. */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ AnonDropInsideItemElement, _]] = js.undefined
  /** A function that is called every time a draggable item is moved. */
  var onDragMove: js.UndefOr[js.Function1[/* e */ AnonDropInsideItemElement, _]] = js.undefined
  /** A function that is called when drag gesture is initialized. */
  var onDragStart: js.UndefOr[js.Function1[/* e */ AnonFromDataFromIndex, _]] = js.undefined
  /** A function that is called when a draggable item is removed. */
  var onRemove: js.UndefOr[js.Function1[/* e */ AnonFromComponentFromData, _]] = js.undefined
  /** A function that is called when the draggable items are reordered. */
  var onReorder: js.UndefOr[js.Function1[/* e */ AnonComponentDropInsideItem, _]] = js.undefined
}

object dxSortableOptions {
  @scala.inline
  def apply(
    allowDropInsideItem: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    boundary: String | Element | JQuery = null,
    container: String | Element | JQuery = null,
    cursorOffset: String | AnonY = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ AnonFromIndexItemData, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dropFeedbackMode: push | indicate = null,
    elementAttr: js.Any = null,
    filter: String = null,
    group: String = null,
    handle: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    itemOrientation: horizontal | vertical = null,
    moveItemOnDrop: js.UndefOr[Boolean] = js.undefined,
    onAdd: /* e */ AnonComponentDropInsideItem => _ = null,
    onDisposing: /* e */ AnonModel[dxSortable] => _ = null,
    onDragChange: /* e */ AnonDropInsideItemElement => _ = null,
    onDragEnd: /* e */ AnonDropInsideItemElement => _ = null,
    onDragMove: /* e */ AnonDropInsideItemElement => _ = null,
    onDragStart: /* e */ AnonFromDataFromIndex => _ = null,
    onInitialized: /* e */ AnonElement[dxSortable] => _ = null,
    onOptionChanged: /* e */ AnonName[dxSortable] => _ = null,
    onRemove: /* e */ AnonFromComponentFromData => _ = null,
    onReorder: /* e */ AnonComponentDropInsideItem => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSortableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDropInsideItem)) __obj.updateDynamic("allowDropInsideItem")(allowDropInsideItem.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragDirection != null) __obj.updateDynamic("dragDirection")(dragDirection.asInstanceOf[js.Any])
    if (dragTemplate != null) __obj.updateDynamic("dragTemplate")(dragTemplate.asInstanceOf[js.Any])
    if (dropFeedbackMode != null) __obj.updateDynamic("dropFeedbackMode")(dropFeedbackMode.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemOrientation != null) __obj.updateDynamic("itemOrientation")(itemOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(moveItemOnDrop)) __obj.updateDynamic("moveItemOnDrop")(moveItemOnDrop.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDragChange != null) __obj.updateDynamic("onDragChange")(js.Any.fromFunction1(onDragChange))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1(onReorder))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSortableOptions]
  }
}

