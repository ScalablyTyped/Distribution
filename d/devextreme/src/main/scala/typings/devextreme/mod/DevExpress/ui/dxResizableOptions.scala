package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Element
import typings.devextreme.anon.EventHeight
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
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
  var onResize: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.undefined
  /** @name dxResizable.Options.onResizeEnd */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.undefined
  /** @name dxResizable.Options.onResizeStart */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.undefined
}

object dxResizableOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    elementAttr: js.Any = null,
    handles: bottom | left | right | top | all | String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    onDisposing: /* e */ Model[dxResizable] => _ = null,
    onInitialized: /* e */ Element[dxResizable] => _ = null,
    onOptionChanged: /* e */ Name[dxResizable] => _ = null,
    onResize: /* e */ EventHeight => _ = null,
    onResizeEnd: /* e */ EventHeight => _ = null,
    onResizeStart: /* e */ EventHeight => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1(onResizeEnd))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction1(onResizeStart))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxResizableOptions]
  }
}

