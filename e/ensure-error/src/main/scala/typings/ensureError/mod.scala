package typings.ensureError

import typings.ensureError.anon.ErrorWithStackError
import typings.ensureError.anon.Stack
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ensure-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](input: T): IfAny[
    T, 
    ErrorWithStackError, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Error ? ensure-error.ensure-error.ErrorWithStack<T> : ensure-error.ensure-error.NonError */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[IfAny[
    T, 
    ErrorWithStackError, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Error ? ensure-error.ensure-error.ErrorWithStack<T> : ensure-error.ensure-error.NonError */ js.Any
  ]]
  
  type ErrorWithStack[T] = T & Stack
  
  // IfAny<T, ThenType, ElseType> resolves to ThenType if T is `any` and resolves to ElseType otherwise
  // https://stackoverflow.com/a/49928360/4135063
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    0 extends 1 & T ? ThenType : ElseType
    }}}
    */
  type IfAny[T, ThenType, ElseType] = ThenType
  
  trait NonError
    extends StObject
       with Error {
    
    @JSName("name")
    var name_NonError: typings.ensureError.ensureErrorStrings.NonError
    
    @JSName("stack")
    var stack_NonError: String
  }
  object NonError {
    
    inline def apply(message: String, stack: String): NonError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "NonError", stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonError]
    }
    
    extension [Self <: NonError](x: Self) {
      
      inline def setName(value: typings.ensureError.ensureErrorStrings.NonError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
