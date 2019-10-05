package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollVotedDetails extends js.Object {
  /** The poll item the user chose. */
  var itemId: js.UndefOr[String] = js.undefined
  /** The poll the user voted on. */
  var pollId: js.UndefOr[String] = js.undefined
}

object LiveChatPollVotedDetails {
  @scala.inline
  def apply(itemId: String = null, pollId: String = null): LiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (pollId != null) __obj.updateDynamic("pollId")(pollId)
    __obj.asInstanceOf[LiveChatPollVotedDetails]
  }
}

