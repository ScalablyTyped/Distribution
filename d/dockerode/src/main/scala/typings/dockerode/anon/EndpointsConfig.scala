package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[typings.dockerode.mod.EndpointsConfig] = js.undefined
}

object EndpointsConfig {
  @scala.inline
  def apply(EndpointsConfig: typings.dockerode.mod.EndpointsConfig = null): EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    if (EndpointsConfig != null) __obj.updateDynamic("EndpointsConfig")(EndpointsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointsConfig]
  }
}

