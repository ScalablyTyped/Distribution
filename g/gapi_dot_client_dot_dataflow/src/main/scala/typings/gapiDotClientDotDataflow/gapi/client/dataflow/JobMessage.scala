package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobMessage extends js.Object {
  /** Deprecated. */
  var id: js.UndefOr[String] = js.undefined
  /** Importance level of the message. */
  var messageImportance: js.UndefOr[String] = js.undefined
  /** The text of the message. */
  var messageText: js.UndefOr[String] = js.undefined
  /** The timestamp of the message. */
  var time: js.UndefOr[String] = js.undefined
}

object JobMessage {
  @scala.inline
  def apply(
    id: String = null,
    messageImportance: String = null,
    messageText: String = null,
    time: String = null
  ): JobMessage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messageImportance != null) __obj.updateDynamic("messageImportance")(messageImportance.asInstanceOf[js.Any])
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobMessage]
  }
}

