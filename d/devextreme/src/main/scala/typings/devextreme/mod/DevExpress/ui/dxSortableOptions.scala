package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDropInsideItem
import typings.devextreme.anon.DropInsideItemElement
import typings.devextreme.anon.FromComponentFromData
import typings.devextreme.anon.FromDataFromIndex
import typings.devextreme.anon.FromIndexItemData
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSortableOptions extends DraggableBaseOptions[dxSortable] {
  /** @name dxSortable.Options.allowDropInsideItem */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  /** @name dxSortable.Options.allowReordering */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  /** @name dxSortable.Options.dragTemplate */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ FromIndexItemData, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxSortable.Options.dropFeedbackMode */
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.undefined
  /** @name dxSortable.Options.filter */
  var filter: js.UndefOr[String] = js.undefined
  /** @name dxSortable.Options.itemOrientation */
  var itemOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  /** @name dxSortable.Options.moveItemOnDrop */
  var moveItemOnDrop: js.UndefOr[Boolean] = js.undefined
  /** @name dxSortable.Options.onAdd */
  var onAdd: js.UndefOr[js.Function1[/* e */ ComponentDropInsideItem, _]] = js.undefined
  /** @name dxSortable.Options.onDragChange */
  var onDragChange: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.undefined
  /** @name dxSortable.Options.onDragEnd */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.undefined
  /** @name dxSortable.Options.onDragMove */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.undefined
  /** @name dxSortable.Options.onDragStart */
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataFromIndex, _]] = js.undefined
  /** @name dxSortable.Options.onRemove */
  var onRemove: js.UndefOr[js.Function1[/* e */ FromComponentFromData, _]] = js.undefined
  /** @name dxSortable.Options.onReorder */
  var onReorder: js.UndefOr[js.Function1[/* e */ ComponentDropInsideItem, _]] = js.undefined
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
    cursorOffset: String | Y = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ FromIndexItemData, 
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
    onAdd: /* e */ ComponentDropInsideItem => _ = null,
    onDisposing: /* e */ Model[dxSortable] => _ = null,
    onDragChange: /* e */ DropInsideItemElement => _ = null,
    onDragEnd: /* e */ DropInsideItemElement => _ = null,
    onDragMove: /* e */ DropInsideItemElement => _ = null,
    onDragStart: /* e */ FromDataFromIndex => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxSortable] => _ = null,
    onOptionChanged: /* e */ Name[dxSortable] => _ = null,
    onRemove: /* e */ FromComponentFromData => _ = null,
    onReorder: /* e */ ComponentDropInsideItem => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSortableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDropInsideItem)) __obj.updateDynamic("allowDropInsideItem")(allowDropInsideItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(moveItemOnDrop)) __obj.updateDynamic("moveItemOnDrop")(moveItemOnDrop.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSortableOptions]
  }
}

