package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.formNs.fieldNs.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait IHtmlEditor extends IFieldContainer {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterIFrameTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterTextAreaTpl: js.UndefOr[js.Any] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeIFrameTpl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeTextAreaTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var buttonTips: js.UndefOr[js.Any] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] If you need want custom HTML cleanup this is the method you should override
  		* @param html String The HTML to be cleaned
  		* @returns String The cleaned HTML
  		*/
  var cleanHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var createLinkText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultLinkValue: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableAlignments: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColors: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableFont: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableFontSize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableFormat: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableLinks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableLists: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableSourceEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Executes a Midas editor command directly on the editor document
  		* @param cmd String The Midas command
  		* @param value String/Boolean The value to pass to the command
  		*/
  var execCmd: js.UndefOr[
    js.Function2[/* cmd */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | stdLib.HTMLElement]] = js.undefined
  /** [Method] Try to focus this component
  		* @param selectText Object
  		* @param delay Object
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IHtmlEditor: js.UndefOr[
    js.Function2[
      /* selectText */ js.UndefOr[js.Any], 
      /* delay */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Config Option] (String[]) */
  var fontFamilies: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Called when the editor initializes the iframe with HTML contents  */
  var getDocMarkup: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns String[] All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the editor s toolbar
  		* @returns Ext.toolbar.Toolbar
  		*/
  var getToolbar: js.UndefOr[js.Function0[extjsLib.ExtNs.toolbarNs.IToolbar]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var iframeAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Inserts the passed text at the current cursor position
  		* @param text String
  		*/
  var insertAtCursor: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object
  		* @param value2 Object
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | scala.Boolean]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Pushes the value of the textarea into the iframe editor  */
  var pushValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Executes a Midas editor command on the editor document and performs necessary focus and toolbar updates
  		* @param cmd String The Midas command
  		* @param value String/Boolean The value to pass to the command
  		*/
  var relayCmd: js.UndefOr[
    js.Function2[/* cmd */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Boolean Whether the field should be read only.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Syncs the contents of the editor iframe with the textarea  */
  var syncValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Toggles the editor between standard and source edit mode
  		* @param sourceEditMode Boolean True for source edit, false for standard
  		*/
  var toggleSourceEdit: js.UndefOr[js.Function1[/* sourceEditMode */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Triggers a toolbar update by reading the markup state of the current selection in the editor  */
  var updateToolbar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns any True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IHtmlEditor {
  @scala.inline
  def apply(
    IField: extjsLib.ExtNs.formNs.fieldNs.IField = null,
    IFieldContainer: IFieldContainer = null,
    afterIFrameTpl: js.Any = null,
    afterTextAreaTpl: js.Any = null,
    batchChanges: /* fn */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeIFrameTpl: js.Any = null,
    beforeReset: () => scala.Unit = null,
    beforeTextAreaTpl: js.Any = null,
    buttonTips: js.Any = null,
    checkChange: () => scala.Unit = null,
    checkDirty: () => scala.Unit = null,
    cleanHtml: /* html */ js.UndefOr[java.lang.String] => java.lang.String = null,
    clearInvalid: () => scala.Unit = null,
    componentLayout: js.Any = null,
    createLinkText: java.lang.String = null,
    defaultButtonUI: java.lang.String = null,
    defaultLinkValue: java.lang.String = null,
    defaultValue: java.lang.String = null,
    enableAlignments: js.UndefOr[scala.Boolean] = js.undefined,
    enableColors: js.UndefOr[scala.Boolean] = js.undefined,
    enableFont: js.UndefOr[scala.Boolean] = js.undefined,
    enableFontSize: js.UndefOr[scala.Boolean] = js.undefined,
    enableFormat: js.UndefOr[scala.Boolean] = js.undefined,
    enableLinks: js.UndefOr[scala.Boolean] = js.undefined,
    enableLists: js.UndefOr[scala.Boolean] = js.undefined,
    enableSourceEdit: js.UndefOr[scala.Boolean] = js.undefined,
    execCmd: (/* cmd */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => scala.Unit = null,
    extractFileInput: () => stdLib.HTMLElement = null,
    focus: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => extjsLib.ExtNs.IComponent = null,
    fontFamilies: extjsLib.ExtNs.Array = null,
    getDocMarkup: () => scala.Unit = null,
    getErrors: /* value */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    getModelData: () => _ = null,
    getName: () => java.lang.String = null,
    getSubmitData: () => _ = null,
    getToolbar: () => extjsLib.ExtNs.toolbarNs.IToolbar = null,
    getValue: () => _ = null,
    iframeAttrTpl: js.Any = null,
    initField: () => scala.Unit = null,
    initValue: () => scala.Unit = null,
    insertAtCursor: /* text */ js.UndefOr[java.lang.String] => scala.Unit = null,
    isDirty: () => scala.Boolean = null,
    isEqual: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => scala.Boolean = null,
    isFileUpload: () => scala.Boolean = null,
    isValid: () => scala.Boolean = null,
    markInvalid: /* errors */ js.UndefOr[js.Any] => scala.Unit = null,
    maskOnDisable: js.UndefOr[scala.Boolean] = js.undefined,
    pushValue: () => scala.Unit = null,
    relayCmd: (/* cmd */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => scala.Unit = null,
    reset: () => scala.Unit = null,
    resetOriginalValue: () => scala.Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    syncValue: () => scala.Unit = null,
    toggleSourceEdit: /* sourceEditMode */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => _ = null,
    updateToolbar: () => scala.Unit = null
  ): IHtmlEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    js.Dynamic.global.Object.assign(__obj, IFieldContainer)
    if (afterIFrameTpl != null) __obj.updateDynamic("afterIFrameTpl")(afterIFrameTpl)
    if (afterTextAreaTpl != null) __obj.updateDynamic("afterTextAreaTpl")(afterTextAreaTpl)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1(batchChanges))
    if (beforeIFrameTpl != null) __obj.updateDynamic("beforeIFrameTpl")(beforeIFrameTpl)
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction0(beforeReset))
    if (beforeTextAreaTpl != null) __obj.updateDynamic("beforeTextAreaTpl")(beforeTextAreaTpl)
    if (buttonTips != null) __obj.updateDynamic("buttonTips")(buttonTips)
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(js.Any.fromFunction0(checkDirty))
    if (cleanHtml != null) __obj.updateDynamic("cleanHtml")(js.Any.fromFunction1(cleanHtml))
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(js.Any.fromFunction0(clearInvalid))
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (createLinkText != null) __obj.updateDynamic("createLinkText")(createLinkText)
    if (defaultButtonUI != null) __obj.updateDynamic("defaultButtonUI")(defaultButtonUI)
    if (defaultLinkValue != null) __obj.updateDynamic("defaultLinkValue")(defaultLinkValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(enableAlignments)) __obj.updateDynamic("enableAlignments")(enableAlignments)
    if (!js.isUndefined(enableColors)) __obj.updateDynamic("enableColors")(enableColors)
    if (!js.isUndefined(enableFont)) __obj.updateDynamic("enableFont")(enableFont)
    if (!js.isUndefined(enableFontSize)) __obj.updateDynamic("enableFontSize")(enableFontSize)
    if (!js.isUndefined(enableFormat)) __obj.updateDynamic("enableFormat")(enableFormat)
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks)
    if (!js.isUndefined(enableLists)) __obj.updateDynamic("enableLists")(enableLists)
    if (!js.isUndefined(enableSourceEdit)) __obj.updateDynamic("enableSourceEdit")(enableSourceEdit)
    if (execCmd != null) __obj.updateDynamic("execCmd")(js.Any.fromFunction2(execCmd))
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(js.Any.fromFunction0(extractFileInput))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (fontFamilies != null) __obj.updateDynamic("fontFamilies")(fontFamilies)
    if (getDocMarkup != null) __obj.updateDynamic("getDocMarkup")(js.Any.fromFunction0(getDocMarkup))
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getModelData != null) __obj.updateDynamic("getModelData")(js.Any.fromFunction0(getModelData))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(js.Any.fromFunction0(getSubmitData))
    if (getToolbar != null) __obj.updateDynamic("getToolbar")(js.Any.fromFunction0(getToolbar))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (iframeAttrTpl != null) __obj.updateDynamic("iframeAttrTpl")(iframeAttrTpl)
    if (initField != null) __obj.updateDynamic("initField")(js.Any.fromFunction0(initField))
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (insertAtCursor != null) __obj.updateDynamic("insertAtCursor")(js.Any.fromFunction1(insertAtCursor))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2(isEqual))
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(js.Any.fromFunction0(isFileUpload))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1(markInvalid))
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable)
    if (pushValue != null) __obj.updateDynamic("pushValue")(js.Any.fromFunction0(pushValue))
    if (relayCmd != null) __obj.updateDynamic("relayCmd")(js.Any.fromFunction2(relayCmd))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (syncValue != null) __obj.updateDynamic("syncValue")(js.Any.fromFunction0(syncValue))
    if (toggleSourceEdit != null) __obj.updateDynamic("toggleSourceEdit")(js.Any.fromFunction1(toggleSourceEdit))
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1(transformOriginalValue))
    if (updateToolbar != null) __obj.updateDynamic("updateToolbar")(js.Any.fromFunction0(updateToolbar))
    __obj.asInstanceOf[IHtmlEditor]
  }
}

