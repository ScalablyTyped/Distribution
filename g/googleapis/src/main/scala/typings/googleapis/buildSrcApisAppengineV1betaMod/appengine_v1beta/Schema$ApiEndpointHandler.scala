package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uses Google Cloud Endpoints to handle requests.
  */
@js.native
trait Schema$ApiEndpointHandler extends js.Object {
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.native
}

object Schema$ApiEndpointHandler {
  @scala.inline
  def apply(scriptPath: String = null): Schema$ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApiEndpointHandler]
  }
}

