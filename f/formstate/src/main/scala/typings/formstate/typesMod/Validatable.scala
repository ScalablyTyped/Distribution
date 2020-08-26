package typings.formstate.typesMod

import typings.formstate.anon.HasError
import typings.formstate.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validatable[TValue] extends js.Object {
  @JSName("$")
  var $: TValue = js.native
  var error: js.UndefOr[String | Null] = js.native
  var hasError: Boolean = js.native
  var validating: Boolean = js.native
  def disableAutoValidation(): Unit = js.native
  def enableAutoValidation(): Unit = js.native
  def validate(): js.Promise[HasError | Value[TValue]] = js.native
}

object Validatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    validate: () => js.Promise[HasError | Value[TValue]],
    validating: Boolean
  ): Validatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validatable[TValue]]
  }
  @scala.inline
  implicit class ValidatableOps[Self <: Validatable[_], TValue] (val x: Self with Validatable[TValue]) extends AnyVal {
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
    def set$(value: TValue): Self = this.set("$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableAutoValidation(value: () => Unit): Self = this.set("disableAutoValidation", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableAutoValidation(value: () => Unit): Self = this.set("enableAutoValidation", js.Any.fromFunction0(value))
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: () => js.Promise[HasError | Value[TValue]]): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def setValidating(value: Boolean): Self = this.set("validating", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

