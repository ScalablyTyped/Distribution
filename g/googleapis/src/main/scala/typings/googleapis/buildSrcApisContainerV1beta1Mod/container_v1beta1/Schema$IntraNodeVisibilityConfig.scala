package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IntraNodeVisibilityConfig contains the desired config of the intra-node
  * visibility on this cluster.
  */
@js.native
trait Schema$IntraNodeVisibilityConfig extends js.Object {
  /**
    * Enables intra node visibility for this cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$IntraNodeVisibilityConfig {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$IntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntraNodeVisibilityConfig]
  }
}

