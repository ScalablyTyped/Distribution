package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField
  extends typings.extjs.Ext.IBase {
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns any
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns any All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns string name The field name
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns any value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns any True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns any True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns any
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns any True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns any The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns any True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    batchChanges: /* fn */ js.UndefOr[js.Any] => Unit = null,
    beforeReset: () => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    checkChange: () => Unit = null,
    checkDirty: () => Unit = null,
    clearInvalid: () => Unit = null,
    config: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    extractFileInput: () => _ = null,
    getErrors: /* value */ js.UndefOr[js.Any] => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModelData: () => _ = null,
    getName: () => java.lang.String = null,
    getSubmitData: () => _ = null,
    getValue: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => typings.extjs.Ext.form.field.IField = null,
    initField: () => Unit = null,
    initValue: () => Unit = null,
    isDirty: () => _ = null,
    isEqual: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => _ = null,
    isFileUpload: () => _ = null,
    isFormField: js.UndefOr[Boolean] = js.undefined,
    isValid: () => _ = null,
    markInvalid: /* errors */ js.UndefOr[js.Any] => Unit = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    originalValue: js.Any = null,
    requires: Array = null,
    reset: () => Unit = null,
    resetOriginalValue: () => Unit = null,
    self: IClass = null,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => _ = null,
    uses: Array = null,
    validate: () => _ = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1(batchChanges))
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction0(beforeReset))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(js.Any.fromFunction0(checkDirty))
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(js.Any.fromFunction0(clearInvalid))
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(js.Any.fromFunction0(extractFileInput))
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModelData != null) __obj.updateDynamic("getModelData")(js.Any.fromFunction0(getModelData))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(js.Any.fromFunction0(getSubmitData))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initField != null) __obj.updateDynamic("initField")(js.Any.fromFunction0(initField))
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2(isEqual))
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(js.Any.fromFunction0(isFileUpload))
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField)
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1(markInvalid))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue)
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1(transformOriginalValue))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IField]
  }
}

