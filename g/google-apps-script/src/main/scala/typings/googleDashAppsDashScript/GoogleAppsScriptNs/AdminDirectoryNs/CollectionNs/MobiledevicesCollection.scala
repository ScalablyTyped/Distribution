package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevice
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDeviceAction
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MobileDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobiledevicesCollection extends js.Object {
  // Take action on Mobile Device
  def action(resource: MobileDeviceAction, customerId: String, resourceId: String): Unit = js.native
  // Retrieve Mobile Device
  def get(customerId: String, resourceId: String): MobileDevice = js.native
  // Retrieve Mobile Device
  def get(customerId: String, resourceId: String, optionalArgs: js.Object): MobileDevice = js.native
  // Retrieve all Mobile Devices of a customer (paginated)
  def list(customerId: String): MobileDevices = js.native
  // Retrieve all Mobile Devices of a customer (paginated)
  def list(customerId: String, optionalArgs: js.Object): MobileDevices = js.native
  // Delete Mobile Device
  def remove(customerId: String, resourceId: String): Unit = js.native
}

