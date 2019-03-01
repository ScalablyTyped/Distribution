package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobMessage extends js.Object {
  /** Deprecated. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Importance level of the message. */
  var messageImportance: js.UndefOr[java.lang.String] = js.undefined
  /** The text of the message. */
  var messageText: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp of the message. */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object JobMessage {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    messageImportance: java.lang.String = null,
    messageText: java.lang.String = null,
    time: java.lang.String = null
  ): JobMessage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (messageImportance != null) __obj.updateDynamic("messageImportance")(messageImportance)
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[JobMessage]
  }
}

