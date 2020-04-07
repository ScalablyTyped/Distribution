package typings.formstate.typesMod

import typings.formstate.AnonHasError
import typings.formstate.AnonOnReinit
import typings.formstate.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  @JSName("_on$Reinit")
  def _on$Reinit(): Unit
  /** Used to tell the parent about validation */
  @JSName("_on$ValidationPass")
  def _on$ValidationPass(): Unit
  /** Used by the parent to register listeners */
  def _setCompositionParent(config: AnonOnReinit): Unit
  /** Allows a convinient reset for all fields */
  def reset(): Unit
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    _on$Reinit: () => Unit,
    _on$ValidationPass: () => Unit,
    _setCompositionParent: AnonOnReinit => Unit,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    reset: () => Unit,
    validate: () => js.Promise[AnonHasError | AnonValue[TValue]],
    validating: Boolean,
    error: String = null
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = js.Any.fromFunction0(_on$Reinit), _on$ValidationPass = js.Any.fromFunction0(_on$ValidationPass), _setCompositionParent = js.Any.fromFunction1(_setCompositionParent), disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
}

