package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: Fields): Request[Unit]
  /** Gets one placement strategy by ID. */
  def get(request: Fields): Request[PlacementStrategy]
  /** Inserts a new placement strategy. */
  def insert(request: Key): Request[PlacementStrategy]
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[PlacementStrategiesListResponse]
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: Fields): Request[PlacementStrategy]
  /** Updates an existing placement strategy. */
  def update(request: Key): Request[PlacementStrategy]
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[PlacementStrategy],
    insert: Key => Request[PlacementStrategy],
    list: Oauthtoken => Request[PlacementStrategiesListResponse],
    patch: Fields => Request[PlacementStrategy],
    update: Key => Request[PlacementStrategy]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
}

