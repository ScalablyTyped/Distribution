package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMComponentOptions[T] extends ComponentOptions[T] {
  /** @name DOMComponent.Options.bindingOptions */
  var bindingOptions: js.UndefOr[js.Any] = js.undefined
  /** @name DOMComponent.Options.elementAttr */
  var elementAttr: js.UndefOr[js.Any] = js.undefined
  /** @name DOMComponent.Options.height */
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name DOMComponent.Options.onDisposing */
  @JSName("onDisposing")
  var onDisposing_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ AnonModel[T], _]] = js.undefined
  /** @name DOMComponent.Options.onOptionChanged */
  @JSName("onOptionChanged")
  var onOptionChanged_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ AnonName[T], _]] = js.undefined
  /** @name DOMComponent.Options.rtlEnabled */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name DOMComponent.Options.width */
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
}

object DOMComponentOptions {
  @scala.inline
  def apply[T](
    bindingOptions: js.Any = null,
    elementAttr: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): DOMComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMComponentOptions[T]]
  }
}

