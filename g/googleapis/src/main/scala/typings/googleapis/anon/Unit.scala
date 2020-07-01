package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unit extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[String] = js.native
}

object Unit {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, unit: String = null): Unit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

