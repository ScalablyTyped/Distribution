package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.DynamicTargetingKey
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.DynamicTargetingKeysListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTargetingKeysCollection extends js.Object {
  // Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
  def insert(resource: DynamicTargetingKey, profileId: String): DynamicTargetingKey = js.native
  // Retrieves a list of dynamic targeting keys.
  def list(profileId: String): DynamicTargetingKeysListResponse = js.native
  // Retrieves a list of dynamic targeting keys.
  def list(profileId: String, optionalArgs: js.Object): DynamicTargetingKeysListResponse = js.native
  // Deletes an existing dynamic targeting key.
  def remove(profileId: String, objectId: String, name: String, objectType: String): Unit = js.native
}

