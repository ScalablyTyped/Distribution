package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetMatchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetMatchPolicyCollection extends js.Object {
  
  // Retrieves the match policy assigned to the specified asset by the content owner associated with the authenticated user. This information is only accessible to an owner of the asset.
  def get(assetId: String): AssetMatchPolicy = js.native
  // Retrieves the match policy assigned to the specified asset by the content owner associated with the authenticated user. This information is only accessible to an owner of the asset.
  def get(assetId: String, optionalArgs: js.Object): AssetMatchPolicy = js.native
  
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset. This method supports patch semantics.
  def patch(resource: AssetMatchPolicy, assetId: String): AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset. This method supports patch semantics.
  def patch(resource: AssetMatchPolicy, assetId: String, optionalArgs: js.Object): AssetMatchPolicy = js.native
  
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset.
  def update(resource: AssetMatchPolicy, assetId: String): AssetMatchPolicy = js.native
  // Updates the asset's match policy. If an asset has multiple owners, each owner may set its own match policy for the asset. YouTube then computes the match policy that is actually applied for the asset based on the territories where each owner owns the asset.
  def update(resource: AssetMatchPolicy, assetId: String, optionalArgs: js.Object): AssetMatchPolicy = js.native
}
