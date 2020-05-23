package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.RemarketingAudienceId
import typings.gapiClientAnalytics.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: RemarketingAudienceId): Request[Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: RemarketingAudienceId): Request[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: QuotaUser): Request[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: Type): Request[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: RemarketingAudienceId): Request[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: RemarketingAudienceId): Request[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: RemarketingAudienceId => Request[Unit],
    get: RemarketingAudienceId => Request[RemarketingAudience],
    insert: QuotaUser => Request[RemarketingAudience],
    list: Type => Request[RemarketingAudiences],
    patch: RemarketingAudienceId => Request[RemarketingAudience],
    update: RemarketingAudienceId => Request[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

