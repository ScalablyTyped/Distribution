package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsIds
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one placement strategy by ID. */
  def get(request: AnonAltFields): Request_[PlacementStrategy]
  /** Inserts a new placement strategy. */
  def insert(request: AnonAltFieldsKey): Request_[PlacementStrategy]
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIds): Request_[PlacementStrategiesListResponse]
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[PlacementStrategy]
  /** Updates an existing placement strategy. */
  def update(request: AnonAltFieldsKey): Request_[PlacementStrategy]
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[PlacementStrategy],
    insert: AnonAltFieldsKey => Request_[PlacementStrategy],
    list: AnonAltFieldsIds => Request_[PlacementStrategiesListResponse],
    patch: AnonAltFields => Request_[PlacementStrategy],
    update: AnonAltFieldsKey => Request_[PlacementStrategy]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
}

