package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxColorBoxOptions
  extends StObject
     with dxDropDownEditorOptions[dxColorBox] {
  
  /**
    * Specifies the text displayed on the button that applies changes and closes the drop-down editor.
    */
  var applyButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed on the button that cancels changes and closes the drop-down editor.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the drop-down field which holds the content.
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxColorBoxOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies whether or not the UI component value includes the alpha channel component.
    */
  var editAlphaChannel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for the input field. Must contain the TextBox UI component.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* value */ String, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the size of a step by which a handle is moved using a keyboard shortcut.
    */
  var keyStep: js.UndefOr[Double] = js.undefined
}
object dxColorBoxOptions {
  
  inline def apply(): dxColorBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxColorBoxOptions]
  }
  
  extension [Self <: dxColorBoxOptions](x: Self) {
    
    inline def setApplyButtonText(value: String): Self = StObject.set(x, "applyButtonText", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonTextUndefined: Self = StObject.set(x, "applyButtonText", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setEditAlphaChannel(value: Boolean): Self = StObject.set(x, "editAlphaChannel", value.asInstanceOf[js.Any])
    
    inline def setEditAlphaChannelUndefined: Self = StObject.set(x, "editAlphaChannel", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* value */ String, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* value */ String, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setKeyStep(value: Double): Self = StObject.set(x, "keyStep", value.asInstanceOf[js.Any])
    
    inline def setKeyStepUndefined: Self = StObject.set(x, "keyStep", js.undefined)
  }
}
