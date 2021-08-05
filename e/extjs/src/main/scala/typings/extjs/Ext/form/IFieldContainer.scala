package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IElement
import typings.extjs.Ext.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange
- typings.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ trait IFieldContainer
  extends StObject
     with IContainer {
  
  /** [Config Option] (String) */
  var activeError: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var combineErrors: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var combineLabels: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Gets the active error message for this component if any
    * @returns String The active error message on the component; if there is no error, an empty string is returned.
    */
  var getActiveError: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Gets an Array of any active error messages currently applied to the field
    * @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
    */
  var getActiveErrors: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Takes an Array of invalid Ext form field Field objects and builds a combined list of error messages from them
    * @param invalidFields Ext.form.field.Field[] An Array of the sub-fields which are currently invalid.
    * @returns String[] The combined list of error messages
    */
  var getCombinedErrors: js.UndefOr[js.Function1[/* invalidFields */ js.UndefOr[Array], Array]] = js.undefined
  
  /** [Method] Returns the combined field label if combineLabels is set to true and if there is no set fieldLabel
    * @returns String The label, or empty string if none.
    */
  var getFieldLabel: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Get the input id if any for this component
    * @returns String The input id
    */
  var getInputId: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Gets the width of the label if visible
    * @returns Number The label width
    */
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Generates the arguments for the field decorations rendering template
    * @returns Object The template arguments
    */
  var getLabelableRenderData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
    * @returns String The markup to be inserted
    */
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Tells whether the field currently has an active error message
    * @returns Boolean
    */
  var hasActiveError: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Checks if the field has a visible label
    * @returns Boolean True if the field has a visible label
    */
  var hasVisibleLabel: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  @JSName("initRenderData")
  var initRenderData_IFieldContainer: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var labelConnector: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.undefined
  
  /** [Method] Called when a Ext form Labelable instance is added to the container s subtree
    * @param labelable Ext.form.Labelable The instance that was added
    */
  @JSName("onAdd")
  var onAdd_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.undefined
  
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
    * @param labelable Ext.form.Labelable The instance that was removed
    */
  @JSName("onRemove")
  var onRemove_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the active error message to the given string
    * @param msg String The error message
    */
  var setActiveError: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Set the active error message to an Array of error messages
    * @param errors String[] The error messages
    */
  var setActiveErrors: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Applies a set of default configuration values to this Labelable instance
    * @param defaults Object The defaults to apply to the object.
    */
  var setFieldDefaults: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Set the label of this field
    * @param label String The new label. The labelSeparator will be automatically appended to the label string.
    */
  var setFieldLabel: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Returns the trimmed label by slicing off the label separator character
    * @returns String The trimmed field label, or empty string if not defined
    */
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IFieldContainer {
  
  inline def apply(): IFieldContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldContainer]
  }
  
  extension [Self <: IFieldContainer](x: Self) {
    
    inline def setActiveError(value: String): Self = StObject.set(x, "activeError", value.asInstanceOf[js.Any])
    
    inline def setActiveErrorUndefined: Self = StObject.set(x, "activeError", js.undefined)
    
    inline def setActiveErrorsTpl(value: js.Any): Self = StObject.set(x, "activeErrorsTpl", value.asInstanceOf[js.Any])
    
    inline def setActiveErrorsTplUndefined: Self = StObject.set(x, "activeErrorsTpl", js.undefined)
    
    inline def setAfterBodyEl(value: js.Any): Self = StObject.set(x, "afterBodyEl", value.asInstanceOf[js.Any])
    
    inline def setAfterBodyElUndefined: Self = StObject.set(x, "afterBodyEl", js.undefined)
    
    inline def setAfterLabelTextTpl(value: js.Any): Self = StObject.set(x, "afterLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterLabelTextTplUndefined: Self = StObject.set(x, "afterLabelTextTpl", js.undefined)
    
    inline def setAfterLabelTpl(value: js.Any): Self = StObject.set(x, "afterLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterLabelTplUndefined: Self = StObject.set(x, "afterLabelTpl", js.undefined)
    
    inline def setAfterSubTpl(value: js.Any): Self = StObject.set(x, "afterSubTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterSubTplUndefined: Self = StObject.set(x, "afterSubTpl", js.undefined)
    
    inline def setAutoFitErrors(value: Boolean): Self = StObject.set(x, "autoFitErrors", value.asInstanceOf[js.Any])
    
    inline def setAutoFitErrorsUndefined: Self = StObject.set(x, "autoFitErrors", js.undefined)
    
    inline def setBaseBodyCls(value: String): Self = StObject.set(x, "baseBodyCls", value.asInstanceOf[js.Any])
    
    inline def setBaseBodyClsUndefined: Self = StObject.set(x, "baseBodyCls", js.undefined)
    
    inline def setBeforeBodyEl(value: js.Any): Self = StObject.set(x, "beforeBodyEl", value.asInstanceOf[js.Any])
    
    inline def setBeforeBodyElUndefined: Self = StObject.set(x, "beforeBodyEl", js.undefined)
    
    inline def setBeforeLabelTextTpl(value: js.Any): Self = StObject.set(x, "beforeLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeLabelTextTplUndefined: Self = StObject.set(x, "beforeLabelTextTpl", js.undefined)
    
    inline def setBeforeLabelTpl(value: js.Any): Self = StObject.set(x, "beforeLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeLabelTplUndefined: Self = StObject.set(x, "beforeLabelTpl", js.undefined)
    
    inline def setBeforeSubTpl(value: js.Any): Self = StObject.set(x, "beforeSubTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeSubTplUndefined: Self = StObject.set(x, "beforeSubTpl", js.undefined)
    
    inline def setBodyEl(value: IElement): Self = StObject.set(x, "bodyEl", value.asInstanceOf[js.Any])
    
    inline def setBodyElUndefined: Self = StObject.set(x, "bodyEl", js.undefined)
    
    inline def setClearCls(value: String): Self = StObject.set(x, "clearCls", value.asInstanceOf[js.Any])
    
    inline def setClearClsUndefined: Self = StObject.set(x, "clearCls", js.undefined)
    
    inline def setCombineErrors(value: Boolean): Self = StObject.set(x, "combineErrors", value.asInstanceOf[js.Any])
    
    inline def setCombineErrorsUndefined: Self = StObject.set(x, "combineErrors", js.undefined)
    
    inline def setCombineLabels(value: Boolean): Self = StObject.set(x, "combineLabels", value.asInstanceOf[js.Any])
    
    inline def setCombineLabelsUndefined: Self = StObject.set(x, "combineLabels", js.undefined)
    
    inline def setErrorEl(value: IElement): Self = StObject.set(x, "errorEl", value.asInstanceOf[js.Any])
    
    inline def setErrorElUndefined: Self = StObject.set(x, "errorEl", js.undefined)
    
    inline def setErrorMsgCls(value: String): Self = StObject.set(x, "errorMsgCls", value.asInstanceOf[js.Any])
    
    inline def setErrorMsgClsUndefined: Self = StObject.set(x, "errorMsgCls", js.undefined)
    
    inline def setFieldBodyCls(value: String): Self = StObject.set(x, "fieldBodyCls", value.asInstanceOf[js.Any])
    
    inline def setFieldBodyClsUndefined: Self = StObject.set(x, "fieldBodyCls", js.undefined)
    
    inline def setFieldDefaults(value: js.Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    inline def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    inline def setFieldLabel(value: String): Self = StObject.set(x, "fieldLabel", value.asInstanceOf[js.Any])
    
    inline def setFieldLabelUndefined: Self = StObject.set(x, "fieldLabel", js.undefined)
    
    inline def setFormItemCls(value: String): Self = StObject.set(x, "formItemCls", value.asInstanceOf[js.Any])
    
    inline def setFormItemClsUndefined: Self = StObject.set(x, "formItemCls", js.undefined)
    
    inline def setGetActiveError(value: () => String): Self = StObject.set(x, "getActiveError", js.Any.fromFunction0(value))
    
    inline def setGetActiveErrorUndefined: Self = StObject.set(x, "getActiveError", js.undefined)
    
    inline def setGetActiveErrors(value: () => Array): Self = StObject.set(x, "getActiveErrors", js.Any.fromFunction0(value))
    
    inline def setGetActiveErrorsUndefined: Self = StObject.set(x, "getActiveErrors", js.undefined)
    
    inline def setGetCombinedErrors(value: /* invalidFields */ js.UndefOr[Array] => Array): Self = StObject.set(x, "getCombinedErrors", js.Any.fromFunction1(value))
    
    inline def setGetCombinedErrorsUndefined: Self = StObject.set(x, "getCombinedErrors", js.undefined)
    
    inline def setGetFieldLabel(value: () => String): Self = StObject.set(x, "getFieldLabel", js.Any.fromFunction0(value))
    
    inline def setGetFieldLabelUndefined: Self = StObject.set(x, "getFieldLabel", js.undefined)
    
    inline def setGetInputId(value: () => String): Self = StObject.set(x, "getInputId", js.Any.fromFunction0(value))
    
    inline def setGetInputIdUndefined: Self = StObject.set(x, "getInputId", js.undefined)
    
    inline def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
    
    inline def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    inline def setGetLabelableRenderData(value: () => js.Any): Self = StObject.set(x, "getLabelableRenderData", js.Any.fromFunction0(value))
    
    inline def setGetLabelableRenderDataUndefined: Self = StObject.set(x, "getLabelableRenderData", js.undefined)
    
    inline def setGetSubTplMarkup(value: () => String): Self = StObject.set(x, "getSubTplMarkup", js.Any.fromFunction0(value))
    
    inline def setGetSubTplMarkupUndefined: Self = StObject.set(x, "getSubTplMarkup", js.undefined)
    
    inline def setHasActiveError(value: () => Boolean): Self = StObject.set(x, "hasActiveError", js.Any.fromFunction0(value))
    
    inline def setHasActiveErrorUndefined: Self = StObject.set(x, "hasActiveError", js.undefined)
    
    inline def setHasVisibleLabel(value: () => Boolean): Self = StObject.set(x, "hasVisibleLabel", js.Any.fromFunction0(value))
    
    inline def setHasVisibleLabelUndefined: Self = StObject.set(x, "hasVisibleLabel", js.undefined)
    
    inline def setHideEmptyLabel(value: Boolean): Self = StObject.set(x, "hideEmptyLabel", value.asInstanceOf[js.Any])
    
    inline def setHideEmptyLabelUndefined: Self = StObject.set(x, "hideEmptyLabel", js.undefined)
    
    inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    
    inline def setInitFieldAncestor(value: () => Unit): Self = StObject.set(x, "initFieldAncestor", js.Any.fromFunction0(value))
    
    inline def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    inline def setInitLabelable(value: () => Unit): Self = StObject.set(x, "initLabelable", js.Any.fromFunction0(value))
    
    inline def setInitLabelableUndefined: Self = StObject.set(x, "initLabelable", js.undefined)
    
    inline def setInitRenderData(value: () => js.Any): Self = StObject.set(x, "initRenderData", js.Any.fromFunction0(value))
    
    inline def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    inline def setInvalidCls(value: String): Self = StObject.set(x, "invalidCls", value.asInstanceOf[js.Any])
    
    inline def setInvalidClsUndefined: Self = StObject.set(x, "invalidCls", js.undefined)
    
    inline def setIsFieldLabelable(value: Boolean): Self = StObject.set(x, "isFieldLabelable", value.asInstanceOf[js.Any])
    
    inline def setIsFieldLabelableUndefined: Self = StObject.set(x, "isFieldLabelable", js.undefined)
    
    inline def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelAttrTpl(value: js.Any): Self = StObject.set(x, "labelAttrTpl", value.asInstanceOf[js.Any])
    
    inline def setLabelAttrTplUndefined: Self = StObject.set(x, "labelAttrTpl", js.undefined)
    
    inline def setLabelCell(value: IElement): Self = StObject.set(x, "labelCell", value.asInstanceOf[js.Any])
    
    inline def setLabelCellUndefined: Self = StObject.set(x, "labelCell", js.undefined)
    
    inline def setLabelCls(value: String): Self = StObject.set(x, "labelCls", value.asInstanceOf[js.Any])
    
    inline def setLabelClsExtra(value: String): Self = StObject.set(x, "labelClsExtra", value.asInstanceOf[js.Any])
    
    inline def setLabelClsExtraUndefined: Self = StObject.set(x, "labelClsExtra", js.undefined)
    
    inline def setLabelClsUndefined: Self = StObject.set(x, "labelCls", js.undefined)
    
    inline def setLabelConnector(value: String): Self = StObject.set(x, "labelConnector", value.asInstanceOf[js.Any])
    
    inline def setLabelConnectorUndefined: Self = StObject.set(x, "labelConnector", js.undefined)
    
    inline def setLabelEl(value: IElement): Self = StObject.set(x, "labelEl", value.asInstanceOf[js.Any])
    
    inline def setLabelElUndefined: Self = StObject.set(x, "labelEl", js.undefined)
    
    inline def setLabelPad(value: Double): Self = StObject.set(x, "labelPad", value.asInstanceOf[js.Any])
    
    inline def setLabelPadUndefined: Self = StObject.set(x, "labelPad", js.undefined)
    
    inline def setLabelSeparator(value: String): Self = StObject.set(x, "labelSeparator", value.asInstanceOf[js.Any])
    
    inline def setLabelSeparatorUndefined: Self = StObject.set(x, "labelSeparator", js.undefined)
    
    inline def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    inline def setMsgTarget(value: String): Self = StObject.set(x, "msgTarget", value.asInstanceOf[js.Any])
    
    inline def setMsgTargetUndefined: Self = StObject.set(x, "msgTarget", js.undefined)
    
    inline def setOnAdd(value: /* labelable */ js.UndefOr[ILabelable] => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2(value))
    
    inline def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    inline def setOnFieldValidityChange(value: (js.UndefOr[typings.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2(value))
    
    inline def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
    
    inline def setOnRemove(value: /* labelable */ js.UndefOr[ILabelable] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setPreventMark(value: Boolean): Self = StObject.set(x, "preventMark", value.asInstanceOf[js.Any])
    
    inline def setPreventMarkUndefined: Self = StObject.set(x, "preventMark", js.undefined)
    
    inline def setSetActiveError(value: js.UndefOr[String] => Unit): Self = StObject.set(x, "setActiveError", js.Any.fromFunction1(value))
    
    inline def setSetActiveErrorUndefined: Self = StObject.set(x, "setActiveError", js.undefined)
    
    inline def setSetActiveErrors(value: js.UndefOr[Array] => Unit): Self = StObject.set(x, "setActiveErrors", js.Any.fromFunction1(value))
    
    inline def setSetActiveErrorsUndefined: Self = StObject.set(x, "setActiveErrors", js.undefined)
    
    inline def setSetFieldDefaults(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFieldDefaults", js.Any.fromFunction1(value))
    
    inline def setSetFieldDefaultsUndefined: Self = StObject.set(x, "setFieldDefaults", js.undefined)
    
    inline def setSetFieldLabel(value: js.UndefOr[String] => Unit): Self = StObject.set(x, "setFieldLabel", js.Any.fromFunction1(value))
    
    inline def setSetFieldLabelUndefined: Self = StObject.set(x, "setFieldLabel", js.undefined)
    
    inline def setTrimLabelSeparator(value: () => String): Self = StObject.set(x, "trimLabelSeparator", js.Any.fromFunction0(value))
    
    inline def setTrimLabelSeparatorUndefined: Self = StObject.set(x, "trimLabelSeparator", js.undefined)
    
    inline def setUnsetActiveError(value: () => Unit): Self = StObject.set(x, "unsetActiveError", js.Any.fromFunction0(value))
    
    inline def setUnsetActiveErrorUndefined: Self = StObject.set(x, "unsetActiveError", js.undefined)
  }
}
