package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thread extends js.Object {
  /** The ID of the last history record that modified this thread. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of the thread. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The list of messages in the thread. */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  /** A short part of the message text. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
}

object Thread {
  @scala.inline
  def apply(
    historyId: java.lang.String = null,
    id: java.lang.String = null,
    messages: js.Array[Message] = null,
    snippet: java.lang.String = null
  ): Thread = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[Thread]
  }
}

