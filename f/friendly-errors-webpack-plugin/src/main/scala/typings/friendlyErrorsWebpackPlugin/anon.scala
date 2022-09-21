package typings.friendlyErrorsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Messages extends StObject {
    
    var messages: js.Array[String]
    
    var notes: js.Array[String]
  }
  object Messages {
    
    inline def apply(messages: js.Array[String], notes: js.Array[String]): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value*))
    }
  }
}
