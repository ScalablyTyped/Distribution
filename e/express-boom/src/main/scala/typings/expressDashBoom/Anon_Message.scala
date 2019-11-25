package typings.expressDashBoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

