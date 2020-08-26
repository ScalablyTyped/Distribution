package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.BanAuthor
import typings.gapiClientYoutube.anon.MaxResults
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: Alt): Request[Comment] = js.native
  /** Returns a list of comments that match the API request parameters. */
  def list(request: MaxResults): Request[CommentListResponse] = js.native
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: QuotaUser): Request[Unit] = js.native
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: BanAuthor): Request[Unit] = js.native
  /** Modifies a comment. */
  def update(request: Alt): Request[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[Comment],
    list: MaxResults => Request[CommentListResponse],
    markAsSpam: QuotaUser => Request[Unit],
    setModerationStatus: BanAuthor => Request[Unit],
    update: Alt => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), markAsSpam = js.Any.fromFunction1(markAsSpam), setModerationStatus = js.Any.fromFunction1(setModerationStatus), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[Comment]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[CommentListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMarkAsSpam(value: QuotaUser => Request[Unit]): Self = this.set("markAsSpam", js.Any.fromFunction1(value))
    @scala.inline
    def setSetModerationStatus(value: BanAuthor => Request[Unit]): Self = this.set("setModerationStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[Comment]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

