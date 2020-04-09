package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonComponentT
import typings.devextreme.AnonComponentValue
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventJQueryEvent
import typings.devextreme.AnonIcon
import typings.devextreme.AnonJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.dropDown
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.search
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.url
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ trait dxDropDownBoxOptions extends dxDropDownEditorOptions[dxDropDownBox] {
  /** @name dxDropDownBox.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* templateData */ AnonComponentValue, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name DataExpressionMixin.Options.dataSource */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** @name DataExpressionMixin.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** @name dxDropDownBox.Options.displayValueFormatter */
  var displayValueFormatter: js.UndefOr[js.Function1[/* value */ String | js.Array[_], String]] = js.undefined
  /** @name dxDropDownBox.Options.dropDownOptions */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** @name dxDropDownBox.Options.fieldTemplate */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name DataExpressionMixin.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name DataExpressionMixin.Options.items */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.undefined
  /** @name DataExpressionMixin.Options.valueExpr */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.undefined
}

object dxDropDownBoxOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    contentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* templateData */ AnonComponentValue, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dataSource: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    displayValueFormatter: /* value */ String | js.Array[_] => String = null,
    dropDownButtonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    dropDownOptions: dxPopupOptions[dxPopup] = null,
    elementAttr: js.Any = null,
    fieldTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery]) = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[CollectionWidgetItem | _] = null,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    maxLength: String | Double = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onClosed: /* e */ AnonComponentT[dxDropDownBox] => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxDropDownBox] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onDisposing: /* e */ AnonModel[dxDropDownBox] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onInitialized: /* e */ AnonElement[dxDropDownBox] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onOpened: /* e */ AnonComponentT[dxDropDownBox] => _ = null,
    onOptionChanged: /* e */ AnonName[dxDropDownBox] => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxDropDownBox] => _ = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxDropDownBox] => _ = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: String = null,
    valueChangeEvent: String = null,
    valueExpr: String | (js.Function1[/* item */ js.Any, String | Double | Boolean]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDropDownBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (displayValueFormatter != null) __obj.updateDynamic("displayValueFormatter")(js.Any.fromFunction1(displayValueFormatter))
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (dropDownOptions != null) __obj.updateDynamic("dropDownOptions")(dropDownOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fieldTemplate != null) __obj.updateDynamic("fieldTemplate")(fieldTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1(onEnterKey))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1(onFocusIn))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1(onFocusOut))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownBoxOptions]
  }
}

