package typings.expressDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcValidationDashResultMod {
  import typings.expressDashValidator.srcBaseMod.Request
  import typings.expressDashValidator.srcBaseMod.ValidationError

  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
}
