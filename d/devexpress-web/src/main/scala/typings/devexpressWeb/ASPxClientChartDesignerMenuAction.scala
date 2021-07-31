package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientChartDesignerMenuAction extends StObject {
  
  var clickAction: js.Function
  
  var container: String
  
  var disabled: Boolean
  
  var hasSeparator: String
  
  var hotKey: String
  
  var imageClassName: String
  
  var text: String
  
  var visible: Boolean
}
object ASPxClientChartDesignerMenuAction {
  
  @scala.inline
  def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: String,
    hotKey: String,
    imageClassName: String,
    text: String,
    visible: Boolean
  ): ASPxClientChartDesignerMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasSeparator = hasSeparator.asInstanceOf[js.Any], hotKey = hotKey.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerMenuAction]
  }
  
  @scala.inline
  implicit class ASPxClientChartDesignerMenuActionMutableBuilder[Self <: ASPxClientChartDesignerMenuAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickAction(value: js.Function): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSeparator(value: String): Self = StObject.set(x, "hasSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotKey(value: String): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
