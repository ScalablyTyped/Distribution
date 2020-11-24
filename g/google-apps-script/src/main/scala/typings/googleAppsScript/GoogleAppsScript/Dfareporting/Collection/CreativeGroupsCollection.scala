package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CreativeGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CreativeGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeGroupsCollection extends js.Object {
  
  // Gets one creative group by ID.
  def get(profileId: String, id: String): CreativeGroup = js.native
  
  // Inserts a new creative group.
  def insert(resource: CreativeGroup, profileId: String): CreativeGroup = js.native
  
  // Retrieves a list of creative groups, possibly filtered. This method supports paging.
  def list(profileId: String): CreativeGroupsListResponse = js.native
  // Retrieves a list of creative groups, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): CreativeGroupsListResponse = js.native
  
  // Updates an existing creative group. This method supports patch semantics.
  def patch(resource: CreativeGroup, profileId: String, id: String): CreativeGroup = js.native
  
  // Updates an existing creative group.
  def update(resource: CreativeGroup, profileId: String): CreativeGroup = js.native
}
