package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureErrorOptions extends js.Object {
  var custom: js.UndefOr[js.Object] = js.undefined
  var handled: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[IncomingMessage] = js.undefined
  var response: js.UndefOr[ServerResponse] = js.undefined
  var tags: js.UndefOr[Labels] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var user: js.UndefOr[UserObject] = js.undefined
}

object CaptureErrorOptions {
  @scala.inline
  def apply(
    custom: js.Object = null,
    handled: js.UndefOr[Boolean] = js.undefined,
    labels: Labels = null,
    message: String = null,
    request: IncomingMessage = null,
    response: ServerResponse = null,
    tags: Labels = null,
    timestamp: Int | Double = null,
    user: UserObject = null
  ): CaptureErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (message != null) __obj.updateDynamic("message")(message)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CaptureErrorOptions]
  }
}

