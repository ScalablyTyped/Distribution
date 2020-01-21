package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  /**
    * The age range's upper bound, if any. Possible values include, but are not limited to, the following:
    * - "17" - for age 17
    * - "20" - for age 20
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The age range's lower bound, if any. Possible values include, but are not limited to, the following:
    * - "21" - for age 21
    * - "18" - for age 18
    */
  var min: js.UndefOr[Double] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

