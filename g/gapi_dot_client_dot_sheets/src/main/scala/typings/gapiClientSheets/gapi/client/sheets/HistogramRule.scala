package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramRule extends js.Object {
  /**
    * The maximum value at which items are placed into buckets
    * of constant size. Values above end are lumped into a single bucket.
    * This field is optional.
    */
  var end: js.UndefOr[Double] = js.native
  /** The size of the buckets that are created. Must be positive. */
  var interval: js.UndefOr[Double] = js.native
  /**
    * The minimum value at which items are placed into buckets
    * of constant size. Values below start are lumped into a single bucket.
    * This field is optional.
    */
  var start: js.UndefOr[Double] = js.native
}

object HistogramRule {
  @scala.inline
  def apply(): HistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRule]
  }
  @scala.inline
  implicit class HistogramRuleOps[Self <: HistogramRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

