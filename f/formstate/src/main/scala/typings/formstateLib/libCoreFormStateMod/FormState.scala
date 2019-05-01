package typings
package formstateLib.libCoreFormStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/formState", "FormState")
@js.native
class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
  extends formstateLib.libCoreTypesMod.ComposibleValidatable[TValue] {
  def this(/**
    * SubItems can be any Validatable
    */
  $: TValue) = this()
  /* CompleteClass */
  @JSName("$")
  override var $: TValue = js.native
  var _error: js.UndefOr[java.lang.String | scala.Null] = js.native
  var _validators: js.Array[formstateLib.libCoreTypesMod.Validator[TValue]] = js.native
  /**
    * Auto validation
    */
  var autoValidationEnabled: scala.Boolean = js.native
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
  var mode: formstateLib.formstateLibStrings.`object` | formstateLib.formstateLibStrings.array | formstateLib.formstateLibStrings.map = js.native
  /**
    * You should only show the form error if there are no field errors
    */
  val showFormError: scala.Boolean = js.native
  /**
    * Composible field validation tracking
    */
  var validatedSubFields: js.Array[formstateLib.libCoreTypesMod.ComposibleValidatable[_]] = js.native
  /* CompleteClass */
  override var validating: scala.Boolean = js.native
  /**
    * Call it when you are `reinit`ing child fields
    */
  def clearFormError(): scala.Unit = js.native
  /**
    * Composible fields (fields that work in conjuction with FormState)
    */
  def compose(): this.type = js.native
  /* CompleteClass */
  override def disableAutoValidation(): scala.Unit = js.native
  /* CompleteClass */
  override def enableAutoValidation(): scala.Unit = js.native
  def enableAutoValidationAndValidate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_FalseHasError[TValue]] = js.native
  /** Get validatable objects from $ */
  /* protected */ def getValues(): js.Array[formstateLib.libCoreTypesMod.ComposibleValidatable[_]] = js.native
  /** Used to tell the parent about validation */
  /* CompleteClass */
  @JSName("on$ChangeAfterValidation")
  override def on$ChangeAfterValidation(): scala.Unit = js.native
  /* CompleteClass */
  @JSName("on$Reinit")
  override def on$Reinit(): scala.Unit = js.native
  /** Allows a convinient reset for all fields */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /** Used by the parent to register listeners */
  /* CompleteClass */
  override def setCompositionParent(config: formstateLib.Anon_OnChangeAfterValidation): scala.Unit = js.native
  /* CompleteClass */
  override def validate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]] = js.native
  def validators(validators: formstateLib.libCoreTypesMod.Validator[TValue]*): this.type = js.native
}

