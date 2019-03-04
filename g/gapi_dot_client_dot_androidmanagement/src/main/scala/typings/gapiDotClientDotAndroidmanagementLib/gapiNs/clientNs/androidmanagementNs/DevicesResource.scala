package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a device. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ],
    issueCommand: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDevicesResponse]
    ],
    operations: OperationsResource,
    patch: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, issueCommand = issueCommand, list = list, operations = operations, patch = patch)
  
    __obj.asInstanceOf[DevicesResource]
  }
}

