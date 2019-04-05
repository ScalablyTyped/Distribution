package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureErrorOptions extends js.Object {
  var custom: js.UndefOr[js.Object] = js.undefined
  var handled: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var request: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  var response: js.UndefOr[nodeLib.httpMod.ServerResponse] = js.undefined
  var tags: js.UndefOr[Tags] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var user: js.UndefOr[UserObject] = js.undefined
}

object CaptureErrorOptions {
  @scala.inline
  def apply(
    custom: js.Object = null,
    handled: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    request: nodeLib.httpMod.IncomingMessage = null,
    response: nodeLib.httpMod.ServerResponse = null,
    tags: Tags = null,
    timestamp: scala.Int | scala.Double = null,
    user: UserObject = null
  ): CaptureErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled)
    if (message != null) __obj.updateDynamic("message")(message)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CaptureErrorOptions]
  }
}

