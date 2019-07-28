package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIds
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one placement strategy by ID. */
  def get(request: Anon_AltFields): Request[PlacementStrategy]
  /** Inserts a new placement strategy. */
  def insert(request: Anon_AltFieldsKey): Request[PlacementStrategy]
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIds): Request[PlacementStrategiesListResponse]
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[PlacementStrategy]
  /** Updates an existing placement strategy. */
  def update(request: Anon_AltFieldsKey): Request[PlacementStrategy]
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[PlacementStrategy],
    insert: Anon_AltFieldsKey => Request[PlacementStrategy],
    list: Anon_AltFieldsIds => Request[PlacementStrategiesListResponse],
    patch: Anon_AltFields => Request[PlacementStrategy],
    update: Anon_AltFieldsKey => Request[PlacementStrategy]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
}

