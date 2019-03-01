package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  /** The weight unit. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** The weight represented as a number. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Weight {
  @scala.inline
  def apply(unit: java.lang.String = null, value: java.lang.String = null): Weight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Weight]
  }
}

