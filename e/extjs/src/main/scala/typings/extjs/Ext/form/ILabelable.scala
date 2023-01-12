package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILabelable
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var activeError: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.undefined
  
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
  
  /** [Method] Returns the label for the field
    * @returns String The configured field label, or empty string if not defined
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
  var getLabelableRenderData: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[String] = js.undefined
  
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
  
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the active error message to the given string
    * @param msg String The error message
    */
  var setActiveError: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Set the active error message to an Array of error messages
    * @param errors String[] The error messages
    */
  var setActiveErrors: js.UndefOr[js.Function1[/* errors */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Applies a set of default configuration values to this Labelable instance
    * @param defaults Object The defaults to apply to the object.
    */
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Set the label of this field
    * @param label String The new label. The labelSeparator will be automatically appended to the label string.
    */
  var setFieldLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Returns the trimmed label by slicing off the label separator character
    * @returns String The trimmed field label, or empty string if not defined
    */
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ILabelable {
  
  inline def apply(): ILabelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILabelable] (val x: Self) extends AnyVal {
    
    inline def setActiveError(value: String): Self = StObject.set(x, "activeError", value.asInstanceOf[js.Any])
    
    inline def setActiveErrorUndefined: Self = StObject.set(x, "activeError", js.undefined)
    
    inline def setActiveErrorsTpl(value: Any): Self = StObject.set(x, "activeErrorsTpl", value.asInstanceOf[js.Any])
    
    inline def setActiveErrorsTplUndefined: Self = StObject.set(x, "activeErrorsTpl", js.undefined)
    
    inline def setAfterBodyEl(value: Any): Self = StObject.set(x, "afterBodyEl", value.asInstanceOf[js.Any])
    
    inline def setAfterBodyElUndefined: Self = StObject.set(x, "afterBodyEl", js.undefined)
    
    inline def setAfterLabelTextTpl(value: Any): Self = StObject.set(x, "afterLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterLabelTextTplUndefined: Self = StObject.set(x, "afterLabelTextTpl", js.undefined)
    
    inline def setAfterLabelTpl(value: Any): Self = StObject.set(x, "afterLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterLabelTplUndefined: Self = StObject.set(x, "afterLabelTpl", js.undefined)
    
    inline def setAfterSubTpl(value: Any): Self = StObject.set(x, "afterSubTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterSubTplUndefined: Self = StObject.set(x, "afterSubTpl", js.undefined)
    
    inline def setAutoFitErrors(value: Boolean): Self = StObject.set(x, "autoFitErrors", value.asInstanceOf[js.Any])
    
    inline def setAutoFitErrorsUndefined: Self = StObject.set(x, "autoFitErrors", js.undefined)
    
    inline def setBaseBodyCls(value: String): Self = StObject.set(x, "baseBodyCls", value.asInstanceOf[js.Any])
    
    inline def setBaseBodyClsUndefined: Self = StObject.set(x, "baseBodyCls", js.undefined)
    
    inline def setBeforeBodyEl(value: Any): Self = StObject.set(x, "beforeBodyEl", value.asInstanceOf[js.Any])
    
    inline def setBeforeBodyElUndefined: Self = StObject.set(x, "beforeBodyEl", js.undefined)
    
    inline def setBeforeLabelTextTpl(value: Any): Self = StObject.set(x, "beforeLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeLabelTextTplUndefined: Self = StObject.set(x, "beforeLabelTextTpl", js.undefined)
    
    inline def setBeforeLabelTpl(value: Any): Self = StObject.set(x, "beforeLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeLabelTplUndefined: Self = StObject.set(x, "beforeLabelTpl", js.undefined)
    
    inline def setBeforeSubTpl(value: Any): Self = StObject.set(x, "beforeSubTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeSubTplUndefined: Self = StObject.set(x, "beforeSubTpl", js.undefined)
    
    inline def setBodyEl(value: IElement): Self = StObject.set(x, "bodyEl", value.asInstanceOf[js.Any])
    
    inline def setBodyElUndefined: Self = StObject.set(x, "bodyEl", js.undefined)
    
    inline def setClearCls(value: String): Self = StObject.set(x, "clearCls", value.asInstanceOf[js.Any])
    
    inline def setClearClsUndefined: Self = StObject.set(x, "clearCls", js.undefined)
    
    inline def setErrorEl(value: IElement): Self = StObject.set(x, "errorEl", value.asInstanceOf[js.Any])
    
    inline def setErrorElUndefined: Self = StObject.set(x, "errorEl", js.undefined)
    
    inline def setErrorMsgCls(value: String): Self = StObject.set(x, "errorMsgCls", value.asInstanceOf[js.Any])
    
    inline def setErrorMsgClsUndefined: Self = StObject.set(x, "errorMsgCls", js.undefined)
    
    inline def setFieldBodyCls(value: String): Self = StObject.set(x, "fieldBodyCls", value.asInstanceOf[js.Any])
    
    inline def setFieldBodyClsUndefined: Self = StObject.set(x, "fieldBodyCls", js.undefined)
    
    inline def setFieldLabel(value: String): Self = StObject.set(x, "fieldLabel", value.asInstanceOf[js.Any])
    
    inline def setFieldLabelUndefined: Self = StObject.set(x, "fieldLabel", js.undefined)
    
    inline def setFormItemCls(value: String): Self = StObject.set(x, "formItemCls", value.asInstanceOf[js.Any])
    
    inline def setFormItemClsUndefined: Self = StObject.set(x, "formItemCls", js.undefined)
    
    inline def setGetActiveError(value: () => String): Self = StObject.set(x, "getActiveError", js.Any.fromFunction0(value))
    
    inline def setGetActiveErrorUndefined: Self = StObject.set(x, "getActiveError", js.undefined)
    
    inline def setGetActiveErrors(value: () => Array): Self = StObject.set(x, "getActiveErrors", js.Any.fromFunction0(value))
    
    inline def setGetActiveErrorsUndefined: Self = StObject.set(x, "getActiveErrors", js.undefined)
    
    inline def setGetFieldLabel(value: () => String): Self = StObject.set(x, "getFieldLabel", js.Any.fromFunction0(value))
    
    inline def setGetFieldLabelUndefined: Self = StObject.set(x, "getFieldLabel", js.undefined)
    
    inline def setGetInputId(value: () => String): Self = StObject.set(x, "getInputId", js.Any.fromFunction0(value))
    
    inline def setGetInputIdUndefined: Self = StObject.set(x, "getInputId", js.undefined)
    
    inline def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
    
    inline def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    inline def setGetLabelableRenderData(value: () => Any): Self = StObject.set(x, "getLabelableRenderData", js.Any.fromFunction0(value))
    
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
    
    inline def setInitLabelable(value: () => Unit): Self = StObject.set(x, "initLabelable", js.Any.fromFunction0(value))
    
    inline def setInitLabelableUndefined: Self = StObject.set(x, "initLabelable", js.undefined)
    
    inline def setInvalidCls(value: String): Self = StObject.set(x, "invalidCls", value.asInstanceOf[js.Any])
    
    inline def setInvalidClsUndefined: Self = StObject.set(x, "invalidCls", js.undefined)
    
    inline def setIsFieldLabelable(value: Boolean): Self = StObject.set(x, "isFieldLabelable", value.asInstanceOf[js.Any])
    
    inline def setIsFieldLabelableUndefined: Self = StObject.set(x, "isFieldLabelable", js.undefined)
    
    inline def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelAttrTpl(value: Any): Self = StObject.set(x, "labelAttrTpl", value.asInstanceOf[js.Any])
    
    inline def setLabelAttrTplUndefined: Self = StObject.set(x, "labelAttrTpl", js.undefined)
    
    inline def setLabelCell(value: IElement): Self = StObject.set(x, "labelCell", value.asInstanceOf[js.Any])
    
    inline def setLabelCellUndefined: Self = StObject.set(x, "labelCell", js.undefined)
    
    inline def setLabelCls(value: String): Self = StObject.set(x, "labelCls", value.asInstanceOf[js.Any])
    
    inline def setLabelClsExtra(value: String): Self = StObject.set(x, "labelClsExtra", value.asInstanceOf[js.Any])
    
    inline def setLabelClsExtraUndefined: Self = StObject.set(x, "labelClsExtra", js.undefined)
    
    inline def setLabelClsUndefined: Self = StObject.set(x, "labelCls", js.undefined)
    
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
    
    inline def setPreventMark(value: Boolean): Self = StObject.set(x, "preventMark", value.asInstanceOf[js.Any])
    
    inline def setPreventMarkUndefined: Self = StObject.set(x, "preventMark", js.undefined)
    
    inline def setSetActiveError(value: /* msg */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setActiveError", js.Any.fromFunction1(value))
    
    inline def setSetActiveErrorUndefined: Self = StObject.set(x, "setActiveError", js.undefined)
    
    inline def setSetActiveErrors(value: /* errors */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setActiveErrors", js.Any.fromFunction1(value))
    
    inline def setSetActiveErrorsUndefined: Self = StObject.set(x, "setActiveErrors", js.undefined)
    
    inline def setSetFieldDefaults(value: /* defaults */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setFieldDefaults", js.Any.fromFunction1(value))
    
    inline def setSetFieldDefaultsUndefined: Self = StObject.set(x, "setFieldDefaults", js.undefined)
    
    inline def setSetFieldLabel(value: /* label */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFieldLabel", js.Any.fromFunction1(value))
    
    inline def setSetFieldLabelUndefined: Self = StObject.set(x, "setFieldLabel", js.undefined)
    
    inline def setTrimLabelSeparator(value: () => String): Self = StObject.set(x, "trimLabelSeparator", js.Any.fromFunction0(value))
    
    inline def setTrimLabelSeparatorUndefined: Self = StObject.set(x, "trimLabelSeparator", js.undefined)
    
    inline def setUnsetActiveError(value: () => Unit): Self = StObject.set(x, "unsetActiveError", js.Any.fromFunction0(value))
    
    inline def setUnsetActiveErrorUndefined: Self = StObject.set(x, "unsetActiveError", js.undefined)
  }
}
