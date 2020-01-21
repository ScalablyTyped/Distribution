package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1ManualScaling extends js.Object {
  /**
    * The number of nodes to allocate for this model. These nodes are always up,
    * starting from the time the model is deployed, so the cost of operating
    * this model will be proportional to `nodes` &#42; number of hours since
    * last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.undefined
}

object GoogleCloudMlV1ManualScaling {
  @scala.inline
  def apply(nodes: Int | Double = null): GoogleCloudMlV1ManualScaling = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1ManualScaling]
  }
}

