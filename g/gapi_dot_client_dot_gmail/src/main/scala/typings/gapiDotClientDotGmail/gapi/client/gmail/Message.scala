package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /** The ID of the last history record that modified this message. */
  var historyId: js.UndefOr[String] = js.undefined
  /** The immutable ID of the message. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The internal message creation timestamp (epoch ms), which determines ordering in the inbox. For normal SMTP-received email, this represents the time
    * the message was originally accepted by Google, which is more reliable than the Date header. However, for API-migrated mail, it can be configured by
    * client to be based on the Date header.
    */
  var internalDate: js.UndefOr[String] = js.undefined
  /** List of IDs of labels applied to this message. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The parsed email structure in the message parts. */
  var payload: js.UndefOr[MessagePart] = js.undefined
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded string. Returned in messages.get and drafts.get responses when the format=RAW
    * parameter is supplied.
    */
  var raw: js.UndefOr[String] = js.undefined
  /** Estimated size in bytes of the message. */
  var sizeEstimate: js.UndefOr[Double] = js.undefined
  /** A short part of the message text. */
  var snippet: js.UndefOr[String] = js.undefined
  /**
    * The ID of the thread the message belongs to. To add a message or draft to a thread, the following criteria must be met:
    * - The requested threadId must be specified on the Message or Draft.Message you supply with your request.
    * - The References and In-Reply-To headers must be set in compliance with the RFC 2822 standard.
    * - The Subject headers must match.
    */
  var threadId: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    historyId: String = null,
    id: String = null,
    internalDate: String = null,
    labelIds: js.Array[String] = null,
    payload: MessagePart = null,
    raw: String = null,
    sizeEstimate: Int | Double = null,
    snippet: String = null,
    threadId: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalDate != null) __obj.updateDynamic("internalDate")(internalDate)
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (sizeEstimate != null) __obj.updateDynamic("sizeEstimate")(sizeEstimate.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (threadId != null) __obj.updateDynamic("threadId")(threadId)
    __obj.asInstanceOf[Message]
  }
}

