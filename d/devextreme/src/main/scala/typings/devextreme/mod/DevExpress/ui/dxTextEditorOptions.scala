package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventJQueryEventModel
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextEditorOptions[T] extends EditorOptions[T] {
  /** @name dxTextEditor.Options.buttons */
  var buttons: js.UndefOr[js.Array[String | clear | dxTextEditorButton]] = js.native
  /** @name dxTextEditor.Options.inputAttr */
  var inputAttr: js.UndefOr[js.Any] = js.native
  /** @name dxTextEditor.Options.mask */
  var mask: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.maskChar */
  var maskChar: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.maskInvalidMessage */
  var maskInvalidMessage: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.maskRules */
  var maskRules: js.UndefOr[js.Any] = js.native
  /** @name dxTextEditor.Options.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.onChange */
  var onChange: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onCopy */
  var onCopy: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onCut */
  var onCut: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onEnterKey */
  var onEnterKey: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onFocusIn */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onFocusOut */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onInput */
  var onInput: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onKeyDown */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @deprecated */
  /** @name dxTextEditor.Options.onKeyPress */
  var onKeyPress: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onKeyUp */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.onPaste */
  var onPaste: js.UndefOr[js.Function1[/* e */ EventJQueryEventModel[T], _]] = js.native
  /** @name dxTextEditor.Options.placeholder */
  var placeholder: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.showClearButton */
  var showClearButton: js.UndefOr[Boolean] = js.native
  /** @name dxTextEditor.Options.showMaskMode */
  var showMaskMode: js.UndefOr[always | onFocus] = js.native
  /** @name dxTextEditor.Options.spellcheck */
  var spellcheck: js.UndefOr[Boolean] = js.native
  /** @name dxTextEditor.Options.stylingMode */
  var stylingMode: js.UndefOr[outlined | underlined | filled] = js.native
  /** @name dxTextEditor.Options.text */
  var text: js.UndefOr[String] = js.native
  /** @name dxTextEditor.Options.useMaskedValue */
  var useMaskedValue: js.UndefOr[Boolean] = js.native
  /** @name dxTextEditor.Options.valueChangeEvent */
  var valueChangeEvent: js.UndefOr[String] = js.native
}

object dxTextEditorOptions {
  @scala.inline
  def apply[T](): dxTextEditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextEditorOptions[T]]
  }
  @scala.inline
  implicit class dxTextEditorOptionsOps[Self <: dxTextEditorOptions[_], T] (val x: Self with dxTextEditorOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButtonsVarargs(value: (String | clear | dxTextEditorButton)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[String | clear | dxTextEditorButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setInputAttr(value: js.Any): Self = this.set("inputAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAttr: Self = this.set("inputAttr", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskChar(value: String): Self = this.set("maskChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskChar: Self = this.set("maskChar", js.undefined)
    @scala.inline
    def setMaskInvalidMessage(value: String): Self = this.set("maskInvalidMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskInvalidMessage: Self = this.set("maskInvalidMessage", js.undefined)
    @scala.inline
    def setMaskRules(value: js.Any): Self = this.set("maskRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskRules: Self = this.set("maskRules", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnCopy(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnEnterKey(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onEnterKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnterKey: Self = this.set("onEnterKey", js.undefined)
    @scala.inline
    def setOnFocusIn(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onFocusIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusIn: Self = this.set("onFocusIn", js.undefined)
    @scala.inline
    def setOnFocusOut(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onFocusOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusOut: Self = this.set("onFocusOut", js.undefined)
    @scala.inline
    def setOnInput(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnPaste(value: /* e */ EventJQueryEventModel[T] => _): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setShowClearButton(value: Boolean): Self = this.set("showClearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClearButton: Self = this.set("showClearButton", js.undefined)
    @scala.inline
    def setShowMaskMode(value: always | onFocus): Self = this.set("showMaskMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMaskMode: Self = this.set("showMaskMode", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setStylingMode(value: outlined | underlined | filled): Self = this.set("stylingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylingMode: Self = this.set("stylingMode", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUseMaskedValue(value: Boolean): Self = this.set("useMaskedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMaskedValue: Self = this.set("useMaskedValue", js.undefined)
    @scala.inline
    def setValueChangeEvent(value: String): Self = this.set("valueChangeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueChangeEvent: Self = this.set("valueChangeEvent", js.undefined)
  }
  
}

