package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialSelectProps
import typings.fundamentalReact.anon.State
import typings.fundamentalReact.anon.WeakValidationMapSelectPr
import typings.fundamentalReact.fundamentalReactStrings.Select
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> & {  displayName :'Select'} */
  object default {
    
    inline def apply(props: SelectProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: SelectProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Select/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Select/Select", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Select/Select", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSelectProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSelectProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Select/Select", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Select | String] = js.native
    inline def displayName_=(x: js.UndefOr[Select | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Select/Select", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSelectPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSelectPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait Option extends StObject {
    
    var key: String
    
    var text: String
  }
  object Option {
    
    inline def apply(key: String, text: String): Option = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectProps extends StObject {
    
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
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[
          /* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], 
          /* selectedOption */ Option, 
          Unit
        ]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[Option]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var referenceClassName: js.UndefOr[String] = js.undefined
    
    var selectedKey: js.UndefOr[String] = js.undefined
    
    var textContentClassName: js.UndefOr[String] = js.undefined
    
    var triggerClassName: js.UndefOr[String] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
    
    var wrapperProps: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object SelectProps {
    
    inline def apply(): SelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
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
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnSelect(
        value: (/* event */ (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]) | KeyboardEvent[HTMLLIElement], /* selectedOption */ Option) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReferenceClassName(value: String): Self = StObject.set(x, "referenceClassName", value.asInstanceOf[js.Any])
      
      inline def setReferenceClassNameUndefined: Self = StObject.set(x, "referenceClassName", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
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
}
