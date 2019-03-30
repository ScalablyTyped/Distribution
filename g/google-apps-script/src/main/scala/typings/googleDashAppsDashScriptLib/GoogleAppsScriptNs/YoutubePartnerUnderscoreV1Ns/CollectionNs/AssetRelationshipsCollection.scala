package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetRelationshipsCollection extends js.Object {
  // Creates a relationship that links two assets.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationship
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationship = js.native
  // Creates a relationship that links two assets.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationship,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationship = js.native
  // Retrieves a list of relationships for a given asset. The list contains relationships where the specified asset is either the parent (embedding) or child (embedded) asset in the relationship.
  def list(assetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationshipListResponse = js.native
  // Retrieves a list of relationships for a given asset. The list contains relationships where the specified asset is either the parent (embedding) or child (embedded) asset in the relationship.
  def list(assetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.AssetRelationshipListResponse = js.native
  // Deletes a relationship between two assets.
  def remove(assetRelationshipId: java.lang.String): scala.Unit = js.native
  // Deletes a relationship between two assets.
  def remove(assetRelationshipId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
}

