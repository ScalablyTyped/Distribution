package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonRemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: AnonRemarketingListId): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: AnonRemarketingListId): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: AnonKey): Request_[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: AnonRemarketingListId => Request_[RemarketingListShare],
    patch: AnonRemarketingListId => Request_[RemarketingListShare],
    update: AnonKey => Request_[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

