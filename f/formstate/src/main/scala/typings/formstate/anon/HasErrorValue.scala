package typings.formstate.anon

import typings.formstate.formStateMod.ValidatableMapOrArray
import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasErrorValue[TValue /* <: ValidatableMapOrArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object HasErrorValue {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): HasErrorValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrorValue[TValue]]
  }
}

