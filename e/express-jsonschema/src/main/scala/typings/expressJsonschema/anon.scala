package typings.expressJsonschema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instance extends StObject {
    
    var instance: js.Any = js.native
    
    var message: String = js.native
    
    var property: String = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(instance: js.Any, message: String, property: String): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Messages extends StObject {
    
    var messages: js.Array[String] = js.native
    
    var property: String = js.native
    
    var value: js.Any = js.native
  }
  object Messages {
    
    @scala.inline
    def apply(messages: js.Array[String], property: String, value: js.Any): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    @scala.inline
    implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
