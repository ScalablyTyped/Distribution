package typings
package formstateLib.libCoreFieldStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/fieldState", "FieldState")
@js.native
class FieldState[TValue] protected ()
  extends formstateLib.libCoreTypesMod.ComposibleValidatable[TValue] {
  def this(_initValue: TValue) = this()
  /* CompleteClass */
  @JSName("$")
  override var $: TValue = js.native
  /**
    * Allows you to preserve the `_autoValidationEnabled` value across `reinit`s
    */
  var _autoValidationDefault: scala.Boolean = js.native
  var _autoValidationEnabled: scala.Boolean = js.native
  var _initValue: js.Any = js.native
  var _validators: js.Array[formstateLib.libCoreTypesMod.Validator[TValue]] = js.native
  /** If the field has been touched */
  var dirty: js.UndefOr[scala.Boolean] = js.native
  /** If there is any error on the field on last validation attempt */
  @JSName("error")
  var error_FieldState: js.UndefOr[java.lang.String] = js.native
  /**
    * Set to true if a validation run has been completed since init
    * Use case:
    * - to show a green color in the field : `hasError == false && hasBeenValidated == true`
    **/
  var hasBeenValidated: scala.Boolean = js.native
  /* CompleteClass */
  override var hasError: scala.Boolean = js.native
  /** Trackers for validation */
  var lastValidationRequest: scala.Double = js.native
  var preventNextQueuedValidation: scala.Boolean = js.native
  /* CompleteClass */
  override var validating: scala.Boolean = js.native
  /**
    * The value you should bind to the input in your field.
    */
  var value: TValue = js.native
  /* CompleteClass */
  @JSName("_on$Reinit")
  override def _on$Reinit(): scala.Unit = js.native
  /** Used to tell the parent about validation */
  /* CompleteClass */
  @JSName("_on$ValidationPass")
  override def _on$ValidationPass(): scala.Unit = js.native
  /**
    * Allows you to take actions in your code based on `value` changes caused by user interactions
    */
  /* protected */ def _onDidChange(config: formstateLib.Anon_NewValue[TValue]): js.Any = js.native
  /* protected */ def _onUpdate(state: FieldState[TValue]): js.Any = js.native
  /** Used by the parent to register listeners */
  /* CompleteClass */
  override def _setCompositionParent(config: formstateLib.Anon_OnReinit): scala.Unit = js.native
  /* CompleteClass */
  override def disableAutoValidation(): scala.Unit = js.native
  /* CompleteClass */
  override def enableAutoValidation(): scala.Unit = js.native
  def enableAutoValidationAndValidate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]] = js.native
  /* protected */ def executeOnDidChange(config: formstateLib.Anon_NewValue[TValue]): scala.Unit = js.native
  /* protected */ def executeOnUpdate(): scala.Unit = js.native
  def getAutoValidationDefault(): scala.Boolean = js.native
  /** On change on the component side */
  def onChange(value: TValue): scala.Unit = js.native
  def onDidChange(handler: js.Function1[/* config */ formstateLib.Anon_NewValue[TValue], _]): this.type = js.native
  /**
    * onUpdate is called whenever we change something in our local state that is significant
    * - value
    * - $
    * - error
    */
  def onUpdate(handler: js.Function1[/* state */ FieldState[TValue], _]): this.type = js.native
  /**
    * Runs validation with debouncing to keep the UI super smoothly responsive
    * NOTE:
    * - also setup in constructor
    * - Not using `action` from mobx *here* as it throws off our type definitions
    */
  /* protected */ def queueValidation(): scala.Unit = js.native
  def queuedValidationWakeup(): scala.Unit = js.native
  /** Allows a convinient reset for all fields */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  def reset(value: TValue): scala.Unit = js.native
  def setAutoValidationDebouncedMs(milliseconds: scala.Double): this.type = js.native
  def setAutoValidationDefault(autoValidationDefault: scala.Boolean): this.type = js.native
  /**
    * Allows you to set an error on a field lazily
    * Use case:
    *  You validate some things on client (e.g. isRequired)
    *  You then validate the field on the backend with an explict action (e.g. continue button)
    *  You now want to highlight an error from the backend for this field
    **/
  def setError(error: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def validate(): js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]] = js.native
  def validators(validators: formstateLib.libCoreTypesMod.Validator[TValue]*): this.type = js.native
}

