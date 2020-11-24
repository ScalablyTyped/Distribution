package typings.fundamentalReact.anon

import typings.fundamentalReact.selectMod.Option
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Validator
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> */
@js.native
trait WeakValidationMapSelectPr extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var emptyAriaLabel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var formMessageProps: js.UndefOr[Validator[js.UndefOr[Null | (Record[String, _])]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var includeEmptyOption: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var innerRefClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listItemClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listItemTextClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var onBlur: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ FocusEvent[HTMLDivElement], Unit]) | Null]]
  ] = js.native
  
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
      ]
    ]
  ] = js.native
  
  var onSelect: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          KeyboardEvent[HTMLLIElement] | (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]), 
          /* selectedOption */ Option, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.native
  
  var options: js.UndefOr[Validator[js.UndefOr[js.Array[Option] | Null]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var popperClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var referenceClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var selectedKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var textContentClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var triggerClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var validationState: js.UndefOr[Validator[js.UndefOr[Null | State]]] = js.native
  
  var wrapperProps: js.UndefOr[Validator[js.UndefOr[Null | (Record[String, _])]]] = js.native
}
object WeakValidationMapSelectPr {
  
  @scala.inline
  def apply(): WeakValidationMapSelectPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSelectPr]
  }
  
  @scala.inline
  implicit class WeakValidationMapSelectPrOps[Self <: WeakValidationMapSelectPr] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEmptyAriaLabel(value: Validator[js.UndefOr[Null | String]]): Self = this.set("emptyAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyAriaLabel: Self = this.set("emptyAriaLabel", js.undefined)
    
    @scala.inline
    def setFormMessageProps(value: Validator[js.UndefOr[Null | (Record[String, _])]]): Self = this.set("formMessageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormMessageProps: Self = this.set("formMessageProps", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIncludeEmptyOption(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("includeEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmptyOption: Self = this.set("includeEmptyOption", js.undefined)
    
    @scala.inline
    def setInnerRefClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("innerRefClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRefClassName: Self = this.set("innerRefClassName", js.undefined)
    
    @scala.inline
    def setListClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListClassName: Self = this.set("listClassName", js.undefined)
    
    @scala.inline
    def setListItemClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("listItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemClassName: Self = this.set("listItemClassName", js.undefined)
    
    @scala.inline
    def setListItemTextClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("listItemTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemTextClassName: Self = this.set("listItemTextClassName", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[(js.Function1[/* event */ FocusEvent[HTMLDivElement], Unit]) | Null]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
          ]
        ]
    ): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              KeyboardEvent[HTMLLIElement] | (typings.react.mod.MouseEvent[HTMLLIElement, NativeMouseEvent]), 
              /* selectedOption */ Option, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOptions(value: Validator[js.UndefOr[js.Array[Option] | Null]]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopperClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperClassName: Self = this.set("popperClassName", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReferenceClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("referenceClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceClassName: Self = this.set("referenceClassName", js.undefined)
    
    @scala.inline
    def setSelectedKey(value: Validator[js.UndefOr[Null | String]]): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
    
    @scala.inline
    def setTextContentClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("textContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentClassName: Self = this.set("textContentClassName", js.undefined)
    
    @scala.inline
    def setTriggerClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("triggerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerClassName: Self = this.set("triggerClassName", js.undefined)
    
    @scala.inline
    def setValidationState(value: Validator[js.UndefOr[Null | State]]): Self = this.set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
    
    @scala.inline
    def setWrapperProps(value: Validator[js.UndefOr[Null | (Record[String, _])]]): Self = this.set("wrapperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperProps: Self = this.set("wrapperProps", js.undefined)
  }
}
