package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one placement strategy by ID. */
  def get(request: AnonFields): Request_[PlacementStrategy]
  /** Inserts a new placement strategy. */
  def insert(request: AnonKey): Request_[PlacementStrategy]
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[PlacementStrategiesListResponse]
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementStrategy]
  /** Updates an existing placement strategy. */
  def update(request: AnonKey): Request_[PlacementStrategy]
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[PlacementStrategy],
    insert: AnonKey => Request_[PlacementStrategy],
    list: AnonOauthtoken => Request_[PlacementStrategiesListResponse],
    patch: AnonFields => Request_[PlacementStrategy],
    update: AnonKey => Request_[PlacementStrategy]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
}

