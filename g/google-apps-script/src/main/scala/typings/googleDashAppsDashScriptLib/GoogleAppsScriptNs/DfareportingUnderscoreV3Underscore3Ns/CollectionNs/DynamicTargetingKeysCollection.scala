package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTargetingKeysCollection extends js.Object {
  // Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.DynamicTargetingKey,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.DynamicTargetingKey = js.native
  // Retrieves a list of dynamic targeting keys.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.DynamicTargetingKeysListResponse = js.native
  // Retrieves a list of dynamic targeting keys.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.DynamicTargetingKeysListResponse = js.native
  // Deletes an existing dynamic targeting key.
  def remove(
    profileId: java.lang.String,
    objectId: java.lang.String,
    name: java.lang.String,
    objectType: java.lang.String
  ): scala.Unit = js.native
}

