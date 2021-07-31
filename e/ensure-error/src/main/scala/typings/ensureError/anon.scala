package typings.ensureError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ensure-error.ensure-error.ErrorWithStack<std.Error> */
  trait ErrorWithStackError extends StObject {
    
    var message: String
    
    var name: String
    
    var stack: js.UndefOr[String] & String
  }
  object ErrorWithStackError {
    
    @scala.inline
    def apply(message: String, name: String, stack: js.UndefOr[String] & String): ErrorWithStackError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithStackError]
    }
    
    @scala.inline
    implicit class ErrorWithStackErrorMutableBuilder[Self <: ErrorWithStackError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.UndefOr[String] & String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stack extends StObject {
    
    var stack: String
  }
  object Stack {
    
    @scala.inline
    def apply(stack: String): Stack = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stack]
    }
    
    @scala.inline
    implicit class StackMutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
