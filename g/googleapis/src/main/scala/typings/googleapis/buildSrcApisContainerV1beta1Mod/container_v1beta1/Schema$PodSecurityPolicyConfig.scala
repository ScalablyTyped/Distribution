package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the PodSecurityPolicy feature.
  */
@js.native
trait Schema$PodSecurityPolicyConfig extends js.Object {
  /**
    * Enable the PodSecurityPolicy controller for this cluster. If enabled,
    * pods must be valid under a PodSecurityPolicy to be created.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$PodSecurityPolicyConfig {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$PodSecurityPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PodSecurityPolicyConfig]
  }
}

