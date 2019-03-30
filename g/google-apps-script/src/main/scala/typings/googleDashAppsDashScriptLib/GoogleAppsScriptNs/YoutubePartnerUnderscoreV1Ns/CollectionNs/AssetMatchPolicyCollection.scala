package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetMatchPolicyCollection extends js.Object {
  // Retrieves the match policy assigned to the specified asset by the content owner associated with the authenticated user. This information is only accessible to an owner of the asset.
  def get(assetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
  // Retrieves the match policy assigned to the specified asset by the content owner associated with the authenticated user. This information is only accessible to an owner of the asset.
  def get(assetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetMatchPolicy = js.native
}

