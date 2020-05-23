package typings.expressBoom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    message: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

