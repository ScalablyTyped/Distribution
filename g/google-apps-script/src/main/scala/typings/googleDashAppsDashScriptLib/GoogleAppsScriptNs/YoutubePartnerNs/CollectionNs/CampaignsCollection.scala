package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignsCollection extends js.Object {
  // Retrieves a particular campaign for an owner.
  def get(campaignId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Retrieves a particular campaign for an owner.
  def get(campaignId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Insert a new campaign for an owner using the specified campaign data.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Insert a new campaign for an owner using the specified campaign data.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Retrieves a list of campaigns for an owner.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.CampaignList = js.native
  // Retrieves a list of campaigns for an owner.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.CampaignList = js.native
  // Update the data for a specific campaign. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign,
    campaignId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Update the data for a specific campaign. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign,
    campaignId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Deletes a specified campaign for an owner.
  def remove(campaignId: java.lang.String): scala.Unit = js.native
  // Deletes a specified campaign for an owner.
  def remove(campaignId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Update the data for a specific campaign.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign,
    campaignId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
  // Update the data for a specific campaign.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign,
    campaignId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Campaign = js.native
}

