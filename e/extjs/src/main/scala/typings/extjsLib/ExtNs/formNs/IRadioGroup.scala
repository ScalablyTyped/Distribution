package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioGroup extends ICheckboxGroup {
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
    allowBlank: js.UndefOr[scala.Boolean] = js.undefined,
    blankText: java.lang.String = null,
    checkChange: js.Function0[scala.Unit] = null,
    defaultType: java.lang.String = null,
    items: js.Any = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup] = null
  ): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckboxGroup)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (blankText != null) __obj.updateDynamic("blankText")(blankText)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (items != null) __obj.updateDynamic("items")(items)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[IRadioGroup]
  }
}

