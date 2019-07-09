package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator", "Result")
@js.native
class Result[T] protected ()
  extends expressDashValidatorLib.srcValidationDashResultMod.Result[T] {
  def this(formatter: expressDashValidatorLib.srcValidationDashResultMod.ErrorFormatter[T], errors: js.Array[expressDashValidatorLib.srcBaseMod.ValidationError]) = this()
}

