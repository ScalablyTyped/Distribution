package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  /** Whether the response should exclude chats. */
  var excludeChats: js.UndefOr[Boolean] = js.undefined
  /** The sender's display name or email address. */
  var from: js.UndefOr[String] = js.undefined
  /** Whether the message has any attachment. */
  var hasAttachment: js.UndefOr[Boolean] = js.undefined
  /**
    * Only return messages not matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread".
    */
  var negatedQuery: js.UndefOr[String] = js.undefined
  /**
    * Only return messages matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread".
    */
  var query: js.UndefOr[String] = js.undefined
  /** The size of the entire RFC822 message in bytes, including all headers and attachments. */
  var size: js.UndefOr[Double] = js.undefined
  /** How the message size in bytes should be in relation to the size field. */
  var sizeComparison: js.UndefOr[String] = js.undefined
  /** Case-insensitive phrase found in the message's subject. Trailing and leading whitespace are be trimmed and adjacent spaces are collapsed. */
  var subject: js.UndefOr[String] = js.undefined
  /**
    * The recipient's display name or email address. Includes recipients in the "to", "cc", and "bcc" header fields. You can use simply the local part of the
    * email address. For example, "example" and "example@" both match "example@gmail.com". This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    excludeChats: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    hasAttachment: js.UndefOr[Boolean] = js.undefined,
    negatedQuery: String = null,
    query: String = null,
    size: Int | Double = null,
    sizeComparison: String = null,
    subject: String = null,
    to: String = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeChats)) __obj.updateDynamic("excludeChats")(excludeChats.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAttachment)) __obj.updateDynamic("hasAttachment")(hasAttachment.asInstanceOf[js.Any])
    if (negatedQuery != null) __obj.updateDynamic("negatedQuery")(negatedQuery.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeComparison != null) __obj.updateDynamic("sizeComparison")(sizeComparison.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

