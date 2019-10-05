package typings.evernote

import typings.evernote.evernoteMod.Evernote.EDAMErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeMessage extends js.Object {
  var errorCode: EDAMErrorCode
  var message: js.UndefOr[String] = js.undefined
  var rateLimitDuration: js.UndefOr[Double] = js.undefined
}

object Anon_ErrorCodeMessage {
  @scala.inline
  def apply(errorCode: EDAMErrorCode, message: String = null, rateLimitDuration: Int | Double = null): Anon_ErrorCodeMessage = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (message != null) __obj.updateDynamic("message")(message)
    if (rateLimitDuration != null) __obj.updateDynamic("rateLimitDuration")(rateLimitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorCodeMessage]
  }
}

