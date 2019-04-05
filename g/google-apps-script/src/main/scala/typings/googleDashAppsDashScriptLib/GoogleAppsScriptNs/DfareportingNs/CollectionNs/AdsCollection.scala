package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsCollection extends js.Object {
  // Gets one ad by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad = js.native
  // Inserts a new ad.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad = js.native
  // Retrieves a list of ads, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdsListResponse = js.native
  // Retrieves a list of ads, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdsListResponse = js.native
  // Updates an existing ad. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad,
    profileId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad = js.native
  // Updates an existing ad.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Ad = js.native
}

