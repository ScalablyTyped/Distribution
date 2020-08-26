package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.Callback
import typings.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  var operations: OperationsResource = js.native
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Gets a device. */
  def get(request: Alt): Request[Device] = js.native
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: Alt): Request[Operation] = js.native
  /** Lists devices for a given enterprise. */
  def list(request: Callback): Request[ListDevicesResponse] = js.native
  /** Updates a device. */
  def patch(request: Fields): Request[Device] = js.native
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
  @scala.inline
  implicit class DevicesResourceOps[Self <: DevicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Device]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setIssueCommand(value: Alt => Request[Operation]): Self = this.set("issueCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListDevicesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: Fields => Request[Device]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

