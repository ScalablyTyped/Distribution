package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISpinner
  extends extjsLib.ExtNs.formNs.fieldNs.ITrigger {
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

