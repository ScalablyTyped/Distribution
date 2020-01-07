package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a get debug configuration request.
  */
@js.native
trait Schema$GetDebugConfigResponse extends js.Object {
  /**
    * The encoded debug configuration for the requested component.
    */
  var config: js.UndefOr[String] = js.native
}

object Schema$GetDebugConfigResponse {
  @scala.inline
  def apply(config: String = null): Schema$GetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetDebugConfigResponse]
  }
}

