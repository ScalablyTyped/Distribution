package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner extends ITrigger {
  /** [Config Option] (Boolean) */
  var keyNavEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var mouseWheelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method is called when the spinner down button is clicked or when the down arrow key is pressed if keyNavEnabled  */
  var onSpinDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called when the spinner up button is clicked or when the up arrow key is pressed if keyNavEnabled is */
  var onSpinUp: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinDownEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinUpEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Triggers the spinner to step down fires the spin and spindown events and calls the onSpinDown method  */
  var spinDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var spinDownEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var spinDownEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Triggers the spinner to step up fires the spin and spinup events and calls the onSpinUp method  */
  var spinUp: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var spinUpEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var spinUpEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object ISpinner {
  @scala.inline
  def apply(
    ITrigger: ITrigger = null,
    getTriggerWidth: () => scala.Double = null,
    initComponent: () => scala.Unit = null,
    keyNavEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mouseWheelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSpinDown: () => scala.Unit = null,
    onSpinUp: () => scala.Unit = null,
    repeatTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    setSpinDownEnabled: /* enabled */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSpinUpEnabled: /* enabled */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    spinDown: () => scala.Unit = null,
    spinDownEl: extjsLib.ExtNs.IElement = null,
    spinDownEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    spinUp: () => scala.Unit = null,
    spinUpEl: extjsLib.ExtNs.IElement = null,
    spinUpEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (getTriggerWidth != null) __obj.updateDynamic("getTriggerWidth")(js.Any.fromFunction0(getTriggerWidth))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (!js.isUndefined(keyNavEnabled)) __obj.updateDynamic("keyNavEnabled")(keyNavEnabled)
    if (!js.isUndefined(mouseWheelEnabled)) __obj.updateDynamic("mouseWheelEnabled")(mouseWheelEnabled)
    if (onSpinDown != null) __obj.updateDynamic("onSpinDown")(js.Any.fromFunction0(onSpinDown))
    if (onSpinUp != null) __obj.updateDynamic("onSpinUp")(js.Any.fromFunction0(onSpinUp))
    if (!js.isUndefined(repeatTriggerClick)) __obj.updateDynamic("repeatTriggerClick")(repeatTriggerClick)
    if (setSpinDownEnabled != null) __obj.updateDynamic("setSpinDownEnabled")(js.Any.fromFunction1(setSpinDownEnabled))
    if (setSpinUpEnabled != null) __obj.updateDynamic("setSpinUpEnabled")(js.Any.fromFunction1(setSpinUpEnabled))
    if (spinDown != null) __obj.updateDynamic("spinDown")(js.Any.fromFunction0(spinDown))
    if (spinDownEl != null) __obj.updateDynamic("spinDownEl")(spinDownEl)
    if (!js.isUndefined(spinDownEnabled)) __obj.updateDynamic("spinDownEnabled")(spinDownEnabled)
    if (spinUp != null) __obj.updateDynamic("spinUp")(js.Any.fromFunction0(spinUp))
    if (spinUpEl != null) __obj.updateDynamic("spinUpEl")(spinUpEl)
    if (!js.isUndefined(spinUpEnabled)) __obj.updateDynamic("spinUpEnabled")(spinUpEnabled)
    __obj.asInstanceOf[ISpinner]
  }
}

