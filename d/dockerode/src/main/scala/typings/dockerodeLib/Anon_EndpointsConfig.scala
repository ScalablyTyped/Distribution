package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[dockerodeLib.dockerodeMod.EndpointsConfig] = js.undefined
}

object Anon_EndpointsConfig {
  @scala.inline
  def apply(EndpointsConfig: dockerodeLib.dockerodeMod.EndpointsConfig = null): Anon_EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    if (EndpointsConfig != null) __obj.updateDynamic("EndpointsConfig")(EndpointsConfig)
    __obj.asInstanceOf[Anon_EndpointsConfig]
  }
}

