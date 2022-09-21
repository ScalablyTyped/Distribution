package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDialogOptions extends StObject {
  
  var buttons: js.UndefOr[js.Array[dxButtonOptions]] = js.undefined
  
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var messageHtml: js.UndefOr[String] = js.undefined
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object CustomDialogOptions {
  
  inline def apply(): CustomDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDialogOptions]
  }
  
  extension [Self <: CustomDialogOptions](x: Self) {
    
    inline def setButtons(value: js.Array[dxButtonOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: dxButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageHtml(value: String): Self = StObject.set(x, "messageHtml", value.asInstanceOf[js.Any])
    
    inline def setMessageHtmlUndefined: Self = StObject.set(x, "messageHtml", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
