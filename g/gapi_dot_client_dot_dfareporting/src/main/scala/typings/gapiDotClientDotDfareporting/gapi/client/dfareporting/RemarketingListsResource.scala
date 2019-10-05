package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAdvertiserIdAltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Anon_AltFields): Request[RemarketingList]
  /** Inserts a new remarketing list. */
  def insert(request: Anon_AltFieldsKey): Request[RemarketingList]
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAdvertiserIdAltFields): Request[RemarketingListsListResponse]
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[RemarketingList]
  /** Updates an existing remarketing list. */
  def update(request: Anon_AltFieldsKey): Request[RemarketingList]
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[RemarketingList],
    insert: Anon_AltFieldsKey => Request[RemarketingList],
    list: Anon_ActiveAdvertiserIdAltFields => Request[RemarketingListsListResponse],
    patch: Anon_AltFields => Request[RemarketingList],
    update: Anon_AltFieldsKey => Request[RemarketingList]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListsResource]
  }
}

