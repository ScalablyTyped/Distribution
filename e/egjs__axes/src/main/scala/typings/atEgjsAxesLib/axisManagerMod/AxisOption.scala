package typings
package atEgjsAxesLib.axisManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisOption extends js.Object {
  var bounce: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var circular: js.UndefOr[scala.Boolean | js.Array[scala.Boolean]] = js.undefined
  var range: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object AxisOption {
  @scala.inline
  def apply(
    bounce: scala.Double | js.Array[scala.Double] = null,
    circular: scala.Boolean | js.Array[scala.Boolean] = null,
    range: js.Array[scala.Double] = null
  ): AxisOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AxisOption]
  }
}

