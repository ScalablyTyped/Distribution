package typings.expressValidator

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
    
    /**
      * Gets the validation errors as an array.
      *
      * @param options.onlyFirstError whether only the first error of each
      */
    def array(): js.Array[T] = js.native
    def array(options: ToArrayOptions): js.Array[T] = js.native
    
    /* private */ val errors: Any = js.native
    
    /**
      * Specifies a function to format errors with.
      * @param formatter the function to use for formatting errors
      * @returns A new {@link Result} instance with the given formatter
      */
    def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
    
    /* private */ var formatter: Any = js.native
    
    /**
      * @returns `true` if there are no errors, `false` otherwise
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Gets the validation errors as an object.
      * If a field has more than one error, only the first one is set in the resulting object.
      *
      * @returns an object from field name to error
      */
    def mapped(): Record[String, T] = js.native
    
    /**
      * Throws an error if there are validation errors.
      */
    def `throw`(): Unit = js.native
  }
  
  @JSImport("express-validator/src/validation-result", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] & WithDefaults = js.native
  
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
  
  trait ResultFactoryBuilderOptions[T] extends StObject {
    
    /**
      * The default error formatter of every {@link Result} instance returned by
      * the custom `validationResult()` function.
      */
    def formatter(error: ValidationError): T
    /**
      * The default error formatter of every {@link Result} instance returned by
      * the custom `validationResult()` function.
      */
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
  
  trait ToArrayOptions extends StObject {
    
    /**
      * Whether only the first error of each field should be returned.
      * @default false
      */
    var onlyFirstError: js.UndefOr[Boolean] = js.undefined
  }
  object ToArrayOptions {
    
    inline def apply(): ToArrayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToArrayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToArrayOptions] (val x: Self) extends AnyVal {
      
      inline def setOnlyFirstError(value: Boolean): Self = StObject.set(x, "onlyFirstError", value.asInstanceOf[js.Any])
      
      inline def setOnlyFirstErrorUndefined: Self = StObject.set(x, "onlyFirstError", js.undefined)
    }
  }
}
