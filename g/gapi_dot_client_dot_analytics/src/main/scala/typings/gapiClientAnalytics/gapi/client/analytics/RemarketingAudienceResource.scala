package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonQuotaUser
import typings.gapiClientAnalytics.AnonRemarketingAudienceId
import typings.gapiClientAnalytics.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: AnonRemarketingAudienceId): Request_[Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: AnonQuotaUser): Request_[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: AnonType): Request_[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: AnonRemarketingAudienceId => Request_[Unit],
    get: AnonRemarketingAudienceId => Request_[RemarketingAudience],
    insert: AnonQuotaUser => Request_[RemarketingAudience],
    list: AnonType => Request_[RemarketingAudiences],
    patch: AnonRemarketingAudienceId => Request_[RemarketingAudience],
    update: AnonRemarketingAudienceId => Request_[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

