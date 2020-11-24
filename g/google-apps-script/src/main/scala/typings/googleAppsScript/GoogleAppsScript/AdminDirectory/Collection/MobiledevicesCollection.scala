package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDevice
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDeviceAction
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
