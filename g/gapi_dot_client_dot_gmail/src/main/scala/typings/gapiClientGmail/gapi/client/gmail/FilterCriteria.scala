package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCriteria extends js.Object {
  /** Whether the response should exclude chats. */
  var excludeChats: js.UndefOr[Boolean] = js.native
  /** The sender's display name or email address. */
  var from: js.UndefOr[String] = js.native
  /** Whether the message has any attachment. */
  var hasAttachment: js.UndefOr[Boolean] = js.native
  /**
    * Only return messages not matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread".
    */
  var negatedQuery: js.UndefOr[String] = js.native
  /**
    * Only return messages matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread".
    */
  var query: js.UndefOr[String] = js.native
  /** The size of the entire RFC822 message in bytes, including all headers and attachments. */
  var size: js.UndefOr[Double] = js.native
  /** How the message size in bytes should be in relation to the size field. */
  var sizeComparison: js.UndefOr[String] = js.native
  /** Case-insensitive phrase found in the message's subject. Trailing and leading whitespace are be trimmed and adjacent spaces are collapsed. */
  var subject: js.UndefOr[String] = js.native
  /**
    * The recipient's display name or email address. Includes recipients in the "to", "cc", and "bcc" header fields. You can use simply the local part of the
    * email address. For example, "example" and "example@" both match "example@gmail.com". This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.native
}

object FilterCriteria {
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcludeChats(value: Boolean): Self = this.set("excludeChats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeChats: Self = this.set("excludeChats", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHasAttachment(value: Boolean): Self = this.set("hasAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachment: Self = this.set("hasAttachment", js.undefined)
    @scala.inline
    def setNegatedQuery(value: String): Self = this.set("negatedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegatedQuery: Self = this.set("negatedQuery", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeComparison(value: String): Self = this.set("sizeComparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeComparison: Self = this.set("sizeComparison", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

