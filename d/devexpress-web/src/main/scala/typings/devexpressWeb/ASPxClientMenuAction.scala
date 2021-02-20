package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientMenuAction extends StObject {
  
  var clickAction: js.Function = js.native
  
  var container: String = js.native
  
  var disabled: Boolean = js.native
  
  var hasSeparator: Boolean = js.native
  
  var hotKey: ASPxClientMenuActionHotKey = js.native
  
  var imageClassName: String = js.native
  
  var imageTemplateName: String = js.native
  
  var text: String = js.native
  
  var visible: Boolean = js.native
}
object ASPxClientMenuAction {
  
  @scala.inline
  def apply(
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
  implicit class ASPxClientMenuActionMutableBuilder[Self <: ASPxClientMenuAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickAction(value: js.Function): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSeparator(value: Boolean): Self = StObject.set(x, "hasSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotKey(value: ASPxClientMenuActionHotKey): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTemplateName(value: String): Self = StObject.set(x, "imageTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
