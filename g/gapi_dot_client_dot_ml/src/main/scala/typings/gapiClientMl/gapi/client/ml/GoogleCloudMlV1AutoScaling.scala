package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1AutoScaling extends js.Object {
  /**
    * Optional. The minimum number of nodes to allocate for this model. These
    * nodes are always up, starting from the time the model is deployed, so the
    * cost of operating this model will be at least
    * `rate` &#42; `min_nodes` &#42; number of hours since last billing cycle,
    * where `rate` is the cost per node-hour as documented in
    * [pricing](https://cloud.google.com/ml-engine/pricing#prediction_pricing),
    * even if no predictions are performed. There is additional cost for each
    * prediction performed.
    *
    * Unlike manual scaling, if the load gets too heavy for the nodes
    * that are up, the service will automatically add nodes to handle the
    * increased load as well as scale back as traffic drops, always maintaining
    * at least `min_nodes`. You will be charged for the time in which additional
    * nodes are used.
    *
    * If not specified, `min_nodes` defaults to 0, in which case, when traffic
    * to a model stops (and after a cool-down period), nodes will be shut down
    * and no charges will be incurred until traffic to the model resumes.
    */
  var minNodes: js.UndefOr[Double] = js.undefined
}

object GoogleCloudMlV1AutoScaling {
  @scala.inline
  def apply(minNodes: js.UndefOr[Double] = js.undefined): GoogleCloudMlV1AutoScaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minNodes)) __obj.updateDynamic("minNodes")(minNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1AutoScaling]
  }
}

