package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  @JSName("_on$Reinit")
  def _on$Reinit(): scala.Unit
  /** Used to tell the parent about validation */
  @JSName("_on$ValidationPass")
  def _on$ValidationPass(): scala.Unit
  /** Used by the parent to register listeners */
  def _setCompositionParent(config: formstateLib.Anon_OnReinit): scala.Unit
  /** Allows a convinient reset for all fields */
  def reset(): scala.Unit
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    _on$Reinit: () => scala.Unit,
    _on$ValidationPass: () => scala.Unit,
    _setCompositionParent: formstateLib.Anon_OnReinit => scala.Unit,
    disableAutoValidation: () => scala.Unit,
    enableAutoValidation: () => scala.Unit,
    hasError: scala.Boolean,
    reset: () => scala.Unit,
    validate: () => js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]],
    validating: scala.Boolean,
    error: java.lang.String = null
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = js.Any.fromFunction0(_on$Reinit), _on$ValidationPass = js.Any.fromFunction0(_on$ValidationPass), _setCompositionParent = js.Any.fromFunction1(_setCompositionParent), disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError, reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate), validating = validating)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
}

