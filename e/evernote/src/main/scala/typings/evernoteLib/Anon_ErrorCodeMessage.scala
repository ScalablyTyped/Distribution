package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeMessage extends js.Object {
  var errorCode: evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
  var message: js.UndefOr[java.lang.String] = js.undefined
  var rateLimitDuration: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ErrorCodeMessage {
  @scala.inline
  def apply(
    errorCode: evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode,
    message: java.lang.String = null,
    rateLimitDuration: scala.Int | scala.Double = null
  ): Anon_ErrorCodeMessage = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (message != null) __obj.updateDynamic("message")(message)
    if (rateLimitDuration != null) __obj.updateDynamic("rateLimitDuration")(rateLimitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorCodeMessage]
  }
}

