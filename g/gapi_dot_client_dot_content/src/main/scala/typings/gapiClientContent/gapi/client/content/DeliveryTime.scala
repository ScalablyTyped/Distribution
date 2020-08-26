package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryTime extends js.Object {
  /**
    * Maximum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays. Required.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  /** Minimum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Required. */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}

object DeliveryTime {
  @scala.inline
  def apply(): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryTime]
  }
  @scala.inline
  implicit class DeliveryTimeOps[Self <: DeliveryTime] (val x: Self) extends AnyVal {
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
    def setMaxTransitTimeInDays(value: Double): Self = this.set("maxTransitTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTransitTimeInDays: Self = this.set("maxTransitTimeInDays", js.undefined)
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = this.set("minTransitTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTransitTimeInDays: Self = this.set("minTransitTimeInDays", js.undefined)
  }
  
}

