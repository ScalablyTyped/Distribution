package typings
package extjsLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime
  extends extjsLib.ExtNs.viewNs.IBoundList {
  /** [Method] Focuses a node in the view
  		* @param rec Object
  		*/
  @JSName("focusNode")
  var focusNode_ITime: js.UndefOr[js.Function1[/* rec */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Date) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Set the maxValue and update the list of available times
  		* @param value Date
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set the minValue and update the list of available times
  		* @param value Date
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Update the list of available times in the list to be constrained within the minValue and maxValue  */
  var updateList: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    IBoundList: extjsLib.ExtNs.viewNs.IBoundList = null,
    componentCls: java.lang.String = null,
    focusNode: /* rec */ js.UndefOr[js.Any] => scala.Unit = null,
    format: java.lang.String = null,
    increment: scala.Int | scala.Double = null,
    initComponent: () => scala.Unit = null,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    setMaxValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    updateList: () => scala.Unit = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBoundList)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (focusNode != null) __obj.updateDynamic("focusNode")(js.Any.fromFunction1(focusNode))
    if (format != null) __obj.updateDynamic("format")(format)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (updateList != null) __obj.updateDynamic("updateList")(js.Any.fromFunction0(updateList))
    __obj.asInstanceOf[ITime]
  }
}

