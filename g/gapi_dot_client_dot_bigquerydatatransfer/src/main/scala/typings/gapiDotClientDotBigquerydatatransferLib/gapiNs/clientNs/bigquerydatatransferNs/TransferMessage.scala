package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferMessage extends js.Object {
  /** Message text. */
  var messageText: js.UndefOr[java.lang.String] = js.undefined
  /** Time when message was logged. */
  var messageTime: js.UndefOr[java.lang.String] = js.undefined
  /** Message severity. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
}

object TransferMessage {
  @scala.inline
  def apply(
    messageText: java.lang.String = null,
    messageTime: java.lang.String = null,
    severity: java.lang.String = null
  ): TransferMessage = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    if (messageTime != null) __obj.updateDynamic("messageTime")(messageTime)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    __obj.asInstanceOf[TransferMessage]
  }
}

