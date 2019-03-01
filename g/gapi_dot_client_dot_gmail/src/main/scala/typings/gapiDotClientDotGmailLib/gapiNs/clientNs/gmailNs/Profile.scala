package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  /** The user's email address. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of messages in the mailbox. */
  var messagesTotal: js.UndefOr[scala.Double] = js.undefined
  /** The total number of threads in the mailbox. */
  var threadsTotal: js.UndefOr[scala.Double] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    emailAddress: java.lang.String = null,
    historyId: java.lang.String = null,
    messagesTotal: scala.Int | scala.Double = null,
    threadsTotal: scala.Int | scala.Double = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

