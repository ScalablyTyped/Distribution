package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightActivityGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightActivityGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityGroupsCollection extends js.Object {
  // Gets one floodlight activity group by ID.
  def get(profileId: String, id: String): FloodlightActivityGroup = js.native
  // Inserts a new floodlight activity group.
  def insert(resource: FloodlightActivityGroup, profileId: String): FloodlightActivityGroup = js.native
  // Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging.
  def list(profileId: String): FloodlightActivityGroupsListResponse = js.native
  // Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): FloodlightActivityGroupsListResponse = js.native
  // Updates an existing floodlight activity group. This method supports patch semantics.
  def patch(resource: FloodlightActivityGroup, profileId: String, id: String): FloodlightActivityGroup = js.native
  // Updates an existing floodlight activity group.
  def update(resource: FloodlightActivityGroup, profileId: String): FloodlightActivityGroup = js.native
}

