package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnit extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[String] = js.native
}

object AnonUnit {
  @scala.inline
  def apply(count: Int | Double = null, unit: String = null): AnonUnit = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnit]
  }
}

