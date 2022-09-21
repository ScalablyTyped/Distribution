package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ApplyValueMode
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownPredefinedButton
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDropDownEditorOptions[TComponent]
  extends StObject
     with dxTextBoxOptions[TComponent] {
  
  /**
    * Specifies whether or not the UI component allows an end-user to enter a custom value.
    */
  var acceptCustomValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the way an end-user applies the selected value.
    */
  var applyValueMode: js.UndefOr[ApplyValueMode] = js.undefined
  
  /**
    * Allows you to add custom buttons to the input text field.
    */
  @JSName("buttons")
  var buttons_dxDropDownEditorOptions: js.UndefOr[js.Array[DropDownPredefinedButton | dxTextEditorButton]] = js.undefined
  
  /**
    * Specifies whether to render the drop-down field&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for the drop-down button.
    */
  var dropDownButtonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ DropDownButtonTemplateDataModel, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures the drop-down field which holds the content.
    */
  var dropDownOptions: js.UndefOr[Properties | typings.devextreme.mod.DevExpress.ui.dxPopover.Properties] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * Specifies whether a user can open the drop-down list by clicking a text field.
    */
  var openOnFieldClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the drop-down editor is displayed.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the drop-down button is visible.
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
}
object dxDropDownEditorOptions {
  
  inline def apply[TComponent](): dxDropDownEditorOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownEditorOptions[TComponent]]
  }
  
  extension [Self <: dxDropDownEditorOptions[?], TComponent](x: Self & dxDropDownEditorOptions[TComponent]) {
    
    inline def setAcceptCustomValue(value: Boolean): Self = StObject.set(x, "acceptCustomValue", value.asInstanceOf[js.Any])
    
    inline def setAcceptCustomValueUndefined: Self = StObject.set(x, "acceptCustomValue", js.undefined)
    
    inline def setApplyValueMode(value: ApplyValueMode): Self = StObject.set(x, "applyValueMode", value.asInstanceOf[js.Any])
    
    inline def setApplyValueModeUndefined: Self = StObject.set(x, "applyValueMode", js.undefined)
    
    inline def setButtons(value: js.Array[DropDownPredefinedButton | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (DropDownPredefinedButton | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDropDownButtonTemplate(
      value: template | (js.Function2[
          /* buttonData */ DropDownButtonTemplateDataModel, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dropDownButtonTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownButtonTemplateFunction2(
      value: (/* buttonData */ DropDownButtonTemplateDataModel, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dropDownButtonTemplate", js.Any.fromFunction2(value))
    
    inline def setDropDownButtonTemplateUndefined: Self = StObject.set(x, "dropDownButtonTemplate", js.undefined)
    
    inline def setDropDownOptions(value: Properties | typings.devextreme.mod.DevExpress.ui.dxPopover.Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setOnClosed(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnOpened(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOpenOnFieldClick(value: Boolean): Self = StObject.set(x, "openOnFieldClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFieldClickUndefined: Self = StObject.set(x, "openOnFieldClick", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setShowDropDownButton(value: Boolean): Self = StObject.set(x, "showDropDownButton", value.asInstanceOf[js.Any])
    
    inline def setShowDropDownButtonUndefined: Self = StObject.set(x, "showDropDownButton", js.undefined)
  }
}
