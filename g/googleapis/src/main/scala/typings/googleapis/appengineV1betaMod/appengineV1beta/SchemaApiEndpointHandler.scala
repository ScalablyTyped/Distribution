package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uses Google Cloud Endpoints to handle requests.
  */
@js.native
trait SchemaApiEndpointHandler extends js.Object {
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.native
}

object SchemaApiEndpointHandler {
  @scala.inline
  def apply(scriptPath: String = null): SchemaApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApiEndpointHandler]
  }
}

