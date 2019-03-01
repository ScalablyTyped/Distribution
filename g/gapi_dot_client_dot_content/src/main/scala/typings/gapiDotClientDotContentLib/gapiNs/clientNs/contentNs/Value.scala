package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /** The name of a carrier rate referring to a carrier rate defined in the same rate group. Can only be set if all other fields are not set. */
  var carrierRateName: js.UndefOr[java.lang.String] = js.undefined
  /** A flat rate. Can only be set if all other fields are not set. */
  var flatRate: js.UndefOr[Price] = js.undefined
  /** If true, then the product can't ship. Must be true when set, can only be set if all other fields are not set. */
  var noShipping: js.UndefOr[scala.Boolean] = js.undefined
  /** A percentage of the price represented as a number in decimal notation (e.g., "5.4"). Can only be set if all other fields are not set. */
  var pricePercentage: js.UndefOr[java.lang.String] = js.undefined
  /** The name of a subtable. Can only be set in table cells (i.e., not for single values), and only if all other fields are not set. */
  var subtableName: js.UndefOr[java.lang.String] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    carrierRateName: java.lang.String = null,
    flatRate: Price = null,
    noShipping: js.UndefOr[scala.Boolean] = js.undefined,
    pricePercentage: java.lang.String = null,
    subtableName: java.lang.String = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (carrierRateName != null) __obj.updateDynamic("carrierRateName")(carrierRateName)
    if (flatRate != null) __obj.updateDynamic("flatRate")(flatRate)
    if (!js.isUndefined(noShipping)) __obj.updateDynamic("noShipping")(noShipping)
    if (pricePercentage != null) __obj.updateDynamic("pricePercentage")(pricePercentage)
    if (subtableName != null) __obj.updateDynamic("subtableName")(subtableName)
    __obj.asInstanceOf[Value]
  }
}

