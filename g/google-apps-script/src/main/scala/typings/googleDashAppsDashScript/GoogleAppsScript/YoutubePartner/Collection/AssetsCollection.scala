package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.Asset
import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.AssetListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetsCollection extends js.Object {
  // Retrieves the metadata for the specified asset. Note that if the request identifies an asset that has been merged with another asset, meaning that YouTube identified the requested asset as a duplicate, then the request retrieves the merged, or synthesized, asset.
  def get(assetId: String): Asset = js.native
  // Retrieves the metadata for the specified asset. Note that if the request identifies an asset that has been merged with another asset, meaning that YouTube identified the requested asset as a duplicate, then the request retrieves the merged, or synthesized, asset.
  def get(assetId: String, optionalArgs: js.Object): Asset = js.native
  // Inserts an asset with the specified metadata. After inserting an asset, you can set its ownership data and match policy.
  def insert(resource: Asset): Asset = js.native
  // Inserts an asset with the specified metadata. After inserting an asset, you can set its ownership data and match policy.
  def insert(resource: Asset, optionalArgs: js.Object): Asset = js.native
  // Retrieves a list of assets based on asset metadata. The method can retrieve all assets or only assets owned by the content owner.
  // Note that in cases where duplicate assets have been merged, the API response only contains the synthesized asset. (It does not contain the constituent assets that were merged into the synthesized asset.)
  def list(id: String): AssetListResponse = js.native
  // Retrieves a list of assets based on asset metadata. The method can retrieve all assets or only assets owned by the content owner.
  // Note that in cases where duplicate assets have been merged, the API response only contains the synthesized asset. (It does not contain the constituent assets that were merged into the synthesized asset.)
  def list(id: String, optionalArgs: js.Object): AssetListResponse = js.native
  // Updates the metadata for the specified asset. This method supports patch semantics.
  def patch(resource: Asset, assetId: String): Asset = js.native
  // Updates the metadata for the specified asset. This method supports patch semantics.
  def patch(resource: Asset, assetId: String, optionalArgs: js.Object): Asset = js.native
  // Updates the metadata for the specified asset.
  def update(resource: Asset, assetId: String): Asset = js.native
  // Updates the metadata for the specified asset.
  def update(resource: Asset, assetId: String, optionalArgs: js.Object): Asset = js.native
}

