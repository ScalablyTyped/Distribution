package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of a change to the user&#39;s mailbox. Each history change may
  * affect multiple messages in multiple ways.
  */
@js.native
trait Schema$History extends js.Object {
  /**
    * The mailbox sequence ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Labels added to messages in this history record.
    */
  var labelsAdded: js.UndefOr[js.Array[Schema$HistoryLabelAdded]] = js.native
  /**
    * Labels removed from messages in this history record.
    */
  var labelsRemoved: js.UndefOr[js.Array[Schema$HistoryLabelRemoved]] = js.native
  /**
    * List of messages changed in this history record. The fields for specific
    * change types, such as messagesAdded may duplicate messages in this field.
    * We recommend using the specific change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[Schema$Message]] = js.native
  /**
    * Messages added to the mailbox in this history record.
    */
  var messagesAdded: js.UndefOr[js.Array[Schema$HistoryMessageAdded]] = js.native
  /**
    * Messages deleted (not Trashed) from the mailbox in this history record.
    */
  var messagesDeleted: js.UndefOr[js.Array[Schema$HistoryMessageDeleted]] = js.native
}

object Schema$History {
  @scala.inline
  def apply(
    id: String = null,
    labelsAdded: js.Array[Schema$HistoryLabelAdded] = null,
    labelsRemoved: js.Array[Schema$HistoryLabelRemoved] = null,
    messages: js.Array[Schema$Message] = null,
    messagesAdded: js.Array[Schema$HistoryMessageAdded] = null,
    messagesDeleted: js.Array[Schema$HistoryMessageDeleted] = null
  ): Schema$History = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelsAdded != null) __obj.updateDynamic("labelsAdded")(labelsAdded.asInstanceOf[js.Any])
    if (labelsRemoved != null) __obj.updateDynamic("labelsRemoved")(labelsRemoved.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (messagesAdded != null) __obj.updateDynamic("messagesAdded")(messagesAdded.asInstanceOf[js.Any])
    if (messagesDeleted != null) __obj.updateDynamic("messagesDeleted")(messagesDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$History]
  }
}

