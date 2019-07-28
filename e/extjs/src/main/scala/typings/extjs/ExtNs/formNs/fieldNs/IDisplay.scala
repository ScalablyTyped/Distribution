package typings.extjs.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplay
  extends typings.extjs.ExtNs.formNs.fieldNs.IBase {
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns String value The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IDisplay: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var htmlEncode: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  @JSName("isDirty")
  var isDirty_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("isValid")
  var isValid_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("validate")
  var validate_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IDisplay {
  @scala.inline
  def apply(
    IBase: typings.extjs.ExtNs.formNs.fieldNs.IBase = null,
    fieldBodyCls: java.lang.String = null,
    fieldCls: java.lang.String = null,
    getRawValue: () => java.lang.String = null,
    getSubTplData: () => _ = null,
    htmlEncode: js.UndefOr[Boolean] = js.undefined,
    initEvents: () => Unit = null,
    isDirty: () => Boolean = null,
    isValid: () => Boolean = null,
    renderer: js.Any = null,
    scope: js.Any = null,
    setRawValue: /* value */ js.UndefOr[js.Any] => _ = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    validate: () => Boolean = null
  ): IDisplay = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls)
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls)
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(js.Any.fromFunction0(getRawValue))
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (!js.isUndefined(htmlEncode)) __obj.updateDynamic("htmlEncode")(htmlEncode)
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(js.Any.fromFunction1(setRawValue))
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[IDisplay]
  }
}

