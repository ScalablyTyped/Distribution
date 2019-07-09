package typings
package expressDashValidatorLib.srcValidationDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/validation-result", "Result")
@js.native
class Result[T] protected () extends js.Object {
  def this(formatter: ErrorFormatter[T], errors: js.Array[expressDashValidatorLib.srcBaseMod.ValidationError]) = this()
  val errors: js.Any = js.native
  var formatter: js.Any = js.native
  def array(): js.Array[T] = js.native
  def array(options: expressDashValidatorLib.Anon_OnlyFirstError): js.Array[T] = js.native
  def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
  def isEmpty(): scala.Boolean = js.native
  def mapped(): stdLib.Record[java.lang.String, T] = js.native
  def `throw`(): scala.Unit = js.native
}

