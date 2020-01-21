package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonActiveAdvertiserIdAltFields
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonAltFields): Request_[RemarketingList]
  /** Inserts a new remarketing list. */
  def insert(request: AnonAltFieldsKey): Request_[RemarketingList]
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserIdAltFields): Request_[RemarketingListsListResponse]
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[RemarketingList]
  /** Updates an existing remarketing list. */
  def update(request: AnonAltFieldsKey): Request_[RemarketingList]
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[RemarketingList],
    insert: AnonAltFieldsKey => Request_[RemarketingList],
    list: AnonActiveAdvertiserIdAltFields => Request_[RemarketingListsListResponse],
    patch: AnonAltFields => Request_[RemarketingList],
    update: AnonAltFieldsKey => Request_[RemarketingList]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListsResource]
  }
}

