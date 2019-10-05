package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdAltFieldsFloodlightConfigurationId
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: Anon_AltFields): Request[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: Anon_AltFieldsKey): Request[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdAltFieldsFloodlightConfigurationId): Request[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: Anon_AltFieldsKey): Request[FloodlightActivityGroup]
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[FloodlightActivityGroup],
    insert: Anon_AltFieldsKey => Request[FloodlightActivityGroup],
    list: Anon_AdvertiserIdAltFieldsFloodlightConfigurationId => Request[FloodlightActivityGroupsListResponse],
    patch: Anon_AltFields => Request[FloodlightActivityGroup],
    update: Anon_AltFieldsKey => Request[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
}

