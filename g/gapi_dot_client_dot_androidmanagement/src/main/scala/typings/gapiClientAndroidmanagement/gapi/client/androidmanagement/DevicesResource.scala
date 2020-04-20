package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAlt
import typings.gapiClientAndroidmanagement.AnonCallback
import typings.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets a device. */
  def get(request: AnonAlt): Request_[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: AnonAlt): Request_[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: AnonCallback): Request_[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: AnonFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Device],
    issueCommand: AnonAlt => Request_[Operation],
    list: AnonCallback => Request_[ListDevicesResponse],
    operations: OperationsResource,
    patch: AnonFields => Request_[Device]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), issueCommand = js.Any.fromFunction1(issueCommand), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[DevicesResource]
  }
}

