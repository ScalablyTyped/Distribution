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
  def enableAutoValidation(): scala.Unit
  def validate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]]
}

object Validatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    enableAutoValidation: js.Function0[scala.Unit],
    hasError: scala.Boolean,
    validate: js.Function0[js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]]],
    validating: scala.Boolean,
    error: java.lang.String = null
  ): Validatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], enableAutoValidation = enableAutoValidation, hasError = hasError, validate = validate, validating = validating)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Validatable[TValue]]
  }
}

