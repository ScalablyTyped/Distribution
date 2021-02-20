package typings.formstate

import typings.formstate.typesMod.Validatable
import typings.formstate.typesMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formStateLazyMod {
  
  @JSImport("formstate/lib/core/formStateLazy", "FormStateLazy")
  @js.native
  class FormStateLazy[TValue /* <: ValidatableArray */] protected () extends Validatable[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
    
    @JSName("$")
    def $_MFormStateLazy: TValue = js.native
    
    var _error: js.UndefOr[String | Null] = js.native
    
    var _validators: js.Array[Validator[TValue]] = js.native
    
    /**
      * Call it when you are `reinit`ing child fields
      */
    def clearFormError(): Unit = js.native
    
    /**
      * The first error from any sub (if any) or form error
      */
    @JSName("error")
    def error_MFormStateLazy: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from some sub field if any
      */
    def fieldError: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from form if any
      */
    def formError: js.UndefOr[String | Null] = js.native
    
    /** It is a function as fields can change over time */
    /* protected */ def getFields(): TValue = js.native
    
    /**
      * Does any field or form have an error
      */
    @JSName("hasError")
    def hasError_MFormStateLazy: Boolean = js.native
    
    /**
      * Does any field have an error
      */
    def hasFieldError: Boolean = js.native
    
    /**
      * Does form level validation have an error
      */
    def hasFormError: Boolean = js.native
    
    /**
      * You should only show the form error if there are no field errors
      */
    def showFormError: Boolean = js.native
    
    def validators(validators: Validator[TValue]*): this.type = js.native
  }
  
  type ValidatableArray = js.Array[Validatable[js.Any]]
}
