package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Campaign
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CampaignsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsCollection extends js.Object {
  
  // Gets one campaign by ID.
  def get(profileId: String, id: String): Campaign = js.native
  
  // Inserts a new campaign.
  def insert(resource: Campaign, profileId: String): Campaign = js.native
  
  // Retrieves a list of campaigns, possibly filtered. This method supports paging.
  def list(profileId: String): CampaignsListResponse = js.native
  // Retrieves a list of campaigns, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): CampaignsListResponse = js.native
  
  // Updates an existing campaign. This method supports patch semantics.
  def patch(resource: Campaign, profileId: String, id: String): Campaign = js.native
  
  // Updates an existing campaign.
  def update(resource: Campaign, profileId: String): Campaign = js.native
}
