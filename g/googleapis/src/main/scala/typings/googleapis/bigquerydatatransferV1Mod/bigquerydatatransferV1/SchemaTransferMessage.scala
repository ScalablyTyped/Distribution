package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user facing message for a particular data transfer run.
  */
trait SchemaTransferMessage extends StObject {
  
  /**
    * Message text.
    */
  var messageText: js.UndefOr[String] = js.undefined
  
  /**
    * Time when message was logged.
    */
  var messageTime: js.UndefOr[String] = js.undefined
  
  /**
    * Message severity.
    */
  var severity: js.UndefOr[String] = js.undefined
}
object SchemaTransferMessage {
  
  @scala.inline
  def apply(): SchemaTransferMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferMessage]
  }
  
  @scala.inline
  implicit class SchemaTransferMessageMutableBuilder[Self <: SchemaTransferMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    @scala.inline
    def setMessageTime(value: String): Self = StObject.set(x, "messageTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTimeUndefined: Self = StObject.set(x, "messageTime", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
