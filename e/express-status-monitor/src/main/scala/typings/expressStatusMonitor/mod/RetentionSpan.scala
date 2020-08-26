package typings.expressStatusMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionSpan extends js.Object {
  var interval: Double = js.native
  var retention: Double = js.native
}

object RetentionSpan {
  @scala.inline
  def apply(interval: Double, retention: Double): RetentionSpan = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionSpan]
  }
  @scala.inline
  implicit class RetentionSpanOps[Self <: RetentionSpan] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetention(value: Double): Self = this.set("retention", value.asInstanceOf[js.Any])
  }
  
}

