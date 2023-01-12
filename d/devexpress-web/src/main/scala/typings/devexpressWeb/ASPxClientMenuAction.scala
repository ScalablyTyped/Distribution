package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientMenuAction extends StObject {
  
  var clickAction: js.Function
  
  var container: String
  
  var disabled: Boolean
  
  var hasSeparator: Boolean
  
  var hotKey: ASPxClientMenuActionHotKey
  
  var imageClassName: String
  
  var imageTemplateName: String
  
  var text: String
  
  var visible: Boolean
}
object ASPxClientMenuAction {
  
  inline def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: Boolean,
    hotKey: ASPxClientMenuActionHotKey,
    imageClassName: String,
    imageTemplateName: String,
    text: String,
    visible: Boolean
  ): ASPxClientMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasSeparator = hasSeparator.asInstanceOf[js.Any], hotKey = hotKey.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageTemplateName = imageTemplateName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientMenuAction] (val x: Self) extends AnyVal {
    
    inline def setClickAction(value: js.Function): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHasSeparator(value: Boolean): Self = StObject.set(x, "hasSeparator", value.asInstanceOf[js.Any])
    
    inline def setHotKey(value: ASPxClientMenuActionHotKey): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
    
    inline def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    inline def setImageTemplateName(value: String): Self = StObject.set(x, "imageTemplateName", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
