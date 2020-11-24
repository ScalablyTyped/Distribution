package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroupsCollection extends js.Object {
  
  // Gets one placement group by ID.
  def get(profileId: String, id: String): PlacementGroup = js.native
  
  // Inserts a new placement group.
  def insert(resource: PlacementGroup, profileId: String): PlacementGroup = js.native
  
  // Retrieves a list of placement groups, possibly filtered. This method supports paging.
  def list(profileId: String): PlacementGroupsListResponse = js.native
  // Retrieves a list of placement groups, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): PlacementGroupsListResponse = js.native
  
  // Updates an existing placement group. This method supports patch semantics.
  def patch(resource: PlacementGroup, profileId: String, id: String): PlacementGroup = js.native
  
  // Updates an existing placement group.
  def update(resource: PlacementGroup, profileId: String): PlacementGroup = js.native
}
