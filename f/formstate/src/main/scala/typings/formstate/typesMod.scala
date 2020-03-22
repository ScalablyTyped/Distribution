package typings.formstate

import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait ComposibleValidatable[TValue] extends Validatable[TValue] {
    @JSName("_on$Reinit")
    def _on$Reinit(): Unit = js.native
    /** Used to tell the parent about validation */
    @JSName("_on$ValidationPass")
    def _on$ValidationPass(): Unit = js.native
    /** Used by the parent to register listeners */
    def _setCompositionParent(config: AnonOnReinit): Unit = js.native
    /** Allows a convinient reset for all fields */
    def reset(): Unit = js.native
  }
  
  @js.native
  trait Validatable[TValue] extends js.Object {
    @JSName("$")
    var $: TValue = js.native
    var error: js.UndefOr[String | Null] = js.native
    var hasError: Boolean = js.native
    var validating: Boolean = js.native
    def disableAutoValidation(): Unit = js.native
    def enableAutoValidation(): Unit = js.native
    def validate(): js.Promise[AnonHasError | AnonValue[TValue]] = js.native
  }
  
  def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
  type ValidationResponse = js.UndefOr[String | Null | `false`]
  type Validator[TValue] = js.Function1[/* value */ TValue, ValidatorResponse]
  type ValidatorResponse = ValidationResponse | js.Promise[ValidationResponse]
}

