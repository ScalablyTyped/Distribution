package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTableTransitTimeRowTransitTimeValue extends js.Object {
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
}

object TransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(
    maxTransitTimeInDays: js.UndefOr[Double] = js.undefined,
    minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  ): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTransitTimeInDays)) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTransitTimeInDays)) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
}

