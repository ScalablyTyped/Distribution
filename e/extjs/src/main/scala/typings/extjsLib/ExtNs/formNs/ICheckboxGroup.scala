package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.formNs.fieldNs.IField because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig, disabled))*/

trait ICheckboxGroup extends IFieldContainer {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Number/Number[]) */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
  		* @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
  		*/
  var getChecked: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
  		* @returns String[] Array of all validation errors
  		*/
  var getErrors: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private override
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] private override  the group value is a complex object compare using object serialization
  		* @param value1 Object
  		* @param value2 Object
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] When a checkbox is added to the group monitor it for changes
  		* @param field Object
  		*/
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
  		* @param item Object
  		*/
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value s of all checkboxes in the group
  		* @param value Object The mapping of checkbox names to values.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

