package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdsAlt
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: Anon_AltFields): Request[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: Anon_AltFieldsKey): Request[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdsAlt): Request[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: Anon_AltFieldsKey): Request[CreativeGroup]
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[CreativeGroup],
    insert: Anon_AltFieldsKey => Request[CreativeGroup],
    list: Anon_AdvertiserIdsAlt => Request[CreativeGroupsListResponse],
    patch: Anon_AltFields => Request[CreativeGroup],
    update: Anon_AltFieldsKey => Request[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeGroupsResource]
  }
}

