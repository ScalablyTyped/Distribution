package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Labels are used to categorize messages and threads within the user&#39;s
  * mailbox.
  */
@js.native
trait Schema$Label extends js.Object {
  /**
    * The color to assign to the label. Color is only available for labels that
    * have their type set to user.
    */
  var color: js.UndefOr[Schema$LabelColor] = js.native
  /**
    * The immutable ID of the label.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The visibility of the label in the label list in the Gmail web interface.
    */
  var labelListVisibility: js.UndefOr[String] = js.native
  /**
    * The visibility of the label in the message list in the Gmail web
    * interface.
    */
  var messageListVisibility: js.UndefOr[String] = js.native
  /**
    * The total number of messages with the label.
    */
  var messagesTotal: js.UndefOr[Double] = js.native
  /**
    * The number of unread messages with the label.
    */
  var messagesUnread: js.UndefOr[Double] = js.native
  /**
    * The display name of the label.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The total number of threads with the label.
    */
  var threadsTotal: js.UndefOr[Double] = js.native
  /**
    * The number of unread threads with the label.
    */
  var threadsUnread: js.UndefOr[Double] = js.native
  /**
    * The owner type for the label. User labels are created by the user and can
    * be modified and deleted by the user and can be applied to any message or
    * thread. System labels are internally created and cannot be added,
    * modified, or deleted. System labels may be able to be applied to or
    * removed from messages and threads under some circumstances but this is
    * not guaranteed. For example, users can apply and remove the INBOX and
    * UNREAD labels from messages and threads, but cannot apply or remove the
    * DRAFTS or SENT labels from messages or threads.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Label {
  @scala.inline
  def apply(
    color: Schema$LabelColor = null,
    id: String = null,
    labelListVisibility: String = null,
    messageListVisibility: String = null,
    messagesTotal: Int | Double = null,
    messagesUnread: Int | Double = null,
    name: String = null,
    threadsTotal: Int | Double = null,
    threadsUnread: Int | Double = null,
    `type`: String = null
  ): Schema$Label = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility.asInstanceOf[js.Any])
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility.asInstanceOf[js.Any])
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (messagesUnread != null) __obj.updateDynamic("messagesUnread")(messagesUnread.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    if (threadsUnread != null) __obj.updateDynamic("threadsUnread")(threadsUnread.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Label]
  }
}

