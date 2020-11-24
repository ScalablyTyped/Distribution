package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabelable extends IBase {
  
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
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
  
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
  
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
    * @returns String The markup to be inserted
    */
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.native
  
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
  
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.native
  
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
  
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the active error message to the given string
    * @param msg String The error message
    */
  var setActiveError: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Set the active error message to an Array of error messages
    * @param errors String[] The error messages
    */
  var setActiveErrors: js.UndefOr[js.Function1[/* errors */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Applies a set of default configuration values to this Labelable instance
    * @param defaults Object The defaults to apply to the object.
    */
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Set the label of this field
    * @param label String The new label. The labelSeparator will be automatically appended to the label string.
    */
  var setFieldLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Returns the trimmed label by slicing off the label separator character
    * @returns String The trimmed field label, or empty string if not defined
    */
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.native
}
object ILabelable {
  
  @scala.inline
  def apply(): ILabelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabelable]
  }
  
  @scala.inline
  implicit class ILabelableOps[Self <: ILabelable] (val x: Self) extends AnyVal {
    
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
    def setBeforeSubTpl(value: js.Any): Self = this.set("beforeSubTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeSubTpl: Self = this.set("beforeSubTpl", js.undefined)
    
    @scala.inline
    def setBodyEl(value: IElement): Self = this.set("bodyEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyEl: Self = this.set("bodyEl", js.undefined)
    
    @scala.inline
    def setClearCls(value: String): Self = this.set("clearCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearCls: Self = this.set("clearCls", js.undefined)
    
    @scala.inline
    def setErrorEl(value: IElement): Self = this.set("errorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorEl: Self = this.set("errorEl", js.undefined)
    
    @scala.inline
    def setErrorMsgCls(value: String): Self = this.set("errorMsgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMsgCls: Self = this.set("errorMsgCls", js.undefined)
    
    @scala.inline
    def setFieldBodyCls(value: String): Self = this.set("fieldBodyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldBodyCls: Self = this.set("fieldBodyCls", js.undefined)
    
    @scala.inline
    def setFieldLabel(value: String): Self = this.set("fieldLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldLabel: Self = this.set("fieldLabel", js.undefined)
    
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
    def setGetSubTplMarkup(value: () => String): Self = this.set("getSubTplMarkup", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSubTplMarkup: Self = this.set("getSubTplMarkup", js.undefined)
    
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
    def setInitLabelable(value: () => Unit): Self = this.set("initLabelable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitLabelable: Self = this.set("initLabelable", js.undefined)
    
    @scala.inline
    def setInvalidCls(value: String): Self = this.set("invalidCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidCls: Self = this.set("invalidCls", js.undefined)
    
    @scala.inline
    def setIsFieldLabelable(value: Boolean): Self = this.set("isFieldLabelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFieldLabelable: Self = this.set("isFieldLabelable", js.undefined)
    
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
    def setMsgTarget(value: String): Self = this.set("msgTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgTarget: Self = this.set("msgTarget", js.undefined)
    
    @scala.inline
    def setPreventMark(value: Boolean): Self = this.set("preventMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventMark: Self = this.set("preventMark", js.undefined)
    
    @scala.inline
    def setSetActiveError(value: /* msg */ js.UndefOr[String] => Unit): Self = this.set("setActiveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveError: Self = this.set("setActiveError", js.undefined)
    
    @scala.inline
    def setSetActiveErrors(value: /* errors */ js.UndefOr[Array] => Unit): Self = this.set("setActiveErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveErrors: Self = this.set("setActiveErrors", js.undefined)
    
    @scala.inline
    def setSetFieldDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = this.set("setFieldDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFieldDefaults: Self = this.set("setFieldDefaults", js.undefined)
    
    @scala.inline
    def setSetFieldLabel(value: /* label */ js.UndefOr[String] => Unit): Self = this.set("setFieldLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFieldLabel: Self = this.set("setFieldLabel", js.undefined)
    
    @scala.inline
    def setTrimLabelSeparator(value: () => String): Self = this.set("trimLabelSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTrimLabelSeparator: Self = this.set("trimLabelSeparator", js.undefined)
    
    @scala.inline
    def setUnsetActiveError(value: () => Unit): Self = this.set("unsetActiveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnsetActiveError: Self = this.set("unsetActiveError", js.undefined)
  }
}
