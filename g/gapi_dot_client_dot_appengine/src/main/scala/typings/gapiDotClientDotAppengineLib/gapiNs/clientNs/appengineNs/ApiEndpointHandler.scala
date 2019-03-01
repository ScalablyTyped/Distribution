package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiEndpointHandler extends js.Object {
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[java.lang.String] = js.undefined
}

object ApiEndpointHandler {
  @scala.inline
  def apply(scriptPath: java.lang.String = null): ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath)
    __obj.asInstanceOf[ApiEndpointHandler]
  }
}

