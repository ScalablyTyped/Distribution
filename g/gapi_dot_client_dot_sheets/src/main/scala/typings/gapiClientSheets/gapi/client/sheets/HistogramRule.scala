package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRule extends js.Object {
  /**
    * The maximum value at which items are placed into buckets
    * of constant size. Values above end are lumped into a single bucket.
    * This field is optional.
    */
  var end: js.UndefOr[Double] = js.undefined
  /** The size of the buckets that are created. Must be positive. */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value at which items are placed into buckets
    * of constant size. Values below start are lumped into a single bucket.
    * This field is optional.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object HistogramRule {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): HistogramRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRule]
  }
}

