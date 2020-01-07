package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of messages representing a conversation.
  */
@js.native
trait Schema$Thread extends js.Object {
  /**
    * The ID of the last history record that modified this thread.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The unique ID of the thread.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The list of messages in the thread.
    */
  var messages: js.UndefOr[js.Array[Schema$Message]] = js.native
  /**
    * A short part of the message text.
    */
  var snippet: js.UndefOr[String] = js.native
}

object Schema$Thread {
  @scala.inline
  def apply(
    historyId: String = null,
    id: String = null,
    messages: js.Array[Schema$Message] = null,
    snippet: String = null
  ): Schema$Thread = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Thread]
  }
}

