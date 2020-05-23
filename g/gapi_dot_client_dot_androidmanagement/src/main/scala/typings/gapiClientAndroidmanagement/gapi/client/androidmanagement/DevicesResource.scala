package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.Callback
import typings.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: Alt): Request[js.Object]
  /** Gets a device. */
  def get(request: Alt): Request[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: Alt): Request[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: Callback): Request[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: Fields): Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: Alt => Request[js.Object],
    get: Alt => Request[Device],
    issueCommand: Alt => Request[Operation],
    list: Callback => Request[ListDevicesResponse],
    operations: OperationsResource,
    patch: Fields => Request[Device]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), issueCommand = js.Any.fromFunction1(issueCommand), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[DevicesResource]
  }
}

