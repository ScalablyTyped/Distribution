package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySitesCollection extends js.Object {
  // Gets one directory site by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.DirectorySite = js.native
  // Inserts a new directory site.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.DirectorySite,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.DirectorySite = js.native
  // Retrieves a list of directory sites, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.DirectorySitesListResponse = js.native
  // Retrieves a list of directory sites, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.DirectorySitesListResponse = js.native
}

