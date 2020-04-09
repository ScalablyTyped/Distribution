package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonElement
import typings.devextreme.AnonEventHeight
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.all
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxResizableOptions extends DOMComponentOptions[dxResizable] {
  /** @name dxResizable.Options.handles */
  var handles: js.UndefOr[bottom | left | right | top | all | String] = js.undefined
  /** @name dxResizable.Options.maxHeight */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** @name dxResizable.Options.maxWidth */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** @name dxResizable.Options.minHeight */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** @name dxResizable.Options.minWidth */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** @name dxResizable.Options.onResize */
  var onResize: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
  /** @name dxResizable.Options.onResizeEnd */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
  /** @name dxResizable.Options.onResizeStart */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
}

object dxResizableOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    elementAttr: js.Any = null,
    handles: bottom | left | right | top | all | String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxResizable] => _ = null,
    onInitialized: /* e */ AnonElement[dxResizable] => _ = null,
    onOptionChanged: /* e */ AnonName[dxResizable] => _ = null,
    onResize: /* e */ AnonEventHeight => _ = null,
    onResizeEnd: /* e */ AnonEventHeight => _ = null,
    onResizeStart: /* e */ AnonEventHeight => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1(onResizeEnd))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction1(onResizeStart))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxResizableOptions]
  }
}

