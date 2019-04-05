package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Gets one order by ID.
  def get(profileId: java.lang.String, projectId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Order = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrdersListResponse = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrdersListResponse = js.native
}

