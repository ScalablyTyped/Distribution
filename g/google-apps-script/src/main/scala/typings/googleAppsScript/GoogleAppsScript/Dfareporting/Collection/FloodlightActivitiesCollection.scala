package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightActivitiesGenerateTagResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightActivitiesListResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightActivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivitiesCollection extends js.Object {
  
  // Generates a tag for a floodlight activity.
  def generatetag(profileId: String): FloodlightActivitiesGenerateTagResponse = js.native
  // Generates a tag for a floodlight activity.
  def generatetag(profileId: String, optionalArgs: js.Object): FloodlightActivitiesGenerateTagResponse = js.native
  
  // Gets one floodlight activity by ID.
  def get(profileId: String, id: String): FloodlightActivity = js.native
  
  // Inserts a new floodlight activity.
  def insert(resource: FloodlightActivity, profileId: String): FloodlightActivity = js.native
  
  // Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
  def list(profileId: String): FloodlightActivitiesListResponse = js.native
  // Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): FloodlightActivitiesListResponse = js.native
  
  // Updates an existing floodlight activity. This method supports patch semantics.
  def patch(resource: FloodlightActivity, profileId: String, id: String): FloodlightActivity = js.native
  
  // Deletes an existing floodlight activity.
  def remove(profileId: String, id: String): Unit = js.native
  
  // Updates an existing floodlight activity.
  def update(resource: FloodlightActivity, profileId: String): FloodlightActivity = js.native
}
