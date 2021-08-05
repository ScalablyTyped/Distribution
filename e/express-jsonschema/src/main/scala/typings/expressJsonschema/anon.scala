package typings.expressJsonschema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Instance extends StObject {
    
    var instance: js.Any
    
    var message: String
    
    var property: String
  }
  object Instance {
    
    inline def apply(instance: js.Any, message: String, property: String): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait Messages extends StObject {
    
    var messages: js.Array[String]
    
    var property: String
    
    var value: js.Any
  }
  object Messages {
    
    inline def apply(messages: js.Array[String], property: String, value: js.Any): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
