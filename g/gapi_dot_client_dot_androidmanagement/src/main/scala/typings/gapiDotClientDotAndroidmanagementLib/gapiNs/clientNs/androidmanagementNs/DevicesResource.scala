package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a device. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /**
               * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
               * of the command.
               */
  def issueCommand(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: gapiDotClientDotAndroidmanagementLib.Anon_ParentAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_NameAccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Device]
}

