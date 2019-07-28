package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyMaxResultsOauthtoken
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId): Request[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: Anon_AltFieldsKeyMaxResultsOauthtoken): Request[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp): Request[ReviewsReplyResponse]
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId => Request[Review],
    list: Anon_AltFieldsKeyMaxResultsOauthtoken => Request[ReviewsListResponse],
    reply: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp => Request[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
  
    __obj.asInstanceOf[ReviewsResource]
  }
}

