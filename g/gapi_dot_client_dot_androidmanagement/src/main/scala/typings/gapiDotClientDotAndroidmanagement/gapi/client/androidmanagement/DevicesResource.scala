package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAlt
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Gets a device. */
  def get(request: Anon_AccesstokenAlt): Request[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: Anon_AccesstokenAlt): Request[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAlt => Request[Device],
    issueCommand: Anon_AccesstokenAlt => Request[Operation],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListDevicesResponse],
    operations: OperationsResource,
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[Device]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), issueCommand = js.Any.fromFunction1(issueCommand), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[DevicesResource]
  }
}

