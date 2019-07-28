package typings.formstate

import typings.formstate.formstateNumbers.`false`
import typings.formstate.libCoreFormStateLazyMod.ValidatableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseHasErrorValue[TValue /* <: ValidatableArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object Anon_FalseHasErrorValue {
  @scala.inline
  def apply[TValue /* <: ValidatableArray */](hasError: `false`, value: TValue): Anon_FalseHasErrorValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FalseHasErrorValue[TValue]]
  }
}

