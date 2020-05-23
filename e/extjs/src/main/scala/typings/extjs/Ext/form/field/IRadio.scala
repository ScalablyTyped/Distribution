package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio extends ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: ICheckbox = null,
    getGroupValue: () => String = null,
    isRadio: js.UndefOr[Boolean] = js.undefined,
    onRemoved: () => Unit = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    if (ICheckbox != null) js.Dynamic.global.Object.assign(__obj, ICheckbox)
    if (getGroupValue != null) __obj.updateDynamic("getGroupValue")(js.Any.fromFunction0(getGroupValue))
    if (!js.isUndefined(isRadio)) __obj.updateDynamic("isRadio")(isRadio.get.asInstanceOf[js.Any])
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction0(onRemoved))
    __obj.asInstanceOf[IRadio]
  }
}

