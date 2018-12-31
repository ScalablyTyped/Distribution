package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_TranslationLanguage): gapiDotClientLib.gapiNs.clientNs.Request[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_MaxResultsTranslationLanguage): gapiDotClientLib.gapiNs.clientNs.Request[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintPackageNameQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[ReviewsReplyResponse]
}

