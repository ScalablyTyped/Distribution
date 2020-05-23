package typings.formstate.typesMod

import typings.formstate.anon.HasError
import typings.formstate.anon.OnReinit
import typings.formstate.anon.Value
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
  def _setCompositionParent(config: OnReinit): Unit
  /** Allows a convinient reset for all fields */
  def reset(): Unit
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    _on$Reinit: () => Unit,
    _on$ValidationPass: () => Unit,
    _setCompositionParent: OnReinit => Unit,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    reset: () => Unit,
    validate: () => js.Promise[HasError | Value[TValue]],
    validating: Boolean,
    error: js.UndefOr[Null | String] = js.undefined
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = js.Any.fromFunction0(_on$Reinit), _on$ValidationPass = js.Any.fromFunction0(_on$ValidationPass), _setCompositionParent = js.Any.fromFunction1(_setCompositionParent), disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
}

