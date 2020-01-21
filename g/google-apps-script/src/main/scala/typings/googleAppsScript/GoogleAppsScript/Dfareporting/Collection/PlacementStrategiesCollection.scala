package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementStrategiesListResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementStrategiesCollection extends js.Object {
  // Gets one placement strategy by ID.
  def get(profileId: String, id: String): PlacementStrategy = js.native
  // Inserts a new placement strategy.
  def insert(resource: PlacementStrategy, profileId: String): PlacementStrategy = js.native
  // Retrieves a list of placement strategies, possibly filtered. This method supports paging.
  def list(profileId: String): PlacementStrategiesListResponse = js.native
  // Retrieves a list of placement strategies, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): PlacementStrategiesListResponse = js.native
  // Updates an existing placement strategy. This method supports patch semantics.
  def patch(resource: PlacementStrategy, profileId: String, id: String): PlacementStrategy = js.native
  // Deletes an existing placement strategy.
  def remove(profileId: String, id: String): Unit = js.native
  // Updates an existing placement strategy.
  def update(resource: PlacementStrategy, profileId: String): PlacementStrategy = js.native
}

