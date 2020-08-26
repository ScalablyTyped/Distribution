package typings.dynogels.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollingInterval extends js.Object {
  var pollingInterval: Double = js.native
}

object PollingInterval {
  @scala.inline
  def apply(pollingInterval: Double): PollingInterval = {
    val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollingInterval]
  }
  @scala.inline
  implicit class PollingIntervalOps[Self <: PollingInterval] (val x: Self) extends AnyVal {
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
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
  }
  
}

