package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxTextBox.TextBoxType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTextBoxOptions[TComponent]
  extends StObject
     with dxTextEditorOptions[TComponent] {
  
  /**
    * Specifies the maximum number of characters you can enter into the textbox.
    */
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The &apos;mode&apos; attribute value of the actual HTML input element representing the text box.
    */
  var mode: js.UndefOr[TextBoxType] = js.undefined
  
  /**
    * Specifies a value the UI component displays.
    */
  @JSName("value")
  var value_dxTextBoxOptions: js.UndefOr[String] = js.undefined
}
object dxTextBoxOptions {
  
  inline def apply[TComponent](): dxTextBoxOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextBoxOptions[TComponent]]
  }
  
  extension [Self <: dxTextBoxOptions[?], TComponent](x: Self & dxTextBoxOptions[TComponent]) {
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMode(value: TextBoxType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
