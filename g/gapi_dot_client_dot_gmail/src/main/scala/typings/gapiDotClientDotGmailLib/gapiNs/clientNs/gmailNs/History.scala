package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait History extends js.Object {
  /** The mailbox sequence ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Labels added to messages in this history record. */
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.undefined
  /** Labels removed from messages in this history record. */
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.undefined
  /**
               * List of messages changed in this history record. The fields for specific change types, such as messagesAdded may duplicate messages in this field. We
               * recommend using the specific change-type fields instead of this.
               */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  /** Messages added to the mailbox in this history record. */
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.undefined
  /** Messages deleted (not Trashed) from the mailbox in this history record. */
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.undefined
}

