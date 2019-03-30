package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetsCollection extends js.Object {
  // Retrieves the metadata for the specified asset. Note that if the request identifies an asset that has been merged with another asset, meaning that YouTube identified the requested asset as a duplicate, then the request retrieves the merged, or synthesized, asset.
  def get(assetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Retrieves the metadata for the specified asset. Note that if the request identifies an asset that has been merged with another asset, meaning that YouTube identified the requested asset as a duplicate, then the request retrieves the merged, or synthesized, asset.
  def get(assetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Inserts an asset with the specified metadata. After inserting an asset, you can set its ownership data and match policy.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Inserts an asset with the specified metadata. After inserting an asset, you can set its ownership data and match policy.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Retrieves a list of assets based on asset metadata. The method can retrieve all assets or only assets owned by the content owner.
  // Note that in cases where duplicate assets have been merged, the API response only contains the synthesized asset. (It does not contain the constituent assets that were merged into the synthesized asset.)
  def list(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetListResponse = js.native
  // Retrieves a list of assets based on asset metadata. The method can retrieve all assets or only assets owned by the content owner.
  // Note that in cases where duplicate assets have been merged, the API response only contains the synthesized asset. (It does not contain the constituent assets that were merged into the synthesized asset.)
  def list(id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetListResponse = js.native
  // Updates the metadata for the specified asset. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Updates the metadata for the specified asset. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Updates the metadata for the specified asset.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset,
    assetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
  // Updates the metadata for the specified asset.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset,
    assetId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Asset = js.native
}

