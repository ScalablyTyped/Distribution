package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** The immutable ID of the label. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The visibility of the label in the label list in the Gmail web interface. */
  var labelListVisibility: js.UndefOr[java.lang.String] = js.undefined
  /** The visibility of the label in the message list in the Gmail web interface. */
  var messageListVisibility: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of messages with the label. */
  var messagesTotal: js.UndefOr[scala.Double] = js.undefined
  /** The number of unread messages with the label. */
  var messagesUnread: js.UndefOr[scala.Double] = js.undefined
  /** The display name of the label. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of threads with the label. */
  var threadsTotal: js.UndefOr[scala.Double] = js.undefined
  /** The number of unread threads with the label. */
  var threadsUnread: js.UndefOr[scala.Double] = js.undefined
  /**
    * The owner type for the label. User labels are created by the user and can be modified and deleted by the user and can be applied to any message or
    * thread. System labels are internally created and cannot be added, modified, or deleted. System labels may be able to be applied to or removed from
    * messages and threads under some circumstances but this is not guaranteed. For example, users can apply and remove the INBOX and UNREAD labels from
    * messages and threads, but cannot apply or remove the DRAFTS or SENT labels from messages or threads.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

