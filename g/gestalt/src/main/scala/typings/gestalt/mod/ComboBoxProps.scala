package typings.gestalt.mod

import typings.gestalt.anon.Item
import typings.gestalt.anon.Value
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.visible
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxProps extends StObject {
  
  var accessibilityClearButtonLabel: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var inputValue: js.UndefOr[String | Null] = js.undefined
  
  var label: String
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var noResultText: String
  
  var onBlur: js.UndefOr[
    AbstractEventHandler[
      (FocusEvent[HTMLInputElement, Element]) | (SyntheticEvent[HTMLInputElement, Event]), 
      Value
    ]
  ] = js.undefined
  
  var onChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], Value]] = js.undefined
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLInputElement, Element], Value]] = js.undefined
  
  var onKeyDown: js.UndefOr[AbstractEventHandler[KeyboardEvent[HTMLInputElement], Value]] = js.undefined
  
  var onSelect: js.UndefOr[
    AbstractEventHandler[(SyntheticEvent[HTMLInputElement, Event]) | KeyboardEvent[HTMLInputElement], Item]
  ] = js.undefined
  
  var options: js.Array[ComboBoxItemType]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var selectedOption: js.UndefOr[ComboBoxItemType] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tags: js.UndefOr[js.Array[ReactElement]] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object ComboBoxProps {
  
  inline def apply(id: String, label: String, noResultText: String, options: js.Array[ComboBoxItemType]): ComboBoxProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBoxProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityClearButtonLabel(value: String): Self = StObject.set(x, "accessibilityClearButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityClearButtonLabelUndefined: Self = StObject.set(x, "accessibilityClearButtonLabel", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setNoResultText(value: String): Self = StObject.set(x, "noResultText", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(
      value: /* arg */ Value & (typings.gestalt.anon.Event[
          (FocusEvent[HTMLInputElement, Element]) | (SyntheticEvent[HTMLInputElement, Event])
        ]) => Unit
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(
      value: /* arg */ Value & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnFocus(
      value: /* arg */ Value & (typings.gestalt.anon.Event[FocusEvent[HTMLInputElement, Element]]) => Unit
    ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* arg */ Value & typings.gestalt.anon.Event[KeyboardEvent[HTMLInputElement]] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnSelect(
      value: /* arg */ Item & (typings.gestalt.anon.Event[(SyntheticEvent[HTMLInputElement, Event]) | KeyboardEvent[HTMLInputElement]]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOptions(value: js.Array[ComboBoxItemType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ComboBoxItemType*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSelectedOption(value: ComboBoxItemType): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTags(value: js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
