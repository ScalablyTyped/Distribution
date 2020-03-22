package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonElement
import typings.devextreme.AnonEventFromData
import typings.devextreme.AnonItemDataItemElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonToComponent
import typings.devextreme.AnonY
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDraggableOptions extends DraggableBaseOptions[dxDraggable] {
  /** Allows a user to drag clones of items instead of actual items. */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.undefined
  /** Specifies custom markup to be shown instead of the item being dragged. */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ AnonItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** A function that is called when drag gesture is finished. */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ AnonToComponent, _]] = js.undefined
  /** A function that is called every time a draggable item is moved. */
  var onDragMove: js.UndefOr[js.Function1[/* e */ AnonToComponent, _]] = js.undefined
  /** A function that is called when the drag gesture is initialized. */
  var onDragStart: js.UndefOr[js.Function1[/* e */ AnonEventFromData, _]] = js.undefined
}

object dxDraggableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    boundary: String | Element | JQuery = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    container: String | Element | JQuery = null,
    cursorOffset: String | AnonY = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ AnonItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    elementAttr: js.Any = null,
    group: String = null,
    handle: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ AnonModel[dxDraggable] => _ = null,
    onDragEnd: /* e */ AnonToComponent => _ = null,
    onDragMove: /* e */ AnonToComponent => _ = null,
    onDragStart: /* e */ AnonEventFromData => _ = null,
    onInitialized: /* e */ AnonElement[dxDraggable] => _ = null,
    onOptionChanged: /* e */ AnonName[dxDraggable] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDraggableOptions]
  }
}

