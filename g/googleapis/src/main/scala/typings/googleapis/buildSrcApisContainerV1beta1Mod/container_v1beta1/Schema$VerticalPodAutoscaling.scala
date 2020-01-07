package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VerticalPodAutoscaling contains global, per-cluster information required by
  * Vertical Pod Autoscaler to automatically adjust the resources of pods
  * controlled by it.
  */
@js.native
trait Schema$VerticalPodAutoscaling extends js.Object {
  /**
    * Enables vertical pod autoscaling.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$VerticalPodAutoscaling {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$VerticalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VerticalPodAutoscaling]
  }
}

