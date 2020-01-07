package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for NetworkPolicy. This only tracks whether the addon is
  * enabled or not on the Master, it does not track whether network policy is
  * enabled for the nodes.
  */
@js.native
trait Schema$NetworkPolicyConfig extends js.Object {
  /**
    * Whether NetworkPolicy is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object Schema$NetworkPolicyConfig {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): Schema$NetworkPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkPolicyConfig]
  }
}

