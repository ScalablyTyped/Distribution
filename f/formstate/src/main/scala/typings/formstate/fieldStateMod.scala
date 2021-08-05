package typings.formstate

import typings.formstate.anon.HasError
import typings.formstate.anon.NewValue
import typings.formstate.anon.OnReinit
import typings.formstate.anon.Value
import typings.formstate.typesMod.ComposibleValidatable
import typings.formstate.typesMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldStateMod {
  
  @JSImport("formstate/lib/core/fieldState", "FieldState")
  @js.native
  class FieldState[TValue] protected ()
    extends StObject
       with ComposibleValidatable[TValue] {
    def this(_initValue: TValue) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: TValue = js.native
    
    /**
      * Allows you to preserve the `_autoValidationEnabled` value across `reinit`s
      */
    /* protected */ var _autoValidationDefault: Boolean = js.native
    
    /* protected */ var _autoValidationEnabled: Boolean = js.native
    
    /* private */ var _initValue: js.Any = js.native
    
    /* CompleteClass */
    @JSName("_on$Reinit")
    override def _on$Reinit(): Unit = js.native
    
    /** Used to tell the parent about validation */
    /* CompleteClass */
    @JSName("_on$ValidationPass")
    override def _on$ValidationPass(): Unit = js.native
    
    /**
      * Allows you to take actions in your code based on `value` changes caused by user interactions
      */
    /* protected */ def _onDidChange(config: NewValue[TValue]): js.Any = js.native
    
    /* protected */ def _onUpdate(state: FieldState[TValue]): js.Any = js.native
    
    /** Used by the parent to register listeners */
    /* CompleteClass */
    override def _setCompositionParent(config: OnReinit): Unit = js.native
    
    /* protected */ var _validators: js.Array[Validator[TValue]] = js.native
    
    /** If the field has been touched */
    var dirty: js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def disableAutoValidation(): Unit = js.native
    
    /* CompleteClass */
    override def enableAutoValidation(): Unit = js.native
    
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
    
    /* CompleteClass */
    var hasError: Boolean = js.native
    @JSName("hasError")
    def hasError_MFieldState: Boolean = js.native
    
    /** Trackers for validation */
    /* protected */ var lastValidationRequest: Double = js.native
    
    /** On change on the component side */
    def onChange(value: TValue): Unit = js.native
    
    def onDidChange(handler: js.Function1[/* config */ NewValue[TValue], js.Any]): this.type = js.native
    
    /**
      * onUpdate is called whenever we change something in our local state that is significant
      * - any validation() call
      * - any reset() call
      */
    def onUpdate(handler: js.Function1[/* state */ FieldState[TValue], js.Any]): this.type = js.native
    
    /* protected */ var preventNextQueuedValidation: Boolean = js.native
    
    /**
      * Runs validation with debouncing to keep the UI super smoothly responsive
      * NOTE:
      * - also setup in constructor
      * - Not using `action` from mobx *here* as it throws off our type definitions
      */
    /* protected */ def queueValidation(): Unit = js.native
    
    def queuedValidationWakeup(): Unit = js.native
    
    /** Allows a convinient reset for all fields */
    /* CompleteClass */
    override def reset(): Unit = js.native
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
    
    /* CompleteClass */
    override def validate(): js.Promise[HasError | Value[TValue]] = js.native
    
    /* CompleteClass */
    var validating: Boolean = js.native
    
    def validators(validators: Validator[TValue]*): this.type = js.native
    
    /**
      * The value you should bind to the input in your field.
      */
    var value: TValue = js.native
  }
}
