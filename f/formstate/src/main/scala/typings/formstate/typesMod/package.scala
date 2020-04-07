package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ValidationResponse = js.UndefOr[java.lang.String | scala.Null | typings.formstate.formstateBooleans.`false`]
  type Validator[TValue] = js.Function1[/* value */ TValue, typings.formstate.typesMod.ValidatorResponse]
  type ValidatorResponse = typings.formstate.typesMod.ValidationResponse | js.Promise[typings.formstate.typesMod.ValidationResponse]
}
