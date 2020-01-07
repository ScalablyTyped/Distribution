package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the Cloud Run feature.
  */
@js.native
trait Schema$CloudRunConfig extends js.Object {
  /**
    * Whether Cloud Run addon is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object Schema$CloudRunConfig {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): Schema$CloudRunConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudRunConfig]
  }
}

