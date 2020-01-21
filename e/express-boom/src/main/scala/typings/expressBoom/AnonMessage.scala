package typings.expressBoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(
    message: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): AnonMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

