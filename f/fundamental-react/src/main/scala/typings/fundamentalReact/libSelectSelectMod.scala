package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.anon.DisplayName
import typings.fundamentalReact.anon.SelectedKey
import typings.fundamentalReact.anon.State
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectSelectMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Select/Select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ SelectProps[String] & SelectedKey[String], Element]) & DisplayName = js.native
  
  trait Option[T /* <: String */] extends StObject {
    
    var key: T
    
    var text: String
  }
  object Option {
    
    inline def apply[T /* <: String */](key: T, text: String): Option[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option[?], T /* <: String */] (val x: Self & Option[T]) extends AnyVal {
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectProps[T /* <: String */] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var emptyAriaLabel: js.UndefOr[String] = js.undefined
    
    var formMessageProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var includeEmptyOption: js.UndefOr[Boolean] = js.undefined
    
    var innerRefClassName: js.UndefOr[String] = js.undefined
    
    var listClassName: js.UndefOr[String] = js.undefined
    
    var listItemClassName: js.UndefOr[String] = js.undefined
    
    var listItemTextClassName: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, typings.std.Element], Unit]] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[
          /* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], 
          /* selectedOption */ Option[T], 
          Unit
        ]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[Option[T]]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var referenceClassName: js.UndefOr[String] = js.undefined
    
    var selectedKey: js.UndefOr[T] = js.undefined
    
    var textContentClassName: js.UndefOr[String] = js.undefined
    
    var triggerClassName: js.UndefOr[String] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
    
    var wrapperProps: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object SelectProps {
    
    inline def apply[T /* <: String */](): SelectProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectProps[?], T /* <: String */] (val x: Self & SelectProps[T]) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmptyAriaLabel(value: String): Self = StObject.set(x, "emptyAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setEmptyAriaLabelUndefined: Self = StObject.set(x, "emptyAriaLabel", js.undefined)
      
      inline def setFormMessageProps(value: Record[String, Any]): Self = StObject.set(x, "formMessageProps", value.asInstanceOf[js.Any])
      
      inline def setFormMessagePropsUndefined: Self = StObject.set(x, "formMessageProps", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncludeEmptyOption(value: Boolean): Self = StObject.set(x, "includeEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyOptionUndefined: Self = StObject.set(x, "includeEmptyOption", js.undefined)
      
      inline def setInnerRefClassName(value: String): Self = StObject.set(x, "innerRefClassName", value.asInstanceOf[js.Any])
      
      inline def setInnerRefClassNameUndefined: Self = StObject.set(x, "innerRefClassName", js.undefined)
      
      inline def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      inline def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      inline def setListItemClassName(value: String): Self = StObject.set(x, "listItemClassName", value.asInstanceOf[js.Any])
      
      inline def setListItemClassNameUndefined: Self = StObject.set(x, "listItemClassName", js.undefined)
      
      inline def setListItemTextClassName(value: String): Self = StObject.set(x, "listItemTextClassName", value.asInstanceOf[js.Any])
      
      inline def setListItemTextClassNameUndefined: Self = StObject.set(x, "listItemTextClassName", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnSelect(
        value: (/* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], /* selectedOption */ Option[T]) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[Option[T]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Option[T]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReferenceClassName(value: String): Self = StObject.set(x, "referenceClassName", value.asInstanceOf[js.Any])
      
      inline def setReferenceClassNameUndefined: Self = StObject.set(x, "referenceClassName", js.undefined)
      
      inline def setSelectedKey(value: T): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setTextContentClassName(value: String): Self = StObject.set(x, "textContentClassName", value.asInstanceOf[js.Any])
      
      inline def setTextContentClassNameUndefined: Self = StObject.set(x, "textContentClassName", js.undefined)
      
      inline def setTriggerClassName(value: String): Self = StObject.set(x, "triggerClassName", value.asInstanceOf[js.Any])
      
      inline def setTriggerClassNameUndefined: Self = StObject.set(x, "triggerClassName", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setWrapperProps(value: Record[String, Any]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
    }
  }
  
  type _To = (js.Function1[/* props */ SelectProps[String] & SelectedKey[String], Element]) & DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `libSelectSelectMod.foo` */
  override def _to: (js.Function1[/* props */ SelectProps[String] & SelectedKey[String], Element]) & DisplayName = default
}
