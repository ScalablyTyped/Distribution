package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventFromData
import typings.devextreme.anon.ItemDataItemElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.ToComponent
import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDraggableOptions extends DraggableBaseOptions[dxDraggable] {
  /** @name dxDraggable.Options.clone */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.undefined
  /** @name dxDraggable.Options.dragTemplate */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxDraggable.Options.onDragEnd */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.undefined
  /** @name dxDraggable.Options.onDragMove */
  var onDragMove: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.undefined
  /** @name dxDraggable.Options.onDragStart */
  var onDragStart: js.UndefOr[js.Function1[/* e */ EventFromData, _]] = js.undefined
}

object dxDraggableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    boundary: String | Element | JQuery = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    container: String | Element | JQuery = null,
    cursorOffset: String | Y = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    elementAttr: js.Any = null,
    group: String = null,
    handle: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ Model[dxDraggable] => _ = null,
    onDragEnd: /* e */ ToComponent => _ = null,
    onDragMove: /* e */ ToComponent => _ = null,
    onDragStart: /* e */ EventFromData => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxDraggable] => _ = null,
    onOptionChanged: /* e */ Name[dxDraggable] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragDirection != null) __obj.updateDynamic("dragDirection")(dragDirection.asInstanceOf[js.Any])
    if (dragTemplate != null) __obj.updateDynamic("dragTemplate")(dragTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDraggableOptions]
  }
}

