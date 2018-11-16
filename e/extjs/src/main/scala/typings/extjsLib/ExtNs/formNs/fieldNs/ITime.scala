package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITime extends IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
  		* @param value Date/String The maximum time that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
  		* @param value Date/String The minimum time that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the specified value s into the field
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_ITime: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[java.lang.String] = js.undefined
}

