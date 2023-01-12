package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorPredefinedToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies values for a format with multiple choices. Should be used with the name.
    */
  var acceptedValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  /**
    * Specifies the predefined item that this object customizes or a format with multiple choices.
    * @deprecated Use name instead.
    */
  var formatName: js.UndefOr[HtmlEditorPredefinedToolbarItem | String] = js.undefined
  
  /**
    * Specifies values for a format with multiple choices.
    * @deprecated Use acceptedValues instead.
    */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  /**
    * Specifies the predefined item that this object customizes or a format with multiple choices.
    */
  var name: js.UndefOr[HtmlEditorPredefinedToolbarItem | String] = js.undefined
}
object dxHtmlEditorToolbarItem {
  
  inline def apply(): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorToolbarItem] (val x: Self) extends AnyVal {
    
    inline def setAcceptedValues(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "acceptedValues", value.asInstanceOf[js.Any])
    
    inline def setAcceptedValuesUndefined: Self = StObject.set(x, "acceptedValues", js.undefined)
    
    inline def setAcceptedValuesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "acceptedValues", js.Array(value*))
    
    inline def setFormatName(value: HtmlEditorPredefinedToolbarItem | String): Self = StObject.set(x, "formatName", value.asInstanceOf[js.Any])
    
    inline def setFormatNameUndefined: Self = StObject.set(x, "formatName", js.undefined)
    
    inline def setFormatValues(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "formatValues", value.asInstanceOf[js.Any])
    
    inline def setFormatValuesUndefined: Self = StObject.set(x, "formatValues", js.undefined)
    
    inline def setFormatValuesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "formatValues", js.Array(value*))
    
    inline def setName(value: HtmlEditorPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
