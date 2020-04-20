package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonActiveAdvertiserId
import typings.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonFields): Request_[TargetableRemarketingList]
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserId): Request_[TargetableRemarketingListsListResponse]
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[TargetableRemarketingList],
    list: AnonActiveAdvertiserId => Request_[TargetableRemarketingListsListResponse]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
}

