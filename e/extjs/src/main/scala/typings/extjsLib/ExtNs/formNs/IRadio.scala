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

