package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnershipCollection extends js.Object {
  // Retrieves the ownership data provided for the specified asset by the content owner associated with the authenticated user.
  def get(assetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
  // Retrieves the ownership data provided for the specified asset by the content owner associated with the authenticated user.
  def get(assetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
  // Provides new ownership information for the specified asset. Note that YouTube may receive ownership information from multiple sources. For example, if an asset has multiple owners, each owner might send ownership data for the asset. YouTube algorithmically combines the ownership data received from all of those sources to generate the asset's canonical ownership data, which should provide the most comprehensive and accurate representation of the asset's ownership. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
  // Provides new ownership information for the specified asset. Note that YouTube may receive ownership information from multiple sources. For example, if an asset has multiple owners, each owner might send ownership data for the asset. YouTube algorithmically combines the ownership data received from all of those sources to generate the asset's canonical ownership data, which should provide the most comprehensive and accurate representation of the asset's ownership. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
  // Provides new ownership information for the specified asset. Note that YouTube may receive ownership information from multiple sources. For example, if an asset has multiple owners, each owner might send ownership data for the asset. YouTube algorithmically combines the ownership data received from all of those sources to generate the asset's canonical ownership data, which should provide the most comprehensive and accurate representation of the asset's ownership.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
  // Provides new ownership information for the specified asset. Note that YouTube may receive ownership information from multiple sources. For example, if an asset has multiple owners, each owner might send ownership data for the asset. YouTube algorithmically combines the ownership data received from all of those sources to generate the asset's canonical ownership data, which should provide the most comprehensive and accurate representation of the asset's ownership.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.RightsOwnership = js.native
}

