package typings.formstate

import org.scalablytyped.runtime.StringDictionary
import typings.formstate.anon.HasError
import typings.formstate.anon.HasErrorValue
import typings.formstate.formstateStrings.`object`
import typings.formstate.formstateStrings.array
import typings.formstate.formstateStrings.map
import typings.formstate.typesMod.ComposibleValidatable
import typings.formstate.typesMod.Validator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formStateMod {
  
  @JSImport("formstate/lib/core/formState", "FormState")
  @js.native
  class FormState[TValue /* <: ValidatableMapOrArray */] protected () extends ComposibleValidatable[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
    
    var _error: js.UndefOr[String | Null] = js.native
    
    var _validators: js.Array[Validator[TValue]] = js.native
    
    /**
      * Auto validation
      */
    var autoValidationEnabled: Boolean = js.native
    
    /**
      * Call it when you are `reinit`ing child fields
      */
    def clearFormError(): Unit = js.native
    
    /**
      * Composible fields (fields that work in conjuction with FormState)
      */
    def compose(): this.type = js.native
    
    def enableAutoValidationAndValidate(): js.Promise[HasError | HasErrorValue[TValue]] = js.native
    
    /**
      * The first error from any sub (if any) or form error
      */
    @JSName("error")
    def error_MFormState: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from some sub field if any
      */
    def fieldError: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from form if any
      */
    def formError: js.UndefOr[String | Null] = js.native
    
    /** Get validatable objects from $ */
    /* protected */ def getValues(): js.Array[ComposibleValidatable[_]] = js.native
    
    /**
      * Does any field or form have an error
      */
    @JSName("hasError")
    def hasError_MFormState: Boolean = js.native
    
    /**
      * Does any field have an error
      */
    def hasFieldError: Boolean = js.native
    
    /**
      * Does form level validation have an error
      */
    def hasFormError: Boolean = js.native
    
    var mode: `object` | array | map = js.native
    
    /**
      * You should only show the form error if there are no field errors
      */
    def showFormError: Boolean = js.native
    
    /**
      * Composible field validation tracking
      */
    var validatedSubFields: js.Array[ComposibleValidatable[_]] = js.native
    
    def validators(validators: Validator[TValue]*): this.type = js.native
  }
  
  type ValidatableMapOrArray = StringDictionary[ComposibleValidatable[js.Any]] | js.Array[ComposibleValidatable[js.Any]] | (Map[js.Any, ComposibleValidatable[js.Any]])
}
