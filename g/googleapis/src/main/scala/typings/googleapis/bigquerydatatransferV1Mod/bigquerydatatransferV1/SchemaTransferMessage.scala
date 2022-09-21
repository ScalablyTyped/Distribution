package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferMessage extends StObject {
  
  /**
    * Message text.
    */
  var messageText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when message was logged.
    */
  var messageTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message severity.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransferMessage {
  
  inline def apply(): SchemaTransferMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferMessage]
  }
  
  extension [Self <: SchemaTransferMessage](x: Self) {
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextNull: Self = StObject.set(x, "messageText", null)
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setMessageTime(value: String): Self = StObject.set(x, "messageTime", value.asInstanceOf[js.Any])
    
    inline def setMessageTimeNull: Self = StObject.set(x, "messageTime", null)
    
    inline def setMessageTimeUndefined: Self = StObject.set(x, "messageTime", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
