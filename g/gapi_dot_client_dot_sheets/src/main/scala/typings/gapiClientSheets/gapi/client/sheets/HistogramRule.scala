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
  def apply(end: Int | Double = null, interval: Int | Double = null, start: Int | Double = null): HistogramRule = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRule]
  }
}

