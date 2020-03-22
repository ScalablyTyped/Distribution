package typings.evernote

import typings.evernote.mod.Evernote.EDAMErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var errorCode: EDAMErrorCode
  var message: js.UndefOr[String] = js.undefined
  var rateLimitDuration: js.UndefOr[Double] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(errorCode: EDAMErrorCode, message: String = null, rateLimitDuration: Int | Double = null): AnonMessage = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (rateLimitDuration != null) __obj.updateDynamic("rateLimitDuration")(rateLimitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

