package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Alt
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: Alt): Request[Device]
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: Alt): Request[DeviceState]
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: EnterpriseId): Request[DevicesListResponse]
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: Alt): Request[DeviceState]
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
}

