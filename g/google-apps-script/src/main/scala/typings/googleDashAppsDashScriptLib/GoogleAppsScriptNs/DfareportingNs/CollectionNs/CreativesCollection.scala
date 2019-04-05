package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesCollection extends js.Object {
  // Gets one creative by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative = js.native
  // Inserts a new creative.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative = js.native
  // Retrieves a list of creatives, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativesListResponse = js.native
  // Retrieves a list of creatives, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativesListResponse = js.native
  // Updates an existing creative. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative,
    profileId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative = js.native
  // Updates an existing creative.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Creative = js.native
}

