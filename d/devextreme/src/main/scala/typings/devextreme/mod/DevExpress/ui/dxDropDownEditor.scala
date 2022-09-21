package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownEditor[TProperties]
  extends StObject
     with dxTextEditor[TProperties] {
  
  /**
    * Closes the drop-down editor.
    */
  def close(): Unit = js.native
  
  /**
    * Gets the popup window&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Gets the UI component&apos;s `` element.
    */
  def field(): DxElement_[HTMLElement] = js.native
  
  /**
    * Opens the drop-down editor.
    */
  def open(): Unit = js.native
}
object dxDropDownEditor {
  
  trait DropDownButtonTemplateDataModel extends StObject {
    
    val icon: js.UndefOr[String] = js.undefined
    
    val text: js.UndefOr[String] = js.undefined
  }
  object DropDownButtonTemplateDataModel {
    
    inline def apply(): DropDownButtonTemplateDataModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownButtonTemplateDataModel]
    }
    
    extension [Self <: DropDownButtonTemplateDataModel](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.clear
    - typings.devextreme.devextremeStrings.dropDown
  */
  trait DropDownPredefinedButton extends StObject
  object DropDownPredefinedButton {
    
    inline def clear: typings.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typings.devextreme.devextremeStrings.clear]
    
    inline def dropDown: typings.devextreme.devextremeStrings.dropDown = "dropDown".asInstanceOf[typings.devextreme.devextremeStrings.dropDown]
  }
}
