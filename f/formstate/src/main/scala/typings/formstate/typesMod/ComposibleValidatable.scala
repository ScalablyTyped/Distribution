package typings.formstate.typesMod

import typings.formstate.anon.HasError
import typings.formstate.anon.OnReinit
import typings.formstate.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  @JSName("_on$Reinit")
  def _on$Reinit(): Unit = js.native
  /** Used to tell the parent about validation */
  @JSName("_on$ValidationPass")
  def _on$ValidationPass(): Unit = js.native
  /** Used by the parent to register listeners */
  def _setCompositionParent(config: OnReinit): Unit = js.native
  /** Allows a convinient reset for all fields */
  def reset(): Unit = js.native
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
    validating: Boolean
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = js.Any.fromFunction0(_on$Reinit), _on$ValidationPass = js.Any.fromFunction0(_on$ValidationPass), _setCompositionParent = js.Any.fromFunction1(_setCompositionParent), disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
  @scala.inline
  implicit class ComposibleValidatableOps[Self <: ComposibleValidatable[_], TValue] (val x: Self with ComposibleValidatable[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_on$Reinit(value: () => Unit): Self = this.set("_on$Reinit", js.Any.fromFunction0(value))
    @scala.inline
    def set_on$ValidationPass(value: () => Unit): Self = this.set("_on$ValidationPass", js.Any.fromFunction0(value))
    @scala.inline
    def set_setCompositionParent(value: OnReinit => Unit): Self = this.set("_setCompositionParent", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

