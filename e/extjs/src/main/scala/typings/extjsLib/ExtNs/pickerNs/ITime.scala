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

