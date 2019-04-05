package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignCreativeAssociationsCollection extends js.Object {
  // Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist already.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CampaignCreativeAssociation,
    profileId: java.lang.String,
    campaignId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CampaignCreativeAssociation = js.native
  // Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
  def list(profileId: java.lang.String, campaignId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CampaignCreativeAssociationsListResponse = js.native
  // Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
  def list(profileId: java.lang.String, campaignId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CampaignCreativeAssociationsListResponse = js.native
}

