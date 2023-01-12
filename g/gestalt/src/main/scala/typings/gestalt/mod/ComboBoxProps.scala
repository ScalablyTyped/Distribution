package typings.gestalt.mod

import typings.gestalt.anon.EventFocusEvent
import typings.gestalt.anon.EventKeyboardEvent
import typings.gestalt.anon.EventValue
import typings.gestalt.anon.Item
import typings.gestalt.anon.Value
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.visible
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxProps extends StObject {
  
  var accessibilityClearButtonLabel: String
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var noResultText: String
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventValue, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ Value, Unit]] = js.undefined
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEvent, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* args */ Item, Unit]] = js.undefined
  
  var options: js.Array[ComboBoxItemType]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var selectedOption: js.UndefOr[ComboBoxItemType] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tags: js.UndefOr[js.Array[ReactElement]] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object ComboBoxProps {
  
  inline def apply(
    accessibilityClearButtonLabel: String,
    id: String,
    label: String,
    noResultText: String,
    options: js.Array[ComboBoxItemType]
  ): ComboBoxProps = {
    val __obj = js.Dynamic.literal(accessibilityClearButtonLabel = accessibilityClearButtonLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBoxProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityClearButtonLabel(value: String): Self = StObject.set(x, "accessibilityClearButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setNoResultText(value: String): Self = StObject.set(x, "noResultText", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: /* args */ EventValue => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* args */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnFocus(value: /* args */ EventFocusEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnSelect(value: /* args */ Item => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
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
