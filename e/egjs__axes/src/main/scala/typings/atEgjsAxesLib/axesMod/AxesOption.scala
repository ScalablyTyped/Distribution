package typings
package atEgjsAxesLib.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesOption extends js.Object {
  var deceleration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* x */ scala.Double, scala.Double]] = js.undefined
  var interruptable: js.UndefOr[scala.Boolean] = js.undefined
  var maximumDuration: js.UndefOr[scala.Double] = js.undefined
  var minimumDuration: js.UndefOr[scala.Double] = js.undefined
}

object AxesOption {
  @scala.inline
  def apply(
    deceleration: scala.Int | scala.Double = null,
    easing: js.Function1[/* x */ scala.Double, scala.Double] = null,
    interruptable: js.UndefOr[scala.Boolean] = js.undefined,
    maximumDuration: scala.Int | scala.Double = null,
    minimumDuration: scala.Int | scala.Double = null
  ): AxesOption = {
    val __obj = js.Dynamic.literal()
    if (deceleration != null) __obj.updateDynamic("deceleration")(deceleration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(interruptable)) __obj.updateDynamic("interruptable")(interruptable)
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (minimumDuration != null) __obj.updateDynamic("minimumDuration")(minimumDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesOption]
  }
}

