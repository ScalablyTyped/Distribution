package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validatable[TValue] extends js.Object {
  @JSName("$")
  var $: TValue
  var error: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var hasError: scala.Boolean
  var validating: scala.Boolean
  def disableAutoValidation(): scala.Unit
  def enableAutoValidation(): scala.Unit
  def validate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]]
}

object Validatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    disableAutoValidation: () => scala.Unit,
    enableAutoValidation: () => scala.Unit,
    hasError: scala.Boolean,
    validate: () => js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]],
    validating: scala.Boolean,
    error: java.lang.String = null
  ): Validatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError, validate = js.Any.fromFunction0(validate), validating = validating)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Validatable[TValue]]
  }
}

