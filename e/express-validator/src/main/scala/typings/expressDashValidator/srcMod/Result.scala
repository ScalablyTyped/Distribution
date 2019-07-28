package typings.expressDashValidator.srcMod

import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.expressDashValidator.srcValidationDashResultMod.ErrorFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src", "Result")
@js.native
class Result[T] protected ()
  extends typings.expressDashValidator.srcValidationDashResultMod.Result[T] {
  def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
}

