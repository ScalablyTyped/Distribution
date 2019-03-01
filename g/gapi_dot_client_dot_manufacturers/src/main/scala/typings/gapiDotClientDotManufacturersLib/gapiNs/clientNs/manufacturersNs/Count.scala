package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /** The unit in which these products are counted. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric value of the number of products in a package. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Count {
  @scala.inline
  def apply(unit: java.lang.String = null, value: java.lang.String = null): Count = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Count]
  }
}

