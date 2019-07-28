package typings.expressDashValidator.srcValidationDashResultMod

import typings.expressDashValidator.Anon_OnlyFirstError
import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/validation-result", "Result")
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

