package typings.atEgjsAxes.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesOption extends js.Object {
  var deceleration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var interruptable: js.UndefOr[Boolean] = js.undefined
  var maximumDuration: js.UndefOr[Double] = js.undefined
  var minimumDuration: js.UndefOr[Double] = js.undefined
}

object AxesOption {
  @scala.inline
  def apply(
    deceleration: Int | Double = null,
    easing: /* x */ Double => Double = null,
    interruptable: js.UndefOr[Boolean] = js.undefined,
    maximumDuration: Int | Double = null,
    minimumDuration: Int | Double = null
  ): AxesOption = {
    val __obj = js.Dynamic.literal()
    if (deceleration != null) __obj.updateDynamic("deceleration")(deceleration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(interruptable)) __obj.updateDynamic("interruptable")(interruptable)
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (minimumDuration != null) __obj.updateDynamic("minimumDuration")(minimumDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesOption]
  }
}

