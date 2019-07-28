package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.CampaignList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignsCollection extends js.Object {
  // Retrieves a particular campaign for an owner.
  def get(campaignId: String): Campaign = js.native
  // Retrieves a particular campaign for an owner.
  def get(campaignId: String, optionalArgs: js.Object): Campaign = js.native
  // Insert a new campaign for an owner using the specified campaign data.
  def insert(resource: Campaign): Campaign = js.native
  // Insert a new campaign for an owner using the specified campaign data.
  def insert(resource: Campaign, optionalArgs: js.Object): Campaign = js.native
  // Retrieves a list of campaigns for an owner.
  def list(): CampaignList = js.native
  // Retrieves a list of campaigns for an owner.
  def list(optionalArgs: js.Object): CampaignList = js.native
  // Update the data for a specific campaign. This method supports patch semantics.
  def patch(resource: Campaign, campaignId: String): Campaign = js.native
  // Update the data for a specific campaign. This method supports patch semantics.
  def patch(resource: Campaign, campaignId: String, optionalArgs: js.Object): Campaign = js.native
  // Deletes a specified campaign for an owner.
  def remove(campaignId: String): Unit = js.native
  // Deletes a specified campaign for an owner.
  def remove(campaignId: String, optionalArgs: js.Object): Unit = js.native
  // Update the data for a specific campaign.
  def update(resource: Campaign, campaignId: String): Campaign = js.native
  // Update the data for a specific campaign.
  def update(resource: Campaign, campaignId: String, optionalArgs: js.Object): Campaign = js.native
}

