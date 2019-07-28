package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

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
    if (id != null) __obj.updateDynamic("id")(id)
    if (messageImportance != null) __obj.updateDynamic("messageImportance")(messageImportance)
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[JobMessage]
  }
}

