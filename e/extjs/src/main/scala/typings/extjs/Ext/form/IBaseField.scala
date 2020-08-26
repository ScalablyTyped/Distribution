package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate
- typings.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ @js.native
trait IBaseField extends IComponent {
  /** [Config Option] (String) */
  var activeError: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[String] = js.native
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var checkChangeBuffer: js.UndefOr[Double] = js.native
  /** [Config Option] (String[]) */
  var checkChangeEvents: js.UndefOr[Array] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var dirtyCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.native
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldStyle: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[String] = js.native
  /** [Method] Gets the active error message for this component if any
    * @returns String The active error message on the component; if there is no error, an empty string is returned.
    */
  var getActiveError: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets an Array of any active error messages currently applied to the field
    * @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
    */
  var getActiveErrors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
    * @param value Object The value to get errors for (defaults to the current field value)
    * @returns String[] All error messages for this field; an empty Array if none.
    */
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | Array]] = js.native
  /** [Method] Returns the label for the field
    * @returns String The configured field label, or empty string if not defined
    */
  var getFieldLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Get the input id if any for this component
    * @returns String The input id
    */
  var getInputId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets the width of the label if visible
    * @returns Number The label width
    */
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Generates the arguments for the field decorations rendering template
    * @returns Object The template arguments
    */
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
    * @returns any value The raw String value of the field
    */
  var getRawValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Creates and returns the data object to be used when rendering the fieldSubTpl
    * @returns Object The template data
    */
  var getSubTplData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
    * @returns String The markup to be inserted
    */
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] private override to use getSubmitValue  as a convenience
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value that would be included in a standard form submit for this field
    * @returns any The value to be submitted, or null.
    */
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Tells whether the field currently has an active error message
    * @returns Boolean
    */
  var hasActiveError: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Checks if the field has a visible label
    * @returns Boolean True if the field has a visible label
    */
  var hasVisibleLabel: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[Boolean] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  @JSName("initRenderData")
  var initRenderData_IBaseField: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var inputAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var inputEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var inputId: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidText: js.UndefOr[String] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Returns whether two field values are logically equal
    * @param value1 Object The first value to compare
    * @param value2 Object The second value to compare
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[Double] = js.native
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag
    * @param errors String/String[] The validation message(s) to display.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] private */
  @JSName("onRender")
  var onRender_IBaseField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.native
  /** [Method] Performs any necessary manipulation of a raw field value to prepare it for conversion and or validation for instance
    * @param value Object The unprocessed string value
    * @returns Object The processed string value
    */
  var processRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Converts a raw input field value into a mixed type value that is suitable for this particular field type
    * @param rawValue Object
    * @returns Object The converted value.
    */
  var rawToValue: js.UndefOr[js.Function1[/* rawValue */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var readOnlyCls: js.UndefOr[String] = js.native
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the active error message to the given string
    * @param msg String The error message
    */
  var setActiveError: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the active error message to an Array of error messages
    * @param errors String[] The error messages
    */
  var setActiveErrors: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.native
  /** [Method] Applies a set of default configuration values to this Labelable instance
    * @param defaults Object The defaults to apply to the object.
    */
  var setFieldDefaults: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set the label of this field
    * @param label String The new label. The labelSeparator will be automatically appended to the label string.
    */
  var setFieldLabel: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the CSS style of the field input element
    * @param style String/Object/Function The style(s) to apply. Should be a valid argument to Ext.Element.applyStyles.
    */
  var setFieldStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the field s raw value directly bypassing value conversion change detection and validation
    * @param value Object The value to set
    * @returns Object value The field value that is set
    */
  var setRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the read only state of this field
    * @param readOnly Boolean Whether the field should be read only.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object The value to set
    * @returns any this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Transform the raw value before it is set
    * @param value Object The value
    * @returns Object The value to set
    */
  var transformRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the trimmed label by slicing off the label separator character
    * @returns String The trimmed field label, or empty string if not defined
    */
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns Boolean True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Method] Uses getErrors to build an array of validation errors
    * @param value Object The value to validate
    * @returns Boolean True if all validations passed, false if one or more failed
    */
  var validateValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
  /** [Method] Converts a mixed type value to a raw representation suitable for displaying in the field
    * @param value Object The mixed-type value to convert to the raw representation.
    * @returns Object The converted raw value.
    */
  var valueToRaw: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
}

