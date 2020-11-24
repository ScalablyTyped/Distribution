package typings.formstate

import typings.formstate.anon.HasError
import typings.formstate.anon.NewValue
import typings.formstate.anon.Value
import typings.formstate.typesMod.ComposibleValidatable
import typings.formstate.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formstate/lib/core/fieldState", JSImport.Namespace)
@js.native
object fieldStateMod extends js.Object {
  
  @js.native
  class FieldState[TValue] protected () extends ComposibleValidatable[TValue] {
    def this(_initValue: TValue) = this()
    
    /**
      * Allows you to preserve the `_autoValidationEnabled` value across `reinit`s
      */
    var _autoValidationDefault: Boolean = js.native
    
    var _autoValidationEnabled: Boolean = js.native
    
    var _initValue: js.Any = js.native
    
    /**
      * Allows you to take actions in your code based on `value` changes caused by user interactions
      */
    /* protected */ def _onDidChange(config: NewValue[TValue]): js.Any = js.native
    
    /* protected */ def _onUpdate(state: FieldState[TValue]): js.Any = js.native
    
    var _validators: js.Array[Validator[TValue]] = js.native
    
    /** If the field has been touched */
    var dirty: js.UndefOr[Boolean] = js.native
    
    def enableAutoValidationAndValidate(): js.Promise[HasError | Value[TValue]] = js.native
    
    /** If there is any error on the field on last validation attempt */
    @JSName("error")
    var error_FieldState: js.UndefOr[String] = js.native
    
    /* protected */ def executeOnDidChange(config: NewValue[TValue]): Unit = js.native
    
    /* protected */ def executeOnUpdate(): Unit = js.native
    
    def getAutoValidationDefault(): Boolean = js.native
    
    /**
      * Set to true if a validation run has been completed since init
      * Use case:
      * - to show a green color in the field : `hasError == false && hasBeenValidated == true`
      **/
    var hasBeenValidated: Boolean = js.native
    
    @JSName("hasError")
    def hasError_MFieldState: Boolean = js.native
    
    /** Trackers for validation */
    var lastValidationRequest: Double = js.native
    
    /** On change on the component side */
    def onChange(value: TValue): Unit = js.native
    
    def onDidChange(handler: js.Function1[/* config */ NewValue[TValue], _]): this.type = js.native
    
    /**
      * onUpdate is called whenever we change something in our local state that is significant
      * - any validation() call
      * - any reset() call
      */
    def onUpdate(handler: js.Function1[/* state */ FieldState[TValue], _]): this.type = js.native
    
    var preventNextQueuedValidation: Boolean = js.native
    
    /**
      * Runs validation with debouncing to keep the UI super smoothly responsive
      * NOTE:
      * - also setup in constructor
      * - Not using `action` from mobx *here* as it throws off our type definitions
      */
    /* protected */ def queueValidation(): Unit = js.native
    
    def queuedValidationWakeup(): Unit = js.native
    
    def reset(value: TValue): Unit = js.native
    
    def setAutoValidationDebouncedMs(milliseconds: Double): this.type = js.native
    
    def setAutoValidationDefault(autoValidationDefault: Boolean): this.type = js.native
    
    /**
      * Allows you to set an error on a field lazily
      * Use case:
      *  You validate some things on client (e.g. isRequired)
      *  You then validate the field on the backend with an explict action (e.g. continue button)
      *  You now want to highlight an error from the backend for this field
      **/
    def setError(error: String): Unit = js.native
    
    def validators(validators: Validator[TValue]*): this.type = js.native
    
    /**
      * The value you should bind to the input in your field.
      */
    var value: TValue = js.native
  }
}
