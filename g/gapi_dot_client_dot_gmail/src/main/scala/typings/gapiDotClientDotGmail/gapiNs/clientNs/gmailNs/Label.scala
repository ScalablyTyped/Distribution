package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** The immutable ID of the label. */
  var id: js.UndefOr[String] = js.undefined
  /** The visibility of the label in the label list in the Gmail web interface. */
  var labelListVisibility: js.UndefOr[String] = js.undefined
  /** The visibility of the label in the message list in the Gmail web interface. */
  var messageListVisibility: js.UndefOr[String] = js.undefined
  /** The total number of messages with the label. */
  var messagesTotal: js.UndefOr[Double] = js.undefined
  /** The number of unread messages with the label. */
  var messagesUnread: js.UndefOr[Double] = js.undefined
  /** The display name of the label. */
  var name: js.UndefOr[String] = js.undefined
  /** The total number of threads with the label. */
  var threadsTotal: js.UndefOr[Double] = js.undefined
  /** The number of unread threads with the label. */
  var threadsUnread: js.UndefOr[Double] = js.undefined
  /**
    * The owner type for the label. User labels are created by the user and can be modified and deleted by the user and can be applied to any message or
    * thread. System labels are internally created and cannot be added, modified, or deleted. System labels may be able to be applied to or removed from
    * messages and threads under some circumstances but this is not guaranteed. For example, users can apply and remove the INBOX and UNREAD labels from
    * messages and threads, but cannot apply or remove the DRAFTS or SENT labels from messages or threads.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    id: String = null,
    labelListVisibility: String = null,
    messageListVisibility: String = null,
    messagesTotal: Int | Double = null,
    messagesUnread: Int | Double = null,
    name: String = null,
    threadsTotal: Int | Double = null,
    threadsUnread: Int | Double = null,
    `type`: String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility)
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility)
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (messagesUnread != null) __obj.updateDynamic("messagesUnread")(messagesUnread.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    if (threadsUnread != null) __obj.updateDynamic("threadsUnread")(threadsUnread.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Label]
  }
}

