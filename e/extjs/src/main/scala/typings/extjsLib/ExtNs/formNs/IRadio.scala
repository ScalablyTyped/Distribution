package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio
  extends extjsLib.ExtNs.formNs.fieldNs.ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: extjsLib.ExtNs.formNs.fieldNs.ICheckbox = null,
    focusCls: java.lang.String = null,
    getGroupValue: js.Function0[java.lang.String] = null,
    getModelData: js.Function0[_] = null,
    getSubmitValue: js.Function0[_] = null,
    inputType: java.lang.String = null,
    isRadio: js.UndefOr[scala.Boolean] = js.undefined,
    onRemoved: js.Function0[scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], IRadio] = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckbox)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getGroupValue != null) __obj.updateDynamic("getGroupValue")(getGroupValue)
    if (getModelData != null) __obj.updateDynamic("getModelData")(getModelData)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (!js.isUndefined(isRadio)) __obj.updateDynamic("isRadio")(isRadio)
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(onRemoved)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[IRadio]
  }
}

