package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerDialogModel extends StObject {
  
  def getUrl(): String
  
  def onShow(tab: ASPxDesignerNavigateTab): Unit
  
  var popupButtons: js.Array[Any]
  
  def setUrl(url: String): Unit
}
object ASPxDesignerDialogModel {
  
  inline def apply(
    getUrl: () => String,
    onShow: ASPxDesignerNavigateTab => Unit,
    popupButtons: js.Array[Any],
    setUrl: String => Unit
  ): ASPxDesignerDialogModel = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction0(getUrl), onShow = js.Any.fromFunction1(onShow), popupButtons = popupButtons.asInstanceOf[js.Any], setUrl = js.Any.fromFunction1(setUrl))
    __obj.asInstanceOf[ASPxDesignerDialogModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerDialogModel] (val x: Self) extends AnyVal {
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setOnShow(value: ASPxDesignerNavigateTab => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setPopupButtons(value: js.Array[Any]): Self = StObject.set(x, "popupButtons", value.asInstanceOf[js.Any])
    
    inline def setPopupButtonsVarargs(value: Any*): Self = StObject.set(x, "popupButtons", js.Array(value*))
    
    inline def setSetUrl(value: String => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
  }
}
