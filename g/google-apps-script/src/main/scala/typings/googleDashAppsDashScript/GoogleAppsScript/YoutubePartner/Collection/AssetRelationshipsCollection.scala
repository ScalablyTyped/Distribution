package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.AssetRelationship
import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.AssetRelationshipListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetRelationshipsCollection extends js.Object {
  // Creates a relationship that links two assets.
  def insert(resource: AssetRelationship): AssetRelationship = js.native
  // Creates a relationship that links two assets.
  def insert(resource: AssetRelationship, optionalArgs: js.Object): AssetRelationship = js.native
  // Retrieves a list of relationships for a given asset. The list contains relationships where the specified asset is either the parent (embedding) or child (embedded) asset in the relationship.
  def list(assetId: String): AssetRelationshipListResponse = js.native
  // Retrieves a list of relationships for a given asset. The list contains relationships where the specified asset is either the parent (embedding) or child (embedded) asset in the relationship.
  def list(assetId: String, optionalArgs: js.Object): AssetRelationshipListResponse = js.native
  // Deletes a relationship between two assets.
  def remove(assetRelationshipId: String): Unit = js.native
  // Deletes a relationship between two assets.
  def remove(assetRelationshipId: String, optionalArgs: js.Object): Unit = js.native
}

