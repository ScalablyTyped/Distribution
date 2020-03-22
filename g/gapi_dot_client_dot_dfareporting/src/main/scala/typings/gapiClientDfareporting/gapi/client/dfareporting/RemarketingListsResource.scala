package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonFields): Request_[RemarketingList]
  /** Inserts a new remarketing list. */
  def insert(request: AnonKey): Request_[RemarketingList]
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonSortOrder): Request_[RemarketingListsListResponse]
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[RemarketingList]
  /** Updates an existing remarketing list. */
  def update(request: AnonKey): Request_[RemarketingList]
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[RemarketingList],
    insert: AnonKey => Request_[RemarketingList],
    list: AnonSortOrder => Request_[RemarketingListsListResponse],
    patch: AnonFields => Request_[RemarketingList],
    update: AnonKey => Request_[RemarketingList]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListsResource]
  }
}

