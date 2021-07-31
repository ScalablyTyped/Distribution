package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: String
  
  var puppeteerVersion: js.Any
  
  var ready: Boolean
}
object Message {
  
  @scala.inline
  def apply(message: String, puppeteerVersion: js.Any, ready: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], puppeteerVersion = puppeteerVersion.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuppeteerVersion(value: js.Any): Self = StObject.set(x, "puppeteerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
  }
}
