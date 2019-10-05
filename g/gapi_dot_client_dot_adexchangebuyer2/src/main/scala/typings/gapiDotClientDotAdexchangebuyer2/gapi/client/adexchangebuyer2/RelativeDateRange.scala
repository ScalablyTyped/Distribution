package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

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
  def apply(durationDays: Int | Double = null, offsetDays: Int | Double = null): RelativeDateRange = {
    val __obj = js.Dynamic.literal()
    if (durationDays != null) __obj.updateDynamic("durationDays")(durationDays.asInstanceOf[js.Any])
    if (offsetDays != null) __obj.updateDynamic("offsetDays")(offsetDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateRange]
  }
}

