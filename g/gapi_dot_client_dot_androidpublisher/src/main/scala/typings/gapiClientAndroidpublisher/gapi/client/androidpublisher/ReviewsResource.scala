package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.ReviewId
import typings.gapiClientAndroidpublisher.anon.Token
import typings.gapiClientAndroidpublisher.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: ReviewId): Request[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: Token): Request[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: UserIp): Request[ReviewsReplyResponse]
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
}

