package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the Kubernetes Dashboard.
  */
@js.native
trait Schema$KubernetesDashboard extends js.Object {
  /**
    * Whether the Kubernetes Dashboard is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object Schema$KubernetesDashboard {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): Schema$KubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KubernetesDashboard]
  }
}

