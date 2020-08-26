package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Alt
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: Alt): Request[Device] = js.native
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: Alt): Request[DeviceState] = js.native
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: EnterpriseId): Request[DevicesListResponse] = js.native
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: Alt): Request[DeviceState] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    get: Alt => Request[Device],
    getState: Alt => Request[DeviceState],
    list: EnterpriseId => Request[DevicesListResponse],
    setState: Alt => Request[DeviceState]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getState = js.Any.fromFunction1(getState), list = js.Any.fromFunction1(list), setState = js.Any.fromFunction1(setState))
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
    def setGet(value: Alt => Request[Device]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: Alt => Request[DeviceState]): Self = this.set("getState", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EnterpriseId => Request[DevicesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetState(value: Alt => Request[DeviceState]): Self = this.set("setState", js.Any.fromFunction1(value))
  }
  
}

