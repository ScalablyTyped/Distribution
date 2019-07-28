package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcBaseMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcValidationDashResultMod {
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
}
