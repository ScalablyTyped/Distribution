package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryTime extends js.Object {
  var cutoffTime: js.UndefOr[CutoffTime] = js.undefined
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.undefined
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  var minHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  var transitTimeTable: js.UndefOr[TransitTable] = js.undefined
}

object DeliveryTime {
  @scala.inline
  def apply(
    cutoffTime: CutoffTime = null,
    holidayCutoffs: js.Array[HolidayCutoff] = null,
    maxHandlingTimeInDays: js.UndefOr[Double] = js.undefined,
    maxTransitTimeInDays: js.UndefOr[Double] = js.undefined,
    minHandlingTimeInDays: js.UndefOr[Double] = js.undefined,
    minTransitTimeInDays: js.UndefOr[Double] = js.undefined,
    transitTimeTable: TransitTable = null
  ): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    if (cutoffTime != null) __obj.updateDynamic("cutoffTime")(cutoffTime.asInstanceOf[js.Any])
    if (holidayCutoffs != null) __obj.updateDynamic("holidayCutoffs")(holidayCutoffs.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHandlingTimeInDays)) __obj.updateDynamic("maxHandlingTimeInDays")(maxHandlingTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTransitTimeInDays)) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHandlingTimeInDays)) __obj.updateDynamic("minHandlingTimeInDays")(minHandlingTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTransitTimeInDays)) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.get.asInstanceOf[js.Any])
    if (transitTimeTable != null) __obj.updateDynamic("transitTimeTable")(transitTimeTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryTime]
  }
}

