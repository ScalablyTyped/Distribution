package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessage extends js.Object {
  /** The authorDetails object contains basic details about the user that posted this message. */
  var authorDetails: js.UndefOr[LiveChatMessageAuthorDetails] = js.native
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  /** The ID that YouTube assigns to uniquely identify the message. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessage". */
  var kind: js.UndefOr[String] = js.native
  /** The snippet object contains basic details about the message. */
  var snippet: js.UndefOr[LiveChatMessageSnippet] = js.native
}

object LiveChatMessage {
  @scala.inline
  def apply(): LiveChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessage]
  }
  @scala.inline
  implicit class LiveChatMessageOps[Self <: LiveChatMessage] (val x: Self) extends AnyVal {
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
    def setAuthorDetails(value: LiveChatMessageAuthorDetails): Self = this.set("authorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorDetails: Self = this.set("authorDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSnippet(value: LiveChatMessageSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
  
}

