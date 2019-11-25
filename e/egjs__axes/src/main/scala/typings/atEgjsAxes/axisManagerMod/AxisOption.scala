package typings.atEgjsAxes.axisManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisOption extends js.Object {
  var bounce: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var circular: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
}

object AxisOption {
  @scala.inline
  def apply(
    bounce: Double | js.Array[Double] = null,
    circular: Boolean | js.Array[Boolean] = null,
    range: js.Array[Double] = null
  ): AxisOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOption]
  }
}

