package typings.formstate

import typings.formstate.anon.HasError
import typings.formstate.anon.OnReinit
import typings.formstate.anon.Value
import typings.formstate.formstateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTypesMod {
  
  @JSImport("formstate/lib/core/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyValidators")(value.asInstanceOf[js.Any], validators.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String | Null]]]
  
  trait ComposibleValidatable[TValue]
    extends StObject
       with Validatable[TValue] {
    
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
    
    inline def apply[TValue](
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
    
    extension [Self <: ComposibleValidatable[?], TValue](x: Self & ComposibleValidatable[TValue]) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def set_on$Reinit(value: () => Unit): Self = StObject.set(x, "_on$Reinit", js.Any.fromFunction0(value))
      
      inline def set_on$ValidationPass(value: () => Unit): Self = StObject.set(x, "_on$ValidationPass", js.Any.fromFunction0(value))
      
      inline def set_setCompositionParent(value: OnReinit => Unit): Self = StObject.set(x, "_setCompositionParent", js.Any.fromFunction1(value))
    }
  }
  
  trait Validatable[TValue] extends StObject {
    
    @JSName("$")
    var $: TValue
    
    def disableAutoValidation(): Unit
    
    def enableAutoValidation(): Unit
    
    var error: js.UndefOr[String | Null] = js.undefined
    
    var hasError: Boolean
    
    def validate(): js.Promise[HasError | Value[TValue]]
    
    var validating: Boolean
  }
  object Validatable {
    
    inline def apply[TValue](
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
    
    extension [Self <: Validatable[?], TValue](x: Self & Validatable[TValue]) {
      
      inline def set$(value: TValue): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoValidation(value: () => Unit): Self = StObject.set(x, "disableAutoValidation", js.Any.fromFunction0(value))
      
      inline def setEnableAutoValidation(value: () => Unit): Self = StObject.set(x, "enableAutoValidation", js.Any.fromFunction0(value))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: () => js.Promise[HasError | Value[TValue]]): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidationResponse = js.UndefOr[String | Null | `false`]
  
  type Validator[TValue] = js.Function1[/* value */ TValue, ValidatorResponse]
  
  type ValidatorResponse = ValidationResponse | js.Promise[ValidationResponse]
}
