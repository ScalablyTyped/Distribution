package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDebugConfigResponse extends js.Object {
  /** The encoded debug configuration for the requested component. */
  var config: js.UndefOr[java.lang.String] = js.undefined
}

object GetDebugConfigResponse {
  @scala.inline
  def apply(config: java.lang.String = null): GetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[GetDebugConfigResponse]
  }
}

