package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.EventModel
import typings.devextreme.anon.JQueryEvent
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.html
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.markdown
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorOptions extends EditorOptions[dxHtmlEditor] {
  /** @name dxHtmlEditor.Options.customizeModules */
  var customizeModules: js.UndefOr[js.Function1[/* config */ js.Any, _]] = js.undefined
  /** @name dxHtmlEditor.Options.mediaResizing */
  var mediaResizing: js.UndefOr[dxHtmlEditorMediaResizing] = js.undefined
  /** @name dxHtmlEditor.Options.mentions */
  var mentions: js.UndefOr[js.Array[dxHtmlEditorMention]] = js.undefined
  /** @name dxHtmlEditor.Options.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxHtmlEditor.Options.onFocusIn */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ EventModel, _]] = js.undefined
  /** @name dxHtmlEditor.Options.onFocusOut */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ EventModel, _]] = js.undefined
  /** @name dxHtmlEditor.Options.placeholder */
  var placeholder: js.UndefOr[String] = js.undefined
  /** @name dxHtmlEditor.Options.toolbar */
  var toolbar: js.UndefOr[dxHtmlEditorToolbar] = js.undefined
  /** @name dxHtmlEditor.Options.valueType */
  var valueType: js.UndefOr[html | markdown] = js.undefined
  /** @name dxHtmlEditor.Options.variables */
  var variables: js.UndefOr[dxHtmlEditorVariables] = js.undefined
}

object dxHtmlEditorOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    customizeModules: /* config */ js.Any => _ = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mediaResizing: dxHtmlEditorMediaResizing = null,
    mentions: js.Array[dxHtmlEditorMention] = null,
    name: String = null,
    onContentReady: /* e */ ComponentElement[dxHtmlEditor] => _ = null,
    onDisposing: /* e */ Model[dxHtmlEditor] => _ = null,
    onFocusIn: /* e */ EventModel => _ = null,
    onFocusOut: /* e */ EventModel => _ = null,
    onInitialized: /* e */ Element[dxHtmlEditor] => _ = null,
    onOptionChanged: /* e */ Name[dxHtmlEditor] => _ = null,
    onValueChanged: /* e */ JQueryEvent[dxHtmlEditor] => _ = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    toolbar: dxHtmlEditorToolbar = null,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Any = null,
    valueType: html | markdown = null,
    variables: dxHtmlEditorVariables = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxHtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customizeModules != null) __obj.updateDynamic("customizeModules")(js.Any.fromFunction1(customizeModules))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (mediaResizing != null) __obj.updateDynamic("mediaResizing")(mediaResizing.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1(onFocusIn))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1(onFocusOut))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorOptions]
  }
}

