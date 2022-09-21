package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonText extends StObject {
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var checkboxChecked: js.UndefOr[Boolean] = js.undefined
  
  var messageDefaultValue: js.UndefOr[String] = js.undefined
  
  var messageKey: String
  
  var msgTitleDefault: js.UndefOr[String] = js.undefined
  
  var msgTitleKey: String
  
  var position: js.UndefOr[String] = js.undefined
}
object ButtonText {
  
  inline def apply(messageKey: String, msgTitleKey: String): ButtonText = {
    val __obj = js.Dynamic.literal(messageKey = messageKey.asInstanceOf[js.Any], msgTitleKey = msgTitleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
  
  extension [Self <: ButtonText](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
    
    inline def setCheckboxCheckedUndefined: Self = StObject.set(x, "checkboxChecked", js.undefined)
    
    inline def setMessageDefaultValue(value: String): Self = StObject.set(x, "messageDefaultValue", value.asInstanceOf[js.Any])
    
    inline def setMessageDefaultValueUndefined: Self = StObject.set(x, "messageDefaultValue", js.undefined)
    
    inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMsgTitleDefault(value: String): Self = StObject.set(x, "msgTitleDefault", value.asInstanceOf[js.Any])
    
    inline def setMsgTitleDefaultUndefined: Self = StObject.set(x, "msgTitleDefault", js.undefined)
    
    inline def setMsgTitleKey(value: String): Self = StObject.set(x, "msgTitleKey", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
