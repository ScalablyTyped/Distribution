package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDateRange extends js.Object {
  /**
    * The number of days in the requested date range. E.g. for a range spanning
    * today, 1. For a range spanning the last 7 days, 7.
    */
  var durationDays: js.UndefOr[Double] = js.undefined
  /**
    * The end date of the filter set, specified as the number of days before
    * today. E.g. for a range where the last date is today, 0.
    */
  var offsetDays: js.UndefOr[Double] = js.undefined
}

object RelativeDateRange {
  @scala.inline
  def apply(durationDays: js.UndefOr[Double] = js.undefined, offsetDays: js.UndefOr[Double] = js.undefined): RelativeDateRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(durationDays)) __obj.updateDynamic("durationDays")(durationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetDays)) __obj.updateDynamic("offsetDays")(offsetDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateRange]
  }
}

