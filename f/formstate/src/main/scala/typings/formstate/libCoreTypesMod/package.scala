package typings.formstate

import typings.formstate.formstateNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreTypesMod {
  type ValidationResponse = js.UndefOr[String | Null | `false`]
  type Validator[TValue] = js.Function1[/* value */ TValue, ValidatorResponse]
  type ValidatorResponse = ValidationResponse | js.Promise[ValidationResponse]
}
