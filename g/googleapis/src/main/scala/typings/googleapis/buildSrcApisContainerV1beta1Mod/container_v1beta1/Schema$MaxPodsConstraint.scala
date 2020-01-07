package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constraints applied to pods.
  */
@js.native
trait Schema$MaxPodsConstraint extends js.Object {
  /**
    * Constraint enforced on the max num of pods per node.
    */
  var maxPodsPerNode: js.UndefOr[String] = js.native
}

object Schema$MaxPodsConstraint {
  @scala.inline
  def apply(maxPodsPerNode: String = null): Schema$MaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    if (maxPodsPerNode != null) __obj.updateDynamic("maxPodsPerNode")(maxPodsPerNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MaxPodsConstraint]
  }
}

