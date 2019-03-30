package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Gets one order by ID.
  def get(profileId: java.lang.String, projectId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.Order = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.OrdersListResponse = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.OrdersListResponse = js.native
}

