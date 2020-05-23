package typings.formstate.typesMod

import typings.formstate.anon.HasError
import typings.formstate.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validatable[TValue] extends js.Object {
  @JSName("$")
  var $: TValue
  var error: js.UndefOr[String | Null] = js.undefined
  var hasError: Boolean
  var validating: Boolean
  def disableAutoValidation(): Unit
  def enableAutoValidation(): Unit
  def validate(): js.Promise[HasError | Value[TValue]]
}

object Validatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    validate: () => js.Promise[HasError | Value[TValue]],
    validating: Boolean,
    error: js.UndefOr[Null | String] = js.undefined
  ): Validatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validatable[TValue]]
  }
}

