package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDebugConfigResponse extends js.Object {
  /** The encoded debug configuration for the requested component. */
  var config: js.UndefOr[String] = js.undefined
}

object GetDebugConfigResponse {
  @scala.inline
  def apply(config: String = null): GetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDebugConfigResponse]
  }
}

