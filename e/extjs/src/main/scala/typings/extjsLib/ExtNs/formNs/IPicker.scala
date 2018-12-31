package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPicker
  extends extjsLib.ExtNs.formNs.fieldNs.ITrigger {
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
  		* @returns Ext.Component The picker component
  		*/
  var getPicker: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var openCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
}

