package typings.fundamentalReact.anon

import typings.fundamentalReact.selectMod.Option
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> */
@js.native
trait PartialSelectProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var emptyAriaLabel: js.UndefOr[String] = js.native
  
  var formMessageProps: js.UndefOr[Record[String, _]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var includeEmptyOption: js.UndefOr[Boolean] = js.native
  
  var innerRefClassName: js.UndefOr[String] = js.native
  
  var listClassName: js.UndefOr[String] = js.native
  
  var listItemClassName: js.UndefOr[String] = js.native
  
  var listItemTextClassName: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onClick: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.native
  
  var onSelect: js.UndefOr[
    js.Function2[
      /* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], 
      /* selectedOption */ Option, 
      Unit
    ]
  ] = js.native
  
  var options: js.UndefOr[js.Array[Option]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popperClassName: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var referenceClassName: js.UndefOr[String] = js.native
  
  var selectedKey: js.UndefOr[String] = js.native
  
  var textContentClassName: js.UndefOr[String] = js.native
  
  var triggerClassName: js.UndefOr[String] = js.native
  
  var validationState: js.UndefOr[State] = js.native
  
  var wrapperProps: js.UndefOr[Record[String, _]] = js.native
}
object PartialSelectProps {
  
  @scala.inline
  def apply(): PartialSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectProps]
  }
  
  @scala.inline
  implicit class PartialSelectPropsMutableBuilder[Self <: PartialSelectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEmptyAriaLabel(value: String): Self = StObject.set(x, "emptyAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyAriaLabelUndefined: Self = StObject.set(x, "emptyAriaLabel", js.undefined)
    
    @scala.inline
    def setFormMessageProps(value: Record[String, _]): Self = StObject.set(x, "formMessageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMessagePropsUndefined: Self = StObject.set(x, "formMessageProps", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIncludeEmptyOption(value: Boolean): Self = StObject.set(x, "includeEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyOptionUndefined: Self = StObject.set(x, "includeEmptyOption", js.undefined)
    
    @scala.inline
    def setInnerRefClassName(value: String): Self = StObject.set(x, "innerRefClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefClassNameUndefined: Self = StObject.set(x, "innerRefClassName", js.undefined)
    
    @scala.inline
    def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
    
    @scala.inline
    def setListItemClassName(value: String): Self = StObject.set(x, "listItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemClassNameUndefined: Self = StObject.set(x, "listItemClassName", js.undefined)
    
    @scala.inline
    def setListItemTextClassName(value: String): Self = StObject.set(x, "listItemTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemTextClassNameUndefined: Self = StObject.set(x, "listItemTextClassName", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (/* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], /* selectedOption */ Option) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReferenceClassName(value: String): Self = StObject.set(x, "referenceClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceClassNameUndefined: Self = StObject.set(x, "referenceClassName", js.undefined)
    
    @scala.inline
    def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    
    @scala.inline
    def setTextContentClassName(value: String): Self = StObject.set(x, "textContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentClassNameUndefined: Self = StObject.set(x, "textContentClassName", js.undefined)
    
    @scala.inline
    def setTriggerClassName(value: String): Self = StObject.set(x, "triggerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerClassNameUndefined: Self = StObject.set(x, "triggerClassName", js.undefined)
    
    @scala.inline
    def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    
    @scala.inline
    def setWrapperProps(value: Record[String, _]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
  }
}
