package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1ManualScaling extends js.Object {
  /**
    * The number of nodes to allocate for this model. These nodes are always up,
    * starting from the time the model is deployed, so the cost of operating
    * this model will be proportional to `nodes` &#42; number of hours since
    * last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.native
}

object GoogleCloudMlV1ManualScaling {
  @scala.inline
  def apply(): GoogleCloudMlV1ManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ManualScaling]
  }
  @scala.inline
  implicit class GoogleCloudMlV1ManualScalingOps[Self <: GoogleCloudMlV1ManualScaling] (val x: Self) extends AnyVal {
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
    def setNodes(value: Double): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
  
}

