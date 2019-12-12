package typings.formstate

import typings.formstate.libCoreFormStateLazyMod.ValidatableArray
import typings.formstate.libCoreTypesMod.Validatable
import typings.formstate.libCoreTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/formStateLazy", JSImport.Namespace)
@js.native
object libCoreFormStateLazyMod extends js.Object {
  @js.native
  class FormStateLazy[TValue /* <: ValidatableArray */] protected () extends Validatable[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
    var _error: js.UndefOr[String | Null] = js.native
    var _validators: js.Array[Validator[TValue]] = js.native
    /**
      * The first error from any sub (if any) or form error
      */
    @JSName("error")
    val error_FormStateLazy: js.UndefOr[String | Null] = js.native
    /**
      * Error from some sub field if any
      */
    val fieldError: js.UndefOr[String | Null] = js.native
    /**
      * Error from form if any
      */
    val formError: js.UndefOr[String | Null] = js.native
    /**
      * Does any field have an error
      */
    val hasFieldError: Boolean = js.native
    /**
      * Does form level validation have an error
      */
    val hasFormError: Boolean = js.native
    /**
      * You should only show the form error if there are no field errors
      */
    val showFormError: Boolean = js.native
    /**
      * Call it when you are `reinit`ing child fields
      */
    def clearFormError(): Unit = js.native
    /** It is a function as fields can change over time */
    /* protected */ def getFields(): TValue = js.native
    def validators(validators: Validator[TValue]*): this.type = js.native
  }
  
  type ValidatableArray = js.Array[Validatable[js.Any]]
}

