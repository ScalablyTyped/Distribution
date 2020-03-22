package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonFloodlightConfigurationId
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: AnonFields): Request_[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: AnonKey): Request_[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightConfigurationId): Request_[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: AnonKey): Request_[FloodlightActivityGroup]
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[FloodlightActivityGroup],
    insert: AnonKey => Request_[FloodlightActivityGroup],
    list: AnonFloodlightConfigurationId => Request_[FloodlightActivityGroupsListResponse],
    patch: AnonFields => Request_[FloodlightActivityGroup],
    update: AnonKey => Request_[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
}

