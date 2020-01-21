package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAccesstokenAlt
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: AnonAccesstokenAlt): Request_[js.Object]
  /** Gets a device. */
  def get(request: AnonAccesstokenAlt): Request_[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: AnonAccesstokenAlt): Request_[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: AnonAccesstokenAlt => Request_[js.Object],
    get: AnonAccesstokenAlt => Request_[Device],
    issueCommand: AnonAccesstokenAlt => Request_[Operation],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListDevicesResponse],
    operations: OperationsResource,
    patch: AnonAccesstokenAltBearertokenCallbackFields => Request_[Device]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), issueCommand = js.Any.fromFunction1(issueCommand), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[DevicesResource]
  }
}

