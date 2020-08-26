package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.form.IFieldContainer
import typings.extjs.Ext.toolbar.IToolbar
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ @js.native
trait IHtmlEditor extends IFieldContainer {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterIFrameTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterTextAreaTpl: js.UndefOr[js.Any] = js.native
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeIFrameTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeTextAreaTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var buttonTips: js.UndefOr[js.Any] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] If you need want custom HTML cleanup this is the method you should override
    * @param html String The HTML to be cleaned
    * @returns String The cleaned HTML
    */
  var cleanHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], String]] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var createLinkText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultLinkValue: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultValue: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var enableAlignments: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableColors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFont: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFontSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFormat: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableLinks: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableLists: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableSourceEdit: js.UndefOr[Boolean] = js.native
  /** [Method] Executes a Midas editor command directly on the editor document
    * @param cmd String The Midas command
    * @param value String/Boolean The value to pass to the command
    */
  var execCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.native
  /** [Method] Try to focus this component
    * @param selectText Object
    * @param delay Object
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  @JSName("focus")
  var focus_IHtmlEditor: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Config Option] (String[]) */
  var fontFamilies: js.UndefOr[Array] = js.native
  /** [Method] Called when the editor initializes the iframe with HTML contents  */
  var getDocMarkup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
    * @param value Object The value to get errors for (defaults to the current field value)
    * @returns String[] All error messages for this field; an empty Array if none.
    */
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | Array]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the editor s toolbar
    * @returns Ext.toolbar.Toolbar
    */
  var getToolbar: js.UndefOr[js.Function0[IToolbar]] = js.native
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var iframeAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Inserts the passed text at the current cursor position
    * @param text String
    */
  var insertAtCursor: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Returns whether two field values are logically equal
    * @param value1 Object
    * @param value2 Object
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Method] Pushes the value of the textarea into the iframe editor  */
  var pushValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Executes a Midas editor command on the editor document and performs necessary focus and toolbar updates
    * @param cmd String The Midas command
    * @param value String/Boolean The value to pass to the command
    */
  var relayCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the read only state of this field
    * @param readOnly Boolean Whether the field should be read only.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object
    * @returns any this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Method] Syncs the contents of the editor iframe with the textarea  */
  var syncValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Toggles the editor between standard and source edit mode
    * @param sourceEditMode Boolean True for source edit, false for standard
    */
  var toggleSourceEdit: js.UndefOr[js.Function1[/* sourceEditMode */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Triggers a toolbar update by reading the markup state of the current selection in the editor  */
  var updateToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns any True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}

object IHtmlEditor {
  @scala.inline
  def apply(): IHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlEditor]
  }
  @scala.inline
  implicit class IHtmlEditorOps[Self <: IHtmlEditor] (val x: Self) extends AnyVal {
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
    def setAfterIFrameTpl(value: js.Any): Self = this.set("afterIFrameTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterIFrameTpl: Self = this.set("afterIFrameTpl", js.undefined)
    @scala.inline
    def setAfterTextAreaTpl(value: js.Any): Self = this.set("afterTextAreaTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterTextAreaTpl: Self = this.set("afterTextAreaTpl", js.undefined)
    @scala.inline
    def setBatchChanges(value: js.UndefOr[js.Any] => Unit): Self = this.set("batchChanges", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchChanges: Self = this.set("batchChanges", js.undefined)
    @scala.inline
    def setBeforeIFrameTpl(value: js.Any): Self = this.set("beforeIFrameTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeIFrameTpl: Self = this.set("beforeIFrameTpl", js.undefined)
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = this.set("beforeReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    @scala.inline
    def setBeforeTextAreaTpl(value: js.Any): Self = this.set("beforeTextAreaTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTextAreaTpl: Self = this.set("beforeTextAreaTpl", js.undefined)
    @scala.inline
    def setButtonTips(value: js.Any): Self = this.set("buttonTips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonTips: Self = this.set("buttonTips", js.undefined)
    @scala.inline
    def setCheckChange(value: () => Unit): Self = this.set("checkChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = this.set("checkDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckDirty: Self = this.set("checkDirty", js.undefined)
    @scala.inline
    def setCleanHtml(value: /* html */ js.UndefOr[String] => String): Self = this.set("cleanHtml", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCleanHtml: Self = this.set("cleanHtml", js.undefined)
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = this.set("clearInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    @scala.inline
    def setCreateLinkText(value: String): Self = this.set("createLinkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateLinkText: Self = this.set("createLinkText", js.undefined)
    @scala.inline
    def setDefaultButtonUI(value: String): Self = this.set("defaultButtonUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultButtonUI: Self = this.set("defaultButtonUI", js.undefined)
    @scala.inline
    def setDefaultLinkValue(value: String): Self = this.set("defaultLinkValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLinkValue: Self = this.set("defaultLinkValue", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEnableAlignments(value: Boolean): Self = this.set("enableAlignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAlignments: Self = this.set("enableAlignments", js.undefined)
    @scala.inline
    def setEnableColors(value: Boolean): Self = this.set("enableColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColors: Self = this.set("enableColors", js.undefined)
    @scala.inline
    def setEnableFont(value: Boolean): Self = this.set("enableFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFont: Self = this.set("enableFont", js.undefined)
    @scala.inline
    def setEnableFontSize(value: Boolean): Self = this.set("enableFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFontSize: Self = this.set("enableFontSize", js.undefined)
    @scala.inline
    def setEnableFormat(value: Boolean): Self = this.set("enableFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFormat: Self = this.set("enableFormat", js.undefined)
    @scala.inline
    def setEnableLinks(value: Boolean): Self = this.set("enableLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLinks: Self = this.set("enableLinks", js.undefined)
    @scala.inline
    def setEnableLists(value: Boolean): Self = this.set("enableLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLists: Self = this.set("enableLists", js.undefined)
    @scala.inline
    def setEnableSourceEdit(value: Boolean): Self = this.set("enableSourceEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSourceEdit: Self = this.set("enableSourceEdit", js.undefined)
    @scala.inline
    def setExecCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("execCmd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExecCmd: Self = this.set("execCmd", js.undefined)
    @scala.inline
    def setExtractFileInput(value: () => _ | HTMLElement): Self = this.set("extractFileInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExtractFileInput: Self = this.set("extractFileInput", js.undefined)
    @scala.inline
    def setFocus(value: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => IComponent): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFontFamilies(value: Array): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamilies: Self = this.set("fontFamilies", js.undefined)
    @scala.inline
    def setGetDocMarkup(value: () => Unit): Self = this.set("getDocMarkup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDocMarkup: Self = this.set("getDocMarkup", js.undefined)
    @scala.inline
    def setGetErrors(value: js.UndefOr[js.Any] => _ | Array): Self = this.set("getErrors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetErrors: Self = this.set("getErrors", js.undefined)
    @scala.inline
    def setGetModelData(value: () => _): Self = this.set("getModelData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModelData: Self = this.set("getModelData", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetSubmitData(value: () => _): Self = this.set("getSubmitData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmitData: Self = this.set("getSubmitData", js.undefined)
    @scala.inline
    def setGetToolbar(value: () => IToolbar): Self = this.set("getToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetToolbar: Self = this.set("getToolbar", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setIframeAttrTpl(value: js.Any): Self = this.set("iframeAttrTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeAttrTpl: Self = this.set("iframeAttrTpl", js.undefined)
    @scala.inline
    def setInitField(value: () => Unit): Self = this.set("initField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitField: Self = this.set("initField", js.undefined)
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    @scala.inline
    def setInsertAtCursor(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("insertAtCursor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInsertAtCursor: Self = this.set("insertAtCursor", js.undefined)
    @scala.inline
    def setIsDirty(value: () => _ | Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsEqual(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean): Self = this.set("isEqual", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
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
    def setMarkInvalid(value: js.UndefOr[js.Any] => Unit): Self = this.set("markInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    @scala.inline
    def setPushValue(value: () => Unit): Self = this.set("pushValue", js.Any.fromFunction0(value))
    @scala.inline
    def deletePushValue: Self = this.set("pushValue", js.undefined)
    @scala.inline
    def setRelayCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("relayCmd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayCmd: Self = this.set("relayCmd", js.undefined)
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = this.set("resetOriginalValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetOriginalValue: Self = this.set("resetOriginalValue", js.undefined)
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
    def setSyncValue(value: () => Unit): Self = this.set("syncValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSyncValue: Self = this.set("syncValue", js.undefined)
    @scala.inline
    def setToggleSourceEdit(value: /* sourceEditMode */ js.UndefOr[Boolean] => Unit): Self = this.set("toggleSourceEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleSourceEdit: Self = this.set("toggleSourceEdit", js.undefined)
    @scala.inline
    def setTransformOriginalValue(value: js.UndefOr[js.Any] => _): Self = this.set("transformOriginalValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformOriginalValue: Self = this.set("transformOriginalValue", js.undefined)
    @scala.inline
    def setUpdateToolbar(value: () => Unit): Self = this.set("updateToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateToolbar: Self = this.set("updateToolbar", js.undefined)
    @scala.inline
    def setValidate(value: () => _): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

