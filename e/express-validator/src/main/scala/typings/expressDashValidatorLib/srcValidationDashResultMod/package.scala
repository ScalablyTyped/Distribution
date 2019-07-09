package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcValidationDashResultMod {
  type ErrorFormatter[T] = js.Function1[/* error */ expressDashValidatorLib.srcBaseMod.ValidationError, T]
  type ResultFactory[T] = js.Function1[/* req */ expressDashValidatorLib.srcBaseMod.Request, Result[T]]
}
