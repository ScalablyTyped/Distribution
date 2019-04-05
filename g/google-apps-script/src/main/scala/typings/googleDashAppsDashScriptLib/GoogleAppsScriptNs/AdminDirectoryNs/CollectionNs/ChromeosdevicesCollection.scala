package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeosdevicesCollection extends js.Object {
  // Take action on Chrome OS Device
  def action(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDeviceAction,
    customerId: java.lang.String,
    resourceId: java.lang.String
  ): scala.Unit = js.native
  // Retrieve Chrome OS Device
  def get(customerId: java.lang.String, deviceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
  // Retrieve Chrome OS Device
  def get(customerId: java.lang.String, deviceId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
  // Retrieve all Chrome OS Devices of a customer (paginated)
  def list(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevices = js.native
  // Retrieve all Chrome OS Devices of a customer (paginated)
  def list(customerId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevices = js.native
  // Move or insert multiple Chrome OS Devices to organizational unit
  def moveDevicesToOu(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsMoveDevicesToOu,
    customerId: java.lang.String,
    orgUnitPath: java.lang.String
  ): scala.Unit = js.native
  // Update Chrome OS Device. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice,
    customerId: java.lang.String,
    deviceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
  // Update Chrome OS Device. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice,
    customerId: java.lang.String,
    deviceId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
  // Update Chrome OS Device
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice,
    customerId: java.lang.String,
    deviceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
  // Update Chrome OS Device
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice,
    customerId: java.lang.String,
    deviceId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.ChromeOsDevice = js.native
}

