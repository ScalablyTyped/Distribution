package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelable extends IBase {
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
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.undefined
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
  var labelAttrTpl: js.UndefOr[js.Any] = js.undefined
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
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  @scala.inline
  def apply(
    activeError: String = null,
    activeErrorsTpl: js.Any = null,
    afterBodyEl: js.Any = null,
    afterLabelTextTpl: js.Any = null,
    afterLabelTpl: js.Any = null,
    afterSubTpl: js.Any = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoFitErrors: js.UndefOr[Boolean] = js.undefined,
    baseBodyCls: String = null,
    beforeBodyEl: js.Any = null,
    beforeLabelTextTpl: js.Any = null,
    beforeLabelTpl: js.Any = null,
    beforeSubTpl: js.Any = null,
    bodyEl: IElement = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearCls: String = null,
    config: js.Any = null,
    errorEl: IElement = null,
    errorMsgCls: String = null,
    extend: String = null,
    fieldBodyCls: String = null,
    fieldLabel: String = null,
    formItemCls: String = null,
    getActiveError: () => String = null,
    getActiveErrors: () => Array = null,
    getFieldLabel: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getInputId: () => String = null,
    getLabelWidth: () => Double = null,
    getLabelableRenderData: () => _ = null,
    getSubTplMarkup: () => String = null,
    hasActiveError: () => Boolean = null,
    hasVisibleLabel: () => Boolean = null,
    hideEmptyLabel: js.UndefOr[Boolean] = js.undefined,
    hideLabel: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ILabelable = null,
    initLabelable: () => Unit = null,
    invalidCls: String = null,
    isFieldLabelable: js.UndefOr[Boolean] = js.undefined,
    labelAlign: String = null,
    labelAttrTpl: js.Any = null,
    labelCell: IElement = null,
    labelCls: String = null,
    labelClsExtra: String = null,
    labelEl: IElement = null,
    labelPad: js.UndefOr[Double] = js.undefined,
    labelSeparator: String = null,
    labelStyle: String = null,
    labelWidth: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    msgTarget: String = null,
    preventMark: js.UndefOr[Boolean] = js.undefined,
    requires: Array = null,
    self: IClass = null,
    setActiveError: /* msg */ js.UndefOr[String] => Unit = null,
    setActiveErrors: /* errors */ js.UndefOr[Array] => Unit = null,
    setFieldDefaults: /* defaults */ js.UndefOr[js.Any] => Unit = null,
    setFieldLabel: /* label */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    trimLabelSeparator: () => String = null,
    unsetActiveError: () => Unit = null,
    uses: Array = null
  ): ILabelable = {
    val __obj = js.Dynamic.literal()
    if (activeError != null) __obj.updateDynamic("activeError")(activeError.asInstanceOf[js.Any])
    if (activeErrorsTpl != null) __obj.updateDynamic("activeErrorsTpl")(activeErrorsTpl.asInstanceOf[js.Any])
    if (afterBodyEl != null) __obj.updateDynamic("afterBodyEl")(afterBodyEl.asInstanceOf[js.Any])
    if (afterLabelTextTpl != null) __obj.updateDynamic("afterLabelTextTpl")(afterLabelTextTpl.asInstanceOf[js.Any])
    if (afterLabelTpl != null) __obj.updateDynamic("afterLabelTpl")(afterLabelTpl.asInstanceOf[js.Any])
    if (afterSubTpl != null) __obj.updateDynamic("afterSubTpl")(afterSubTpl.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFitErrors)) __obj.updateDynamic("autoFitErrors")(autoFitErrors.get.asInstanceOf[js.Any])
    if (baseBodyCls != null) __obj.updateDynamic("baseBodyCls")(baseBodyCls.asInstanceOf[js.Any])
    if (beforeBodyEl != null) __obj.updateDynamic("beforeBodyEl")(beforeBodyEl.asInstanceOf[js.Any])
    if (beforeLabelTextTpl != null) __obj.updateDynamic("beforeLabelTextTpl")(beforeLabelTextTpl.asInstanceOf[js.Any])
    if (beforeLabelTpl != null) __obj.updateDynamic("beforeLabelTpl")(beforeLabelTpl.asInstanceOf[js.Any])
    if (beforeSubTpl != null) __obj.updateDynamic("beforeSubTpl")(beforeSubTpl.asInstanceOf[js.Any])
    if (bodyEl != null) __obj.updateDynamic("bodyEl")(bodyEl.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearCls != null) __obj.updateDynamic("clearCls")(clearCls.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (errorEl != null) __obj.updateDynamic("errorEl")(errorEl.asInstanceOf[js.Any])
    if (errorMsgCls != null) __obj.updateDynamic("errorMsgCls")(errorMsgCls.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    if (formItemCls != null) __obj.updateDynamic("formItemCls")(formItemCls.asInstanceOf[js.Any])
    if (getActiveError != null) __obj.updateDynamic("getActiveError")(js.Any.fromFunction0(getActiveError))
    if (getActiveErrors != null) __obj.updateDynamic("getActiveErrors")(js.Any.fromFunction0(getActiveErrors))
    if (getFieldLabel != null) __obj.updateDynamic("getFieldLabel")(js.Any.fromFunction0(getFieldLabel))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getInputId != null) __obj.updateDynamic("getInputId")(js.Any.fromFunction0(getInputId))
    if (getLabelWidth != null) __obj.updateDynamic("getLabelWidth")(js.Any.fromFunction0(getLabelWidth))
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(js.Any.fromFunction0(getLabelableRenderData))
    if (getSubTplMarkup != null) __obj.updateDynamic("getSubTplMarkup")(js.Any.fromFunction0(getSubTplMarkup))
    if (hasActiveError != null) __obj.updateDynamic("hasActiveError")(js.Any.fromFunction0(hasActiveError))
    if (hasVisibleLabel != null) __obj.updateDynamic("hasVisibleLabel")(js.Any.fromFunction0(hasVisibleLabel))
    if (!js.isUndefined(hideEmptyLabel)) __obj.updateDynamic("hideEmptyLabel")(hideEmptyLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel.get.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLabelable != null) __obj.updateDynamic("initLabelable")(js.Any.fromFunction0(initLabelable))
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls.asInstanceOf[js.Any])
    if (!js.isUndefined(isFieldLabelable)) __obj.updateDynamic("isFieldLabelable")(isFieldLabelable.get.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelAttrTpl != null) __obj.updateDynamic("labelAttrTpl")(labelAttrTpl.asInstanceOf[js.Any])
    if (labelCell != null) __obj.updateDynamic("labelCell")(labelCell.asInstanceOf[js.Any])
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls.asInstanceOf[js.Any])
    if (labelClsExtra != null) __obj.updateDynamic("labelClsExtra")(labelClsExtra.asInstanceOf[js.Any])
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl.asInstanceOf[js.Any])
    if (!js.isUndefined(labelPad)) __obj.updateDynamic("labelPad")(labelPad.get.asInstanceOf[js.Any])
    if (labelSeparator != null) __obj.updateDynamic("labelSeparator")(labelSeparator.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWidth)) __obj.updateDynamic("labelWidth")(labelWidth.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (msgTarget != null) __obj.updateDynamic("msgTarget")(msgTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(preventMark)) __obj.updateDynamic("preventMark")(preventMark.get.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(js.Any.fromFunction1(setActiveError))
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(js.Any.fromFunction1(setActiveErrors))
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(js.Any.fromFunction1(setFieldDefaults))
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(js.Any.fromFunction1(setFieldLabel))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trimLabelSeparator != null) __obj.updateDynamic("trimLabelSeparator")(js.Any.fromFunction0(trimLabelSeparator))
    if (unsetActiveError != null) __obj.updateDynamic("unsetActiveError")(js.Any.fromFunction0(unsetActiveError))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelable]
  }
}

