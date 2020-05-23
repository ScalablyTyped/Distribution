package typings.egjsAxes.axesMod

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
    deceleration: js.UndefOr[Double] = js.undefined,
    easing: /* x */ Double => Double = null,
    interruptable: js.UndefOr[Boolean] = js.undefined,
    maximumDuration: js.UndefOr[Double] = js.undefined,
    minimumDuration: js.UndefOr[Double] = js.undefined
  ): AxesOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deceleration)) __obj.updateDynamic("deceleration")(deceleration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(interruptable)) __obj.updateDynamic("interruptable")(interruptable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumDuration)) __obj.updateDynamic("maximumDuration")(maximumDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumDuration)) __obj.updateDynamic("minimumDuration")(minimumDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesOption]
  }
}

