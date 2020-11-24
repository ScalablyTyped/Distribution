package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Placement
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementsGenerateTagsResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlacementsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsCollection extends js.Object {
  
  // Generates tags for a placement.
  def generatetags(profileId: String): PlacementsGenerateTagsResponse = js.native
  // Generates tags for a placement.
  def generatetags(profileId: String, optionalArgs: js.Object): PlacementsGenerateTagsResponse = js.native
  
  // Gets one placement by ID.
  def get(profileId: String, id: String): Placement = js.native
  
  // Inserts a new placement.
  def insert(resource: Placement, profileId: String): Placement = js.native
  
  // Retrieves a list of placements, possibly filtered. This method supports paging.
  def list(profileId: String): PlacementsListResponse = js.native
  // Retrieves a list of placements, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): PlacementsListResponse = js.native
  
  // Updates an existing placement. This method supports patch semantics.
  def patch(resource: Placement, profileId: String, id: String): Placement = js.native
  
  // Updates an existing placement.
  def update(resource: Placement, profileId: String): Placement = js.native
}
