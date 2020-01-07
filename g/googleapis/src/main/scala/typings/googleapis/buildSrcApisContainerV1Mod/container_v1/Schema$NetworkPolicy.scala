package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the NetworkPolicy feature.
  * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
  */
@js.native
trait Schema$NetworkPolicy extends js.Object {
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String] = js.native
}

object Schema$NetworkPolicy {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, provider: String = null): Schema$NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkPolicy]
  }
}

