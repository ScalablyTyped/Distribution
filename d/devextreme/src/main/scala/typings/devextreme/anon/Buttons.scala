package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buttons extends StObject {
  
  var buttons: js.UndefOr[js.Array[dxButtonOptions]] = js.native
  
  var dragEnabled: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var messageHtml: js.UndefOr[String] = js.native
  
  var showTitle: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Buttons {
  
  @scala.inline
  def apply(): Buttons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[dxButtonOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: dxButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHtml(value: String): Self = StObject.set(x, "messageHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHtmlUndefined: Self = StObject.set(x, "messageHtml", js.undefined)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
