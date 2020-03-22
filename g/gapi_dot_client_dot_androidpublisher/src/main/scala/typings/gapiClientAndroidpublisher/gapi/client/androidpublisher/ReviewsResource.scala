package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonReviewId
import typings.gapiClientAndroidpublisher.AnonToken
import typings.gapiClientAndroidpublisher.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: AnonReviewId): Request_[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: AnonToken): Request_[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: AnonUserIp): Request_[ReviewsReplyResponse]
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: AnonReviewId => Request_[Review],
    list: AnonToken => Request_[ReviewsListResponse],
    reply: AnonUserIp => Request_[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
  
    __obj.asInstanceOf[ReviewsResource]
  }
}

