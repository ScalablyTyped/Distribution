package typings
package formstateLib.libCoreFormStateLazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/formStateLazy", "FormStateLazy")
@js.native
class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
  extends formstateLib.libCoreTypesMod.Validatable[TValue] {
  def this(/** It is a function as fields can change over time */
  getFields: js.Function0[TValue]) = this()
  /* CompleteClass */
  @JSName("$")
  override var $: TValue = js.native
  var _error: js.UndefOr[java.lang.String | scala.Null] = js.native
  var _validators: js.Array[formstateLib.libCoreTypesMod.Validator[TValue]] = js.native
  /**
    * Error from some sub field if any
    */
  val fieldError: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * Error from form if any
    */
  val formError: js.UndefOr[java.lang.String | scala.Null] = js.native
  /* CompleteClass */
  override var hasError: scala.Boolean = js.native
  /**
    * Does any field have an error
    */
  val hasFieldError: scala.Boolean = js.native
  /**
    * Does form level validation have an error
    */
  val hasFormError: scala.Boolean = js.native
  /**
    * You should only show the form error if there are no field errors
    */
  val showFormError: scala.Boolean = js.native
  /* CompleteClass */
  override var validating: scala.Boolean = js.native
  /**
    * Call it when you are `reinit`ing child fields
    */
  def clearFormError(): scala.Unit = js.native
  /* CompleteClass */
  override def disableAutoValidation(): scala.Unit = js.native
  /* CompleteClass */
  override def enableAutoValidation(): scala.Unit = js.native
  /** It is a function as fields can change over time */
  /* protected */ def getFields(): TValue = js.native
  /* CompleteClass */
  override def validate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]] = js.native
  def validators(validators: formstateLib.libCoreTypesMod.Validator[TValue]*): this.type = js.native
}

