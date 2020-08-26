package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficSource extends js.Object {
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSourceId: js.UndefOr[String] = js.native
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSubId: js.UndefOr[String] = js.native
}

object TrafficSource {
  @scala.inline
  def apply(): TrafficSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficSource]
  }
  @scala.inline
  implicit class TrafficSourceOps[Self <: TrafficSource] (val x: Self) extends AnyVal {
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
    def setTrafficSourceId(value: String): Self = this.set("trafficSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficSourceId: Self = this.set("trafficSourceId", js.undefined)
    @scala.inline
    def setTrafficSubId(value: String): Self = this.set("trafficSubId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficSubId: Self = this.set("trafficSubId", js.undefined)
  }
  
}

