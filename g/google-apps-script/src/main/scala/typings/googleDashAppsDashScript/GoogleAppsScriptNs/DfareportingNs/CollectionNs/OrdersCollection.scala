package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Order
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OrdersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Gets one order by ID.
  def get(profileId: String, projectId: String, id: String): Order = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String): OrdersListResponse = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String, optionalArgs: js.Object): OrdersListResponse = js.native
}

