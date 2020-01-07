package typings.googleapis.buildSrcApisCloudshellV1Mod.cloudshell_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message included in the response field of operations returned from
  * StartEnvironment once the operation is complete.
  */
@js.native
trait Schema$StartEnvironmentResponse extends js.Object {
  /**
    * Environment that was started.
    */
  var environment: js.UndefOr[Schema$Environment] = js.native
}

object Schema$StartEnvironmentResponse {
  @scala.inline
  def apply(environment: Schema$Environment = null): Schema$StartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartEnvironmentResponse]
  }
}

