package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var boxLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var boxLabelAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var boxLabelAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var boxLabelCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var boxLabelEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getRawValue")
  var getRawValue_ICheckbox: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var inputValue: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value
  		* @param fromBoxInGroup Object
  		*/
  @JSName("resetOriginalValue")
  var resetOriginalValue_ICheckbox: js.UndefOr[js.Function1[/* fromBoxInGroup */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the boxLabel for this checkbox
  		* @param boxLabel String The new label
  		*/
  var setBoxLabel: js.UndefOr[js.Function1[/* boxLabel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the checked state of the checkbox
  		* @param value Boolean/String/Number The following values will check the checkbox: true, 'true', '1', 1, or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Boolean the new checked state of the checkbox
  		*/
  @JSName("setRawValue")
  var setRawValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_ICheckbox: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the checked state of the checkbox and invokes change detection
  		* @param checked Boolean/String The following values will check the checkbox: true, 'true', '1', or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Ext.form.field.Checkbox this
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* checked */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var uncheckedValue: js.UndefOr[java.lang.String] = js.undefined
}

object ICheckbox {
  @scala.inline
  def apply(
    IBase: extjsLib.ExtNs.formNs.fieldNs.IBase = null,
    afterBoxLabelTextTpl: js.Any = null,
    afterBoxLabelTpl: js.Any = null,
    beforeBoxLabelTextTpl: js.Any = null,
    beforeBoxLabelTpl: js.Any = null,
    beforeDestroy: js.Function0[scala.Unit] = null,
    boxLabel: java.lang.String = null,
    boxLabelAlign: java.lang.String = null,
    boxLabelAttrTpl: js.Any = null,
    boxLabelCls: java.lang.String = null,
    boxLabelEl: extjsLib.ExtNs.IElement = null,
    checkChangeEvents: extjsLib.ExtNs.Array = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedCls: java.lang.String = null,
    componentLayout: js.Any = null,
    fieldCls: java.lang.String = null,
    focusCls: java.lang.String = null,
    getRawValue: js.Function0[scala.Boolean] = null,
    getSubTplData: js.Function0[_] = null,
    getSubmitValue: js.Function0[_] = null,
    getValue: js.Function0[scala.Boolean] = null,
    handler: js.Any = null,
    initComponent: js.Function0[scala.Unit] = null,
    initEvents: js.Function0[scala.Unit] = null,
    initValue: js.Function0[scala.Unit] = null,
    inputType: java.lang.String = null,
    inputValue: java.lang.String = null,
    onEnable: js.Function0[scala.Unit] = null,
    originalValue: js.Any = null,
    resetOriginalValue: js.Function1[/* fromBoxInGroup */ js.UndefOr[js.Any], scala.Unit] = null,
    scope: js.Any = null,
    setBoxLabel: js.Function1[/* boxLabel */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRawValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Boolean] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[js.Any], scala.Unit] = null,
    setValue: js.Function1[/* checked */ js.UndefOr[js.Any], ICheckbox] = null,
    uncheckedValue: java.lang.String = null,
    valueToRaw: js.Function1[/* value */ js.UndefOr[js.Any], _] = null
  ): ICheckbox = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (afterBoxLabelTextTpl != null) __obj.updateDynamic("afterBoxLabelTextTpl")(afterBoxLabelTextTpl)
    if (afterBoxLabelTpl != null) __obj.updateDynamic("afterBoxLabelTpl")(afterBoxLabelTpl)
    if (beforeBoxLabelTextTpl != null) __obj.updateDynamic("beforeBoxLabelTextTpl")(beforeBoxLabelTextTpl)
    if (beforeBoxLabelTpl != null) __obj.updateDynamic("beforeBoxLabelTpl")(beforeBoxLabelTpl)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (boxLabel != null) __obj.updateDynamic("boxLabel")(boxLabel)
    if (boxLabelAlign != null) __obj.updateDynamic("boxLabelAlign")(boxLabelAlign)
    if (boxLabelAttrTpl != null) __obj.updateDynamic("boxLabelAttrTpl")(boxLabelAttrTpl)
    if (boxLabelCls != null) __obj.updateDynamic("boxLabelCls")(boxLabelCls)
    if (boxLabelEl != null) __obj.updateDynamic("boxLabelEl")(boxLabelEl)
    if (checkChangeEvents != null) __obj.updateDynamic("checkChangeEvents")(checkChangeEvents)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedCls != null) __obj.updateDynamic("checkedCls")(checkedCls)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(getRawValue)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(getSubTplData)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (initEvents != null) __obj.updateDynamic("initEvents")(initEvents)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable)
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue)
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(resetOriginalValue)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setBoxLabel != null) __obj.updateDynamic("setBoxLabel")(setBoxLabel)
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(setRawValue)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (uncheckedValue != null) __obj.updateDynamic("uncheckedValue")(uncheckedValue)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(valueToRaw)
    __obj.asInstanceOf[ICheckbox]
  }
}

