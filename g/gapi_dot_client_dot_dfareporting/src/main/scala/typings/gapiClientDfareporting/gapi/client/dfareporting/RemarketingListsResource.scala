package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Fields): Request[RemarketingList]
  /** Inserts a new remarketing list. */
  def insert(request: Key): Request[RemarketingList]
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: SortOrder): Request[RemarketingListsListResponse]
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: Fields): Request[RemarketingList]
  /** Updates an existing remarketing list. */
  def update(request: Key): Request[RemarketingList]
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: Fields => Request[RemarketingList],
    insert: Key => Request[RemarketingList],
    list: SortOrder => Request[RemarketingListsListResponse],
    patch: Fields => Request[RemarketingList],
    update: Key => Request[RemarketingList]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListsResource]
  }
}

