package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAddonsConfigRequest extends js.Object {
  /**
    * The desired configurations for the various addons available to run in the
    * cluster.
    */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.undefined
}

object SetAddonsConfigRequest {
  @scala.inline
  def apply(addonsConfig: AddonsConfig = null): SetAddonsConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (addonsConfig != null) __obj.updateDynamic("addonsConfig")(addonsConfig)
    __obj.asInstanceOf[SetAddonsConfigRequest]
  }
}

