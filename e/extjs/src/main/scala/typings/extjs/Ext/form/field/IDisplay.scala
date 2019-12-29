package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplay extends IBase {
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns String value The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IDisplay: js.UndefOr[js.Function0[String]] = js.undefined
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
    IBase: IBase = null,
    getRawValue: () => String = null,
    htmlEncode: js.UndefOr[Boolean] = js.undefined,
    isDirty: () => Boolean = null,
    isValid: () => Boolean = null,
    renderer: js.Any = null,
    scope: js.Any = null,
    validate: () => Boolean = null
  ): IDisplay = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(js.Any.fromFunction0(getRawValue))
    if (!js.isUndefined(htmlEncode)) __obj.updateDynamic("htmlEncode")(htmlEncode.asInstanceOf[js.Any])
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[IDisplay]
  }
}

