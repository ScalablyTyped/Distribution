package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobiledevicesCollection extends js.Object {
  // Take action on Mobile Device
  def action(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDeviceAction,
    customerId: java.lang.String,
    resourceId: java.lang.String
  ): scala.Unit = js.native
  // Retrieve Mobile Device
  def get(customerId: java.lang.String, resourceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevice = js.native
  // Retrieve Mobile Device
  def get(customerId: java.lang.String, resourceId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevice = js.native
  // Retrieve all Mobile Devices of a customer (paginated)
  def list(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevices = js.native
  // Retrieve all Mobile Devices of a customer (paginated)
  def list(customerId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevices = js.native
  // Delete Mobile Device
  def remove(customerId: java.lang.String, resourceId: java.lang.String): scala.Unit = js.native
}

