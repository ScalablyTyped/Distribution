package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  /** Used to tell the parent about validation */
  @JSName("on$ChangeAfterValidation")
  def on$ChangeAfterValidation(): scala.Unit
  @JSName("on$Reinit")
  def on$Reinit(): scala.Unit
  /** Allows a convinient reset for all fields */
  def reset(): scala.Unit
  /** Used by the parent to register listeners */
  def setCompositionParent(config: formstateLib.Anon_OnChangeAfterValidation): scala.Unit
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    enableAutoValidation: () => scala.Unit,
    hasError: scala.Boolean,
    on$ChangeAfterValidation: () => scala.Unit,
    on$Reinit: () => scala.Unit,
    reset: () => scala.Unit,
    setCompositionParent: formstateLib.Anon_OnChangeAfterValidation => scala.Unit,
    validate: () => js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]],
    validating: scala.Boolean,
    error: java.lang.String = null
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError, on$ChangeAfterValidation = js.Any.fromFunction0(on$ChangeAfterValidation), on$Reinit = js.Any.fromFunction0(on$Reinit), reset = js.Any.fromFunction0(reset), setCompositionParent = js.Any.fromFunction1(setCompositionParent), validate = js.Any.fromFunction0(validate), validating = validating)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
}

