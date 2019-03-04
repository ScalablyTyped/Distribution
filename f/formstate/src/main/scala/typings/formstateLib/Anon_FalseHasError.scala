package typings
package formstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseHasError[TValue /* <: formstateLib.libCoreFormStateMod.ValidatableMapOrArray */] extends js.Object {
  var hasError: formstateLib.formstateLibNumbers.`false`
  var value: TValue
}

object Anon_FalseHasError {
  @scala.inline
  def apply[TValue /* <: formstateLib.libCoreFormStateMod.ValidatableMapOrArray */](hasError: formstateLib.formstateLibNumbers.`false`, value: TValue): Anon_FalseHasError[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FalseHasError[TValue]]
  }
}

