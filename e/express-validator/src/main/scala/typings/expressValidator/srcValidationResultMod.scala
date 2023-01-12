package typings.expressValidator

import typings.expressValidator.anon.OnlyFirstError
import typings.expressValidator.anon.WithDefaults
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.ValidationError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcValidationResultMod {
  
  @JSImport("express-validator/src/validation-result", "Result")
  @js.native
  open class Result[T] protected () extends StObject {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
    
    def array(): js.Array[T] = js.native
    def array(options: OnlyFirstError): js.Array[T] = js.native
    
    /* private */ val errors: Any = js.native
    
    def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
    
    /* private */ var formatter: Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def mapped(): Record[String, T] = js.native
    
    def `throw`(): Unit = js.native
  }
  
  @JSImport("express-validator/src/validation-result", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] & WithDefaults = js.native
  
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
  
  trait ResultFactoryBuilderOptions[T] extends StObject {
    
    def formatter(error: ValidationError): T
    @JSName("formatter")
    var formatter_Original: ErrorFormatter[T]
  }
  object ResultFactoryBuilderOptions {
    
    inline def apply[T](formatter: /* error */ ValidationError => T): ResultFactoryBuilderOptions[T] = {
      val __obj = js.Dynamic.literal(formatter = js.Any.fromFunction1(formatter))
      __obj.asInstanceOf[ResultFactoryBuilderOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultFactoryBuilderOptions[?], T] (val x: Self & ResultFactoryBuilderOptions[T]) extends AnyVal {
      
      inline def setFormatter(value: /* error */ ValidationError => T): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    }
  }
}
