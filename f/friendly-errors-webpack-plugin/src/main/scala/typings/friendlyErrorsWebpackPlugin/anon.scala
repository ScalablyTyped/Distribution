package typings.friendlyErrorsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Messages extends StObject {
    
    var messages: js.Array[String] = js.native
    
    var notes: js.Array[String] = js.native
  }
  object Messages {
    
    @scala.inline
    def apply(messages: js.Array[String], notes: js.Array[String]): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    @scala.inline
    implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value :_*))
    }
  }
}
