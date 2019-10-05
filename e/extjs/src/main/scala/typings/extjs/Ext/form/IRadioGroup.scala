package typings.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioGroup extends ICheckboxGroup {
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  @JSName("checkChange")
  var checkChange_IRadioGroup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of the radio group
  		* @param value Object The map from names to values to be set.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  @JSName("setValue")
  var setValue_IRadioGroup: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup]] = js.undefined
}

object IRadioGroup {
  @scala.inline
  def apply(
    ICheckboxGroup: ICheckboxGroup = null,
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    blankText: java.lang.String = null,
    checkChange: () => Unit = null,
    defaultType: java.lang.String = null,
    items: js.Any = null,
    setValue: /* value */ js.UndefOr[js.Any] => ICheckboxGroup = null
  ): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckboxGroup)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (blankText != null) __obj.updateDynamic("blankText")(blankText)
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (items != null) __obj.updateDynamic("items")(items)
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[IRadioGroup]
  }
}

