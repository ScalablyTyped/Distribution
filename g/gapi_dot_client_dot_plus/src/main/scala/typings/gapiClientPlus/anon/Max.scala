package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
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

object Max {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): Max = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

