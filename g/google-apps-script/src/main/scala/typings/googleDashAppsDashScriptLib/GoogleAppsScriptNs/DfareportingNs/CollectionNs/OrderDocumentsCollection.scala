package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderDocumentsCollection extends js.Object {
  // Gets one order document by ID.
  def get(profileId: java.lang.String, projectId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrderDocument = js.native
  // Retrieves a list of order documents, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrderDocumentsListResponse = js.native
  // Retrieves a list of order documents, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrderDocumentsListResponse = js.native
}

