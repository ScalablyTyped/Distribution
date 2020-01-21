package typings.dockerode

import typings.dockerode.mod.EndpointsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[typings.dockerode.mod.EndpointsConfig] = js.undefined
}

object AnonEndpointsConfig {
  @scala.inline
  def apply(EndpointsConfig: EndpointsConfig = null): AnonEndpointsConfig = {
    val __obj = js.Dynamic.literal()
    if (EndpointsConfig != null) __obj.updateDynamic("EndpointsConfig")(EndpointsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndpointsConfig]
  }
}

