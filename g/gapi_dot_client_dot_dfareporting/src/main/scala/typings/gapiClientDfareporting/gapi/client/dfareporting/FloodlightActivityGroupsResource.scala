package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdAltFieldsFloodlightConfigurationId
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: AnonAltFields): Request_[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: AnonAltFieldsKey): Request_[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdAltFieldsFloodlightConfigurationId): Request_[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: AnonAltFieldsKey): Request_[FloodlightActivityGroup]
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[FloodlightActivityGroup],
    insert: AnonAltFieldsKey => Request_[FloodlightActivityGroup],
    list: AnonAdvertiserIdAltFieldsFloodlightConfigurationId => Request_[FloodlightActivityGroupsListResponse],
    patch: AnonAltFields => Request_[FloodlightActivityGroup],
    update: AnonAltFieldsKey => Request_[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
}

