package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /** The ID of the last history record that modified this message. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** The immutable ID of the message. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The internal message creation timestamp (epoch ms), which determines ordering in the inbox. For normal SMTP-received email, this represents the time
    * the message was originally accepted by Google, which is more reliable than the Date header. However, for API-migrated mail, it can be configured by
    * client to be based on the Date header.
    */
  var internalDate: js.UndefOr[java.lang.String] = js.undefined
  /** List of IDs of labels applied to this message. */
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The parsed email structure in the message parts. */
  var payload: js.UndefOr[MessagePart] = js.undefined
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded string. Returned in messages.get and drafts.get responses when the format=RAW
    * parameter is supplied.
    */
  var raw: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated size in bytes of the message. */
  var sizeEstimate: js.UndefOr[scala.Double] = js.undefined
  /** A short part of the message text. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the thread the message belongs to. To add a message or draft to a thread, the following criteria must be met:
    * - The requested threadId must be specified on the Message or Draft.Message you supply with your request.
    * - The References and In-Reply-To headers must be set in compliance with the RFC 2822 standard.
    * - The Subject headers must match.
    */
  var threadId: js.UndefOr[java.lang.String] = js.undefined
}

