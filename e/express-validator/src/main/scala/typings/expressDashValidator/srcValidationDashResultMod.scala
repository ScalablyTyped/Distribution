package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/validation-result", JSImport.Namespace)
@js.native
object srcValidationDashResultMod extends js.Object {
  @js.native
  class Result[T] protected () extends js.Object {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
    val errors: js.Any = js.native
    var formatter: js.Any = js.native
    def array(): js.Array[T] = js.native
    def array(options: Anon_OnlyFirstError): js.Array[T] = js.native
    def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
    def isEmpty(): Boolean = js.native
    def mapped(): Record[String, T] = js.native
    def `throw`(): Unit = js.native
  }
  
  @js.native
  trait ResultFactoryBuilderOptions[T] extends js.Object {
    @JSName("formatter")
    var formatter_Original: ErrorFormatter[T] = js.native
    def formatter(error: ValidationError): T = js.native
  }
  
  val validationResult: ResultFactory[ValidationError] with Anon_WithDefaults = js.native
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
}

