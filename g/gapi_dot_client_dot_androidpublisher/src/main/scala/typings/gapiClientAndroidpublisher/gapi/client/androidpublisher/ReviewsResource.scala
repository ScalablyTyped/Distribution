package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.ReviewId
import typings.gapiClientAndroidpublisher.anon.Token
import typings.gapiClientAndroidpublisher.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: ReviewId): Request[Review] = js.native
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: Token): Request[ReviewsListResponse] = js.native
  /** Reply to a single review, or update an existing reply. */
  def reply(request: UserIp): Request[ReviewsReplyResponse] = js.native
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: ReviewId => Request[Review],
    list: Token => Request[ReviewsListResponse],
    reply: UserIp => Request[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
    __obj.asInstanceOf[ReviewsResource]
  }
  @scala.inline
  implicit class ReviewsResourceOps[Self <: ReviewsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: ReviewId => Request[Review]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Token => Request[ReviewsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setReply(value: UserIp => Request[ReviewsReplyResponse]): Self = this.set("reply", js.Any.fromFunction1(value))
  }
  
}

