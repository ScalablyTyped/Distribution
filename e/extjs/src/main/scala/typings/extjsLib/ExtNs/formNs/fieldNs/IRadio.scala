package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio extends ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  @JSName("getModelData")
  var getModelData_IRadio: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: ICheckbox = null,
    focusCls: java.lang.String = null,
    getGroupValue: () => java.lang.String = null,
    getModelData: () => _ = null,
    getSubmitValue: () => _ = null,
    inputType: java.lang.String = null,
    isRadio: js.UndefOr[scala.Boolean] = js.undefined,
    onRemoved: () => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => IRadio = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckbox)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getGroupValue != null) __obj.updateDynamic("getGroupValue")(js.Any.fromFunction0(getGroupValue))
    if (getModelData != null) __obj.updateDynamic("getModelData")(js.Any.fromFunction0(getModelData))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (!js.isUndefined(isRadio)) __obj.updateDynamic("isRadio")(isRadio)
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction0(onRemoved))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[IRadio]
  }
}

