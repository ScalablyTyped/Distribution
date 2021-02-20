package typings.ensureError

import typings.ensureError.anon.ErrorWithStackError
import typings.ensureError.anon.Stack
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Ensures a value is a valid error by making it one if not.
  If `input` is an `Error`, any missing `Error` properties will be added.
  If it's not an `Error`, `input` is converted to an `Error`.
  @example
  ```
  import ensureError = require('ensure-error');
  const error = new TypeError('🦄');
  error.name = '';
  console.log(error.name);
  //=> ''
  console.log(ensureError(error).name);
  //=> 'TypeError'
  console.log(ensureError(10));
  //=> [NonError: 10]
  ```
  */
  @JSImport("ensure-error", JSImport.Namespace)
  @js.native
  def apply[T](input: T): IfAny[T, ErrorWithStackError, NonError | ErrorWithStack[T]] = js.native
  
  type ErrorWithStack[T] = T with Stack
  
  // IfAny<T, ThenType, ElseType> resolves to ThenType if T is `any` and resolves to ElseType otherwise
  // https://stackoverflow.com/a/49928360/4135063
  type IfAny[T, ThenType, ElseType] = ElseType | ThenType
  
  @js.native
  trait NonError extends Error {
    
    @JSName("name")
    var name_NonError: typings.ensureError.ensureErrorStrings.NonError = js.native
    
    @JSName("stack")
    var stack_NonError: String = js.native
  }
  object NonError {
    
    @scala.inline
    def apply(message: String, name: typings.ensureError.ensureErrorStrings.NonError, stack: String): NonError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonError]
    }
    
    @scala.inline
    implicit class NonErrorMutableBuilder[Self <: NonError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.ensureError.ensureErrorStrings.NonError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
