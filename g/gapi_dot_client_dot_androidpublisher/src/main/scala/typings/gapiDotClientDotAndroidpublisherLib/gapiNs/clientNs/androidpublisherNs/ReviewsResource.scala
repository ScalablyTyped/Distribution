package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[ReviewsReplyResponse]
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewId => gapiDotClientLib.gapiNs.clientNs.Request[Review],
    list: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResultsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ReviewsListResponse],
    reply: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUserReviewIdUserIp => gapiDotClientLib.gapiNs.clientNs.Request[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
  
    __obj.asInstanceOf[ReviewsResource]
  }
}

