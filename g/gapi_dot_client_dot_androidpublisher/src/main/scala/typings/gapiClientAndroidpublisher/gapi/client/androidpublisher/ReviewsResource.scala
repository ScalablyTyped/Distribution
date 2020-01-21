package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyMaxResultsOauthtoken
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId): Request_[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: AnonAltFieldsKeyMaxResultsOauthtoken): Request_[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp): Request_[ReviewsReplyResponse]
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId => Request_[Review],
    list: AnonAltFieldsKeyMaxResultsOauthtoken => Request_[ReviewsListResponse],
    reply: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp => Request_[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
  
    __obj.asInstanceOf[ReviewsResource]
  }
}

