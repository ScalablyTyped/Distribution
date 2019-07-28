package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ResellernotifyGetwatchdetailsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ResellernotifyResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResellernotifyCollection extends js.Object {
  // Returns all the details of the watch corresponding to the reseller.
  def getwatchdetails(): ResellernotifyGetwatchdetailsResponse = js.native
  // Registers a Reseller for receiving notifications.
  def register(): ResellernotifyResource = js.native
  // Registers a Reseller for receiving notifications.
  def register(optionalArgs: js.Object): ResellernotifyResource = js.native
  // Unregisters a Reseller for receiving notifications.
  def unregister(): ResellernotifyResource = js.native
  // Unregisters a Reseller for receiving notifications.
  def unregister(optionalArgs: js.Object): ResellernotifyResource = js.native
}

