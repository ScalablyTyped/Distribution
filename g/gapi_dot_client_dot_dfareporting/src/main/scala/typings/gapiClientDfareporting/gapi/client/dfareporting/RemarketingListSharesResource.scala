package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.RemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: RemarketingListId): Request[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: RemarketingListId): Request[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: Key): Request[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: RemarketingListId => Request[RemarketingListShare],
    patch: RemarketingListId => Request[RemarketingListShare],
    update: Key => Request[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

