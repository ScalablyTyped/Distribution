package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a user facing message for a particular data transfer run.
  */
@js.native
trait SchemaTransferMessage extends js.Object {
  /**
    * Message text.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * Time when message was logged.
    */
  var messageTime: js.UndefOr[String] = js.native
  /**
    * Message severity.
    */
  var severity: js.UndefOr[String] = js.native
}

object SchemaTransferMessage {
  @scala.inline
  def apply(messageText: String = null, messageTime: String = null, severity: String = null): SchemaTransferMessage = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    if (messageTime != null) __obj.updateDynamic("messageTime")(messageTime.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransferMessage]
  }
}

