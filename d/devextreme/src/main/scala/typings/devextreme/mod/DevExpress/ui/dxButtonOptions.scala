package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Icon
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.ValidationGroup
import typings.devextreme.devextremeStrings.back
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.danger
import typings.devextreme.devextremeStrings.default_
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.success
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxButtonOptions extends WidgetOptions[dxButton] {
  /** @name dxButton.Options.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxButton.Options.onClick */
  var onClick: js.UndefOr[js.Function1[/* e */ ValidationGroup, _]] = js.undefined
  /** @name dxButton.Options.stylingMode */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
  /** @name dxButton.Options.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxButton.Options.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxButton.Options.type */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.undefined
  /** @name dxButton.Options.useSubmitBehavior */
  var useSubmitBehavior: js.UndefOr[Boolean] = js.undefined
  /** @name dxButton.Options.validationGroup */
  var validationGroup: js.UndefOr[String] = js.undefined
}

object dxButtonOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onClick: /* e */ ValidationGroup => _ = null,
    onContentReady: /* e */ ComponentElement[dxButton] => _ = null,
    onDisposing: /* e */ Model[dxButton] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxButton] => _ = null,
    onOptionChanged: /* e */ Name[dxButton] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    stylingMode: text | outlined | contained = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    text: String = null,
    `type`: back | danger | default_ | normal | success = null,
    useSubmitBehavior: js.UndefOr[Boolean] = js.undefined,
    validationGroup: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useSubmitBehavior)) __obj.updateDynamic("useSubmitBehavior")(useSubmitBehavior.get.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxButtonOptions]
  }
}

