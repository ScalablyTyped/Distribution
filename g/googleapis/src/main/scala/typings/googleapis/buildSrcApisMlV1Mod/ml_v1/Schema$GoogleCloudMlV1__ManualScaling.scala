package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for manually scaling a model.
  */
@js.native
trait Schema$GoogleCloudMlV1__ManualScaling extends js.Object {
  /**
    * The number of nodes to allocate for this model. These nodes are always
    * up, starting from the time the model is deployed, so the cost of
    * operating this model will be proportional to `nodes` * number of hours
    * since last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudMlV1__ManualScaling {
  @scala.inline
  def apply(nodes: Int | Double = null): Schema$GoogleCloudMlV1__ManualScaling = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ManualScaling]
  }
}

