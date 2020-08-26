package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/magellan.html#js
@js.native
trait MagellanOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var destination_threshold: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var fixed_top: js.UndefOr[Double] = js.native
  var offset_by_height: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var throttle_delay: js.UndefOr[Double] = js.native
}

object MagellanOptions {
  @scala.inline
  def apply(): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagellanOptions]
  }
  @scala.inline
  implicit class MagellanOptionsOps[Self <: MagellanOptions] (val x: Self) extends AnyVal {
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
    def setActive_class(value: String): Self = this.set("active_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive_class: Self = this.set("active_class", js.undefined)
    @scala.inline
    def setDestination_threshold(value: Double): Self = this.set("destination_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination_threshold: Self = this.set("destination_threshold", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFixed_top(value: Double): Self = this.set("fixed_top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed_top: Self = this.set("fixed_top", js.undefined)
    @scala.inline
    def setOffset_by_height(value: Boolean): Self = this.set("offset_by_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset_by_height: Self = this.set("offset_by_height", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setThrottle_delay(value: Double): Self = this.set("throttle_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle_delay: Self = this.set("throttle_delay", js.undefined)
  }
  
}

