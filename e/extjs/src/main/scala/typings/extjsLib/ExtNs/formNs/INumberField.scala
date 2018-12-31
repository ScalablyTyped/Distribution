package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberField
  extends extjsLib.ExtNs.formNs.fieldNs.ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumberField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_INumberField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var nanText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value
  		* @param value Number The maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value
  		* @param value Number The minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumberField: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumberField: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var step: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[scala.Boolean] = js.undefined
}

