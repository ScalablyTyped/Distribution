package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField
  extends extjsLib.ExtNs.IBase {
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var initField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var isFormField: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns any True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
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
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    batchChanges: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeReset: js.Function0[scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    checkChange: js.Function0[scala.Unit] = null,
    checkDirty: js.Function0[scala.Unit] = null,
    clearInvalid: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    extractFileInput: js.Function0[_] = null,
    getErrors: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getModelData: js.Function0[_] = null,
    getName: js.Function0[java.lang.String] = null,
    getSubmitData: js.Function0[_] = null,
    getValue: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IField] = null,
    initField: js.Function0[scala.Unit] = null,
    initValue: js.Function0[scala.Unit] = null,
    isDirty: js.Function0[_] = null,
    isEqual: js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _] = null,
    isFileUpload: js.Function0[_] = null,
    isFormField: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.Function0[_] = null,
    markInvalid: js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit] = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    originalValue: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    reset: js.Function0[scala.Unit] = null,
    resetOriginalValue: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    submitValue: js.UndefOr[scala.Boolean] = js.undefined,
    transformOriginalValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    uses: extjsLib.ExtNs.Array = null,
    validate: js.Function0[_] = null,
    validateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(batchChanges)
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(beforeReset)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(checkDirty)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(extractFileInput)
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getModelData != null) __obj.updateDynamic("getModelData")(getModelData)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(getSubmitData)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initField != null) __obj.updateDynamic("initField")(initField)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (isEqual != null) __obj.updateDynamic("isEqual")(isEqual)
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(isFileUpload)
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(markInvalid)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(resetOriginalValue)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue)
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(transformOriginalValue)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IField]
  }
}

