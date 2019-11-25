package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiEndpointHandler extends js.Object {
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.undefined
}

object ApiEndpointHandler {
  @scala.inline
  def apply(scriptPath: String = null): ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiEndpointHandler]
  }
}