object IBaseField {
  @scala.inline
  def apply(): IBaseField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseField]
  }
  @scala.inline
  implicit class IBaseFieldOps[Self <: IBaseField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveError(value: String): Self = this.set("activeError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveError: Self = this.set("activeError", js.undefined)
    @scala.inline
    def setActiveErrorsTpl(value: js.Any): Self = this.set("activeErrorsTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveErrorsTpl: Self = this.set("activeErrorsTpl", js.undefined)
    @scala.inline
    def setAfterBodyEl(value: js.Any): Self = this.set("afterBodyEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterBodyEl: Self = this.set("afterBodyEl", js.undefined)
    @scala.inline
    def setAfterLabelTextTpl(value: js.Any): Self = this.set("afterLabelTextTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterLabelTextTpl: Self = this.set("afterLabelTextTpl", js.undefined)
    @scala.inline
    def setAfterLabelTpl(value: js.Any): Self = this.set("afterLabelTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterLabelTpl: Self = this.set("afterLabelTpl", js.undefined)
    @scala.inline
    def setAfterSubTpl(value: js.Any): Self = this.set("afterSubTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSubTpl: Self = this.set("afterSubTpl", js.undefined)
    @scala.inline
    def setAutoFitErrors(value: Boolean): Self = this.set("autoFitErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFitErrors: Self = this.set("autoFitErrors", js.undefined)
    @scala.inline
    def setBaseBodyCls(value: String): Self = this.set("baseBodyCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseBodyCls: Self = this.set("baseBodyCls", js.undefined)
    @scala.inline
    def setBatchChanges(value: js.UndefOr[js.Any] => Unit): Self = this.set("batchChanges", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchChanges: Self = this.set("batchChanges", js.undefined)
    @scala.inline
    def setBeforeBodyEl(value: js.Any): Self = this.set("beforeBodyEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeBodyEl: Self = this.set("beforeBodyEl", js.undefined)
    @scala.inline
    def setBeforeLabelTextTpl(value: js.Any): Self = this.set("beforeLabelTextTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeLabelTextTpl: Self = this.set("beforeLabelTextTpl", js.undefined)
    @scala.inline
    def setBeforeLabelTpl(value: js.Any): Self = this.set("beforeLabelTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeLabelTpl: Self = this.set("beforeLabelTpl", js.undefined)
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = this.set("beforeReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    @scala.inline
    def setBeforeSubTpl(value: js.Any): Self = this.set("beforeSubTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSubTpl: Self = this.set("beforeSubTpl", js.undefined)
    @scala.inline
    def setBodyEl(value: IElement): Self = this.set("bodyEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyEl: Self = this.set("bodyEl", js.undefined)
    @scala.inline
    def setCheckChange(value: () => Unit): Self = this.set("checkChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    @scala.inline
    def setCheckChangeBuffer(value: Double): Self = this.set("checkChangeBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckChangeBuffer: Self = this.set("checkChangeBuffer", js.undefined)
    @scala.inline
    def setCheckChangeEvents(value: Array): Self = this.set("checkChangeEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckChangeEvents: Self = this.set("checkChangeEvents", js.undefined)
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = this.set("checkDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckDirty: Self = this.set("checkDirty", js.undefined)
    @scala.inline
    def setClearCls(value: String): Self = this.set("clearCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearCls: Self = this.set("clearCls", js.undefined)
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = this.set("clearInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    @scala.inline
    def setDirtyCls(value: String): Self = this.set("dirtyCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtyCls: Self = this.set("dirtyCls", js.undefined)
    @scala.inline
    def setErrorEl(value: IElement): Self = this.set("errorEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorEl: Self = this.set("errorEl", js.undefined)
    @scala.inline
    def setErrorMsgCls(value: String): Self = this.set("errorMsgCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMsgCls: Self = this.set("errorMsgCls", js.undefined)
    @scala.inline
    def setExtractFileInput(value: () => _ | HTMLElement): Self = this.set("extractFileInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExtractFileInput: Self = this.set("extractFileInput", js.undefined)
    @scala.inline
    def setFieldBodyCls(value: String): Self = this.set("fieldBodyCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldBodyCls: Self = this.set("fieldBodyCls", js.undefined)
    @scala.inline
    def setFieldCls(value: String): Self = this.set("fieldCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldCls: Self = this.set("fieldCls", js.undefined)
    @scala.inline
    def setFieldLabel(value: String): Self = this.set("fieldLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLabel: Self = this.set("fieldLabel", js.undefined)
    @scala.inline
    def setFieldStyle(value: String): Self = this.set("fieldStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldStyle: Self = this.set("fieldStyle", js.undefined)
    @scala.inline
    def setFocusCls(value: String): Self = this.set("focusCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusCls: Self = this.set("focusCls", js.undefined)
    @scala.inline
    def setFormItemCls(value: String): Self = this.set("formItemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormItemCls: Self = this.set("formItemCls", js.undefined)
    @scala.inline
    def setGetActiveError(value: () => String): Self = this.set("getActiveError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveError: Self = this.set("getActiveError", js.undefined)
    @scala.inline
    def setGetActiveErrors(value: () => Array): Self = this.set("getActiveErrors", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveErrors: Self = this.set("getActiveErrors", js.undefined)
    @scala.inline
    def setGetErrors(value: js.UndefOr[js.Any] => _ | Array): Self = this.set("getErrors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetErrors: Self = this.set("getErrors", js.undefined)
    @scala.inline
    def setGetFieldLabel(value: () => String): Self = this.set("getFieldLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFieldLabel: Self = this.set("getFieldLabel", js.undefined)
    @scala.inline
    def setGetInputId(value: () => String): Self = this.set("getInputId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInputId: Self = this.set("getInputId", js.undefined)
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelWidth: Self = this.set("getLabelWidth", js.undefined)
    @scala.inline
    def setGetLabelableRenderData(value: () => _): Self = this.set("getLabelableRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelableRenderData: Self = this.set("getLabelableRenderData", js.undefined)
    @scala.inline
    def setGetModelData(value: () => _): Self = this.set("getModelData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModelData: Self = this.set("getModelData", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetRawValue(value: () => _): Self = this.set("getRawValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRawValue: Self = this.set("getRawValue", js.undefined)
    @scala.inline
    def setGetSubTplData(value: () => _): Self = this.set("getSubTplData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubTplData: Self = this.set("getSubTplData", js.undefined)
    @scala.inline
    def setGetSubTplMarkup(value: () => String): Self = this.set("getSubTplMarkup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubTplMarkup: Self = this.set("getSubTplMarkup", js.undefined)
    @scala.inline
    def setGetSubmitData(value: () => _): Self = this.set("getSubmitData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmitData: Self = this.set("getSubmitData", js.undefined)
    @scala.inline
    def setGetSubmitValue(value: () => _): Self = this.set("getSubmitValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmitValue: Self = this.set("getSubmitValue", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setHasActiveError(value: () => Boolean): Self = this.set("hasActiveError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasActiveError: Self = this.set("hasActiveError", js.undefined)
    @scala.inline
    def setHasVisibleLabel(value: () => Boolean): Self = this.set("hasVisibleLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasVisibleLabel: Self = this.set("hasVisibleLabel", js.undefined)
    @scala.inline
    def setHideEmptyLabel(value: Boolean): Self = this.set("hideEmptyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEmptyLabel: Self = this.set("hideEmptyLabel", js.undefined)
    @scala.inline
    def setHideLabel(value: Boolean): Self = this.set("hideLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideLabel: Self = this.set("hideLabel", js.undefined)
    @scala.inline
    def setInitField(value: () => Unit): Self = this.set("initField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitField: Self = this.set("initField", js.undefined)
    @scala.inline
    def setInitLabelable(value: () => Unit): Self = this.set("initLabelable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitLabelable: Self = this.set("initLabelable", js.undefined)
    @scala.inline
    def setInitRenderData(value: () => _): Self = this.set("initRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitRenderData: Self = this.set("initRenderData", js.undefined)
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    @scala.inline
    def setInputAttrTpl(value: js.Any): Self = this.set("inputAttrTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAttrTpl: Self = this.set("inputAttrTpl", js.undefined)
    @scala.inline
    def setInputEl(value: IElement): Self = this.set("inputEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputEl: Self = this.set("inputEl", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    @scala.inline
    def setInvalidCls(value: String): Self = this.set("invalidCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidCls: Self = this.set("invalidCls", js.undefined)
    @scala.inline
    def setInvalidText(value: String): Self = this.set("invalidText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidText: Self = this.set("invalidText", js.undefined)
    @scala.inline
    def setIsDirty(value: () => _ | Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsEqual(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean): Self = this.set("isEqual", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
    @scala.inline
    def setIsFieldLabelable(value: Boolean): Self = this.set("isFieldLabelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFieldLabelable: Self = this.set("isFieldLabelable", js.undefined)
    @scala.inline
    def setIsFileUpload(value: () => _ | Boolean): Self = this.set("isFileUpload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFileUpload: Self = this.set("isFileUpload", js.undefined)
    @scala.inline
    def setIsFormField(value: Boolean): Self = this.set("isFormField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFormField: Self = this.set("isFormField", js.undefined)
    @scala.inline
    def setIsValid(value: () => _ | Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setLabelAlign(value: String): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    @scala.inline
    def setLabelAttrTpl(value: js.Any): Self = this.set("labelAttrTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAttrTpl: Self = this.set("labelAttrTpl", js.undefined)
    @scala.inline
    def setLabelCell(value: IElement): Self = this.set("labelCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCell: Self = this.set("labelCell", js.undefined)
    @scala.inline
    def setLabelCls(value: String): Self = this.set("labelCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCls: Self = this.set("labelCls", js.undefined)
    @scala.inline
    def setLabelClsExtra(value: String): Self = this.set("labelClsExtra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClsExtra: Self = this.set("labelClsExtra", js.undefined)
    @scala.inline
    def setLabelEl(value: IElement): Self = this.set("labelEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelEl: Self = this.set("labelEl", js.undefined)
    @scala.inline
    def setLabelPad(value: Double): Self = this.set("labelPad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPad: Self = this.set("labelPad", js.undefined)
    @scala.inline
    def setLabelSeparator(value: String): Self = this.set("labelSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSeparator: Self = this.set("labelSeparator", js.undefined)
    @scala.inline
    def setLabelStyle(value: String): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelWidth(value: Double): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    @scala.inline
    def setMarkInvalid(value: js.UndefOr[js.Any] => Unit): Self = this.set("markInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    @scala.inline
    def setMsgTarget(value: String): Self = this.set("msgTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsgTarget: Self = this.set("msgTarget", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    @scala.inline
    def setPreventMark(value: Boolean): Self = this.set("preventMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventMark: Self = this.set("preventMark", js.undefined)
    @scala.inline
    def setProcessRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("processRawValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessRawValue: Self = this.set("processRawValue", js.undefined)
    @scala.inline
    def setRawToValue(value: /* rawValue */ js.UndefOr[js.Any] => _): Self = this.set("rawToValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRawToValue: Self = this.set("rawToValue", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReadOnlyCls(value: String): Self = this.set("readOnlyCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnlyCls: Self = this.set("readOnlyCls", js.undefined)
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = this.set("resetOriginalValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetOriginalValue: Self = this.set("resetOriginalValue", js.undefined)
    @scala.inline
    def setSetActiveError(value: js.UndefOr[String] => Unit): Self = this.set("setActiveError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetActiveError: Self = this.set("setActiveError", js.undefined)
    @scala.inline
    def setSetActiveErrors(value: js.UndefOr[Array] => Unit): Self = this.set("setActiveErrors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetActiveErrors: Self = this.set("setActiveErrors", js.undefined)
    @scala.inline
    def setSetFieldDefaults(value: js.UndefOr[js.Any] => Unit): Self = this.set("setFieldDefaults", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFieldDefaults: Self = this.set("setFieldDefaults", js.undefined)
    @scala.inline
    def setSetFieldLabel(value: js.UndefOr[String] => Unit): Self = this.set("setFieldLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFieldLabel: Self = this.set("setFieldLabel", js.undefined)
    @scala.inline
    def setSetFieldStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = this.set("setFieldStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFieldStyle: Self = this.set("setFieldStyle", js.undefined)
    @scala.inline
    def setSetRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("setRawValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRawValue: Self = this.set("setRawValue", js.undefined)
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    @scala.inline
    def setSetValue(value: js.UndefOr[js.Any] => _): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setSubmitValue(value: Boolean): Self = this.set("submitValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitValue: Self = this.set("submitValue", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTransformOriginalValue(value: js.UndefOr[js.Any] => _): Self = this.set("transformOriginalValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformOriginalValue: Self = this.set("transformOriginalValue", js.undefined)
    @scala.inline
    def setTransformRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("transformRawValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformRawValue: Self = this.set("transformRawValue", js.undefined)
    @scala.inline
    def setTrimLabelSeparator(value: () => String): Self = this.set("trimLabelSeparator", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTrimLabelSeparator: Self = this.set("trimLabelSeparator", js.undefined)
    @scala.inline
    def setUnsetActiveError(value: () => Unit): Self = this.set("unsetActiveError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnsetActiveError: Self = this.set("unsetActiveError", js.undefined)
    @scala.inline
    def setValidate(value: () => _ | Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnBlur: Self = this.set("validateOnBlur", js.undefined)
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
    @scala.inline
    def setValidateValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = this.set("validateValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateValue: Self = this.set("validateValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueToRaw(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("valueToRaw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValueToRaw: Self = this.set("valueToRaw", js.undefined)
  }
  
}

