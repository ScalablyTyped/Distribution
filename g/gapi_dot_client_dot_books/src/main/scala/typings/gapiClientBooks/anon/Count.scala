package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, unit: String = null): Count = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

