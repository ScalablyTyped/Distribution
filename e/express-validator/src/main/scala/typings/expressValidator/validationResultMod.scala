package typings.expressValidator

import typings.expressValidator.anon.OnlyFirstError
import typings.expressValidator.anon.WithDefaults
import typings.expressValidator.baseMod.Request
import typings.expressValidator.baseMod.ValidationError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationResultMod {
  
  @JSImport("express-validator/src/validation-result", "Result")
  @js.native
  class Result[T] protected () extends StObject {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
    
    def array(): js.Array[T] = js.native
    def array(options: OnlyFirstError): js.Array[T] = js.native
    
    val errors: js.Any = js.native
    
    def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
    
    var formatter: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def mapped(): Record[String, T] = js.native
    
    def `throw`(): Unit = js.native
  }
  
  @JSImport("express-validator/src/validation-result", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] with WithDefaults = js.native
  
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
  
  @js.native
  trait ResultFactoryBuilderOptions[T] extends StObject {
    
    def formatter(error: ValidationError): T = js.native
    @JSName("formatter")
    var formatter_Original: ErrorFormatter[T] = js.native
  }
}
